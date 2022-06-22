/*
 * Copyright (c) 2022. ZIQNI LTD registered in England and Wales, company registration number-09693684
 */
package com.ziqni.gateway.client.ws;

import com.ziqni.gateway.client.configuration.GatewayApiClientConfig;

public class WsAddress {

    final String address;

    public WsAddress(){
        StringBuilder sb = new StringBuilder();
        sb.append(GatewayApiClientConfig.getGatewayClientServerScheme());
        sb.append("://");
        sb.append(GatewayApiClientConfig.getGatewayClientServerHost());
        if(GatewayApiClientConfig.getGatewayClientServerPort() != null && (GatewayApiClientConfig.getGatewayClientServerPort() != 80 || GatewayApiClientConfig.getGatewayClientServerPort() != 443))
            sb.append(":").append(GatewayApiClientConfig.getGatewayClientServerPort());
        sb.append("/ws");

        this.address = sb.toString();
    }

    public String getAddress() {
        return address;
    }
}
