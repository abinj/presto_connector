package com.sightline.prestoapp.configuration;

public class PrestoClient {
    private static String user;
    private static String password;
    private static String SSL;
    private static String host;
    private static String port;

    public static String getUser() {
        return user;
    }

    public void setUser(String user) {
        PrestoClient.user = user;
    }

    public static String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        PrestoClient.password = password;
    }

    public static String getSSL() {
        return SSL;
    }

    public void setSSL(String SSL) {
        PrestoClient.SSL = SSL;
    }

    public static String getHost() {
        return host;
    }

    public void setHost(String host) {
        PrestoClient.host = host;
    }

    public static String getPort() {
        return port;
    }

    public void setPort(String port) {
        PrestoClient.port = port;
    }
}
