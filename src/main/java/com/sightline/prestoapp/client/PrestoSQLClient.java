package com.sightline.prestoapp.client;

import com.facebook.presto.jdbc.internal.okhttp3.Connection;
import com.sightline.prestoapp.configuration.PrestoAppConfiguration;
import com.sightline.prestoapp.configuration.PrestoClient;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class PrestoSQLClient {
    private Connection connection;
    private PrestoAppConfiguration configuration;

    public PrestoSQLClient(PrestoAppConfiguration config) {
        if (connection == null) {
            configuration = config;
            String base_url = "jdbc:presto://"
                    + config.getPrestoClient().getHost() + ":"
                    + config.getPrestoClient().getPort() + "/";

            Properties properties = new Properties();
            properties.setProperty("user", "test");
            properties.setProperty("password", "secret");
            properties.setProperty("SSL", "true");

            try {
                connection = (Connection) DriverManager.getConnection(base_url, properties);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public Connection getPrestoConnection() {
        return connection;
    }
}
