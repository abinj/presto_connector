package com.sightline.prestoapp.configuration;

public class PrestoAppConfiguration {
    private static PrestoClient prestoClient;

    public static PrestoClient getPrestoClient() {
        return prestoClient;
    }

    public void setPrestoClient(PrestoClient prestoClient) {
        PrestoAppConfiguration.prestoClient = prestoClient;
    }
}
