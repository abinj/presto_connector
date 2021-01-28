package com.sightline.prestoapp.client;

import com.facebook.presto.jdbc.PrestoConnection;
import com.facebook.presto.jdbc.PrestoDriver;
import com.facebook.presto.jdbc.internal.okhttp3.Connection;
import com.sightline.prestoapp.configuration.PrestoAppConfiguration;
import com.sightline.prestoapp.configuration.PrestoClient;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class PrestoSQLClient {
    private PrestoConnection connection;

    public PrestoSQLClient(PrestoAppConfiguration config) {
        if (connection == null) {
            String base_url = "jdbc:presto://"
                    + config.getPrestoClient().getHost() + ":"
                    + config.getPrestoClient().getPort() + "/"
                    + config.getPrestoClient().getCatalog() + "/"
                    + config.getPrestoClient().getDBName();

            Properties properties = new Properties();
            properties.setProperty("user", config.getPrestoClient().getUser());
//            properties.setProperty("password", config.getPrestoClient().getPassword());
//            properties.setProperty("SSL", config.getPrestoClient().getSSL());

                    try {
                        connection = (PrestoConnection) DriverManager.getConnection(base_url, properties);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
        }
    }

    public PrestoConnection getPrestoConnection() {
        return connection;
    }
}
