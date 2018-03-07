package com.xceder.demo.CTPImp;


import com.xceder.ctp.thostftdcuserapidatatype.ThostFtdcUserApiDataTypeLibrary;
import com.xceder.ctp.thostftdcuserapistruct.*;
import com.xceder.demo.bean.UserInfo;
import com.xceder.jctp.trader.JCTPTraderApi;
import com.xceder.jctp.trader.JCTPTraderSpi;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: xiaopan
 * Date: 2018-03-07
 * Time: 下午1:24
 */
public class MyTraderSpi extends JCTPTraderSpi {
    JCTPTraderApi traderApi;
    int nRequestID = 0;

    public MyTraderSpi(JCTPTraderApi traderApi) {
        this.traderApi = traderApi;
    }

    public void onFrontConnected() {
        System.out.println("前置机连接");
        CThostFtdcReqUserLoginField userLoginField = new CThostFtdcReqUserLoginField();
        userLoginField.setBrokerID(UserInfo.BROKERID);
        userLoginField.setUserID(UserInfo.USERID);
        userLoginField.setPassword(UserInfo.PASSWORD);
        traderApi.reqUserLogin(userLoginField, 112);
    }

    @Override
    public void onRspUserLogin(CThostFtdcRspUserLoginField pRspUserLogin,
                               CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
        if(pRspInfo.getErrorID()==0){
            System.out.println("登陆成功");
            //发送结算结果确认报文
            CThostFtdcSettlementInfoConfirmField infoConfirmField=new CThostFtdcSettlementInfoConfirmField();
            infoConfirmField.setBrokerID(UserInfo.BROKERID);
            infoConfirmField.setInvestorID(UserInfo.USERID);
            traderApi.reqSettlementInfoConfirm(infoConfirmField, 120);
        }else{
            System.out.println("登录失败");
        }
    }

    @Override
    public void onRtnOrder(CThostFtdcOrderField pOrder) {
        //System.out.println(pOrder.getInvestorID()+"报单已录入");

    }

    /**
     * 注意了：下单回调函数中，下单成功后是无回调的，失败了才有回调
     * System.out.println("下单成功")根本不可能执行
     */
    @Override
    public void onRspOrderInsert(CThostFtdcInputOrderField pInputOrder,
                                 CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
        System.out.println("下单回调："+pRspInfo.getErrorID());
        if(pRspInfo.getErrorID()==0){
            System.out.println("下单成功");
        }else{
            System.out.println("下单失败："+pRspInfo.getErrorMsg());
        }
    }

    @Override
    public void onRspQryInvestorPositionDetail(CThostFtdcInvestorPositionDetailField pInvestorPositionDetail,CThostFtdcRspInfoField pRspInfo,int nRequestID,boolean bIsLast){
        System.out.println("有持仓明细反映");
        //得到开仓价
        System.out.println(pInvestorPositionDetail.getOpenPrice());
    }
    @Override
    public void onRspSettlementInfoConfirm(CThostFtdcSettlementInfoConfirmField pSettlementInfoConfirm, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
        System.out.println("结算确认完成");
        CThostFtdcInputOrderField inputOrderField=new CThostFtdcInputOrderField();
        //期货公司代码
        inputOrderField.setBrokerID(UserInfo.BROKERID);
        //投资者代码
        inputOrderField.setInvestorID(UserInfo.USERID);
        // 合约代码
        inputOrderField.setInstrumentID("IF1303");
        ///报单引用
        inputOrderField.setOrderRef("000000000001");
        // 报单价格条件
        inputOrderField.setOrderPriceType(ThostFtdcUserApiDataTypeLibrary.THOST_FTDC_OPT_LimitPrice);
        // 买卖方向
        inputOrderField.setDirection(ThostFtdcUserApiDataTypeLibrary.THOST_FTDC_D_Buy);
        // 组合开平标志
        inputOrderField.setCombOffsetFlag("0");
        // 组合投机套保标志
        inputOrderField.setCombHedgeFlag("1");
        // 价格
        inputOrderField.setLimitPrice(2610);
        // 数量
        inputOrderField.setVolumeTotalOriginal(1);
        // 有效期类型
        inputOrderField.setTimeCondition(ThostFtdcUserApiDataTypeLibrary.THOST_FTDC_TC_GFD);
        // GTD日期
        inputOrderField.setGTDDate("");
        // 成交量类型
        inputOrderField.setVolumeCondition(ThostFtdcUserApiDataTypeLibrary.THOST_FTDC_VC_AV);
        // 最小成交量
        inputOrderField.setMinVolume(0);
        // 触发条件
        inputOrderField.setContingentCondition(ThostFtdcUserApiDataTypeLibrary.THOST_FTDC_CC_Immediately);
        // 止损价
        inputOrderField.setStopPrice(0);
        // 强平原因
        inputOrderField.setForceCloseReason(ThostFtdcUserApiDataTypeLibrary.THOST_FTDC_FCC_NotForceClose);
        // 自动挂起标志
        inputOrderField.setIsAutoSuspend(0);
        traderApi.reqOrderInsert(inputOrderField, 115);
        System.out.println("下单请求已执行");
    }
}
