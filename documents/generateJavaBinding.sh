#!/usr/bin/env bash

output=../src/main/java
targetFolder=${output}/com/xceder/connector/CTP/api
libPath=./current

echo "remove files: ${targetFolder}/*.java"

rm -rf ${targetFolder}

options="-preferJavac -wcharAsShort -preferJavac -mode Directory -runtime BridJ -arch linux_x64 -f -limitComments -skipLibraryInstance -direct"

java  -cp "./jna/*" com.ochafik.lang.jnaerator.JNAerator -o ${output} -package "com.xceder.CTP.api.market" ${options} -library Thostmduserapi ${libPath}/ThostFtdcMdApi.h ${libPath}/thostmduserapi.so

java  -cp "./jna/*" com.ochafik.lang.jnaerator.JNAerator -o ${output} -package "com.xceder.CTP.api.trade" ${options}  -library Thosttraderapi ${libPath}/ThostFtdcTraderApi.h ${libPath}/thosttraderapi.so



