package com.sightline.prestoapp.configuration;

public class PrestoClient {
    private static String user;
    private static String password;
    private static String SSL;
    private static String host;
    private static String port;
    private static String DBName;
    private static String catalog;

    public static String getUser() {
        return user;
    }

    public static String getDBName() {
        return DBName;
    }

    public static String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        PrestoClient.catalog = catalog;
    }

    public void setDBName(String DBName) {
        PrestoClient.DBName = DBName;
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
