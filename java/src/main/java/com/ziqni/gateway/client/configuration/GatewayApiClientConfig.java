/*
 * Copyright (c) 2022. ZIQNI LTD registered in England and Wales, company registration number-09693684
 */
package com.ziqni.gateway.client.configuration;

import com.ziqni.gateway.client.util.ConfigurationLoader;

import java.util.Optional;

public abstract class GatewayApiClientConfig {

    private static Boolean loaded = false;

    private static String gatewayClientServerBasePath;
    private static String gatewayClientServerHost;
    private static Integer gatewayClientServerPort;
    private static String gatewayClientServerScheme;

    private static String gatewayClientApiKey;
    private static String gatewayClientSpaceName;

    private static boolean isWebsocket;

    public static void load() {
        if (loaded) return;

        gatewayClientServerBasePath = ConfigurationLoader.getParameter("gateway.client.base.path").get();
        gatewayClientServerHost = ConfigurationLoader.getParameter("gateway.client.server.host").get();
        gatewayClientServerPort = Integer.valueOf(ConfigurationLoader.getParameter("gateway.client.server.port").get());
        gatewayClientServerScheme = ConfigurationLoader.getParameter("gateway.client.server.scheme").get();

        var isValidScheme = gatewayClientServerScheme.equals("http") || gatewayClientServerScheme.equals("https")
                || gatewayClientServerScheme.equals("ws") || gatewayClientServerScheme.equals("wss");

        if(!isValidScheme)
            throw new RuntimeException("Invalid scheme " + gatewayClientServerScheme + ". Valid schemes are http, https, ws, wss");

        isWebsocket = gatewayClientServerScheme.equals("ws") || gatewayClientServerScheme.equals("wss");

        gatewayClientApiKey = ConfigurationLoader.getParameter("gateway.client.api.key").get();
        gatewayClientSpaceName = ConfigurationLoader.getParameter("gateway.client.spacename").get();

        loaded = true;
    }

    public static String getGatewayClientServerBasePath() {
        load();
        return gatewayClientServerBasePath;
    }

    public static String getGatewayClientServerHost() {
        load();
        return gatewayClientServerHost;
    }

    public static Integer getGatewayClientServerPort() {
        load();
        return gatewayClientServerPort;
    }

    public static String getGatewayClientServerScheme() {
        load();
        return gatewayClientServerScheme;
    }

    public static boolean isWebsocket() {
        load();
        return isWebsocket;
    }


    public static String getGatewayClientApiKey() {
        load();
        return gatewayClientApiKey;
    }

    public static String getGatewayClientSpaceName() {
        load();
        return gatewayClientSpaceName;
    }

    public static Optional<String> getByName(String parameterName) {
        load();
        return ConfigurationLoader.getParameter(parameterName);
    }

}
