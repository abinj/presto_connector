package com.sightline.prestoapp.application;

import com.facebook.presto.jdbc.internal.okhttp3.Connection;
import com.sightline.prestoapp.client.PrestoSQLClient;
import com.sightline.prestoapp.configuration.PrestoAppConfiguration;
import org.yaml.snakeyaml.Yaml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class MainApplication {

    public static void main(String[] args) throws Exception {
        Yaml yaml = new Yaml();
        String yaml_path = "config.yaml";

        if (args != null && args.length != 0) {
            for (int i=0; i< args.length; i++) {
                if (args[i].equals("--config") || args[i].equals("-c")) {
                    yaml_path = args.length > i+1 ? args[i + 1]: "";
                }
            }
        }

        try {
            InputStream fileInputStream = new FileInputStream(yaml_path);
            PrestoAppConfiguration config = yaml.loadAs(fileInputStream, PrestoAppConfiguration.class);
            PrestoSQLClient prestoSQLClient= new PrestoSQLClient(config);
            // Establish presto jdbc connection
            Connection prestoConnection = prestoSQLClient.getPrestoConnection();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
