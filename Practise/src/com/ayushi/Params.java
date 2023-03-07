package com.ayushi;

import java.util.ArrayList;
import java.util.List;

public  class Params {
    private String key;
    private String value;

    public Params(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public static List<Params> parseURL(String s) {
        List<Params> params = new ArrayList<>();
        String[] parts = s.split("\\?");
        if (parts.length != 2) {
            return params;
        }
        String[] keyValuePairs = parts[1].split("&");
        for (String pair : keyValuePairs) {
            String[] keyValue = pair.split("=");
            if (keyValue.length == 2) {
                params.add(new Params(keyValue[0], keyValue[1]));
            }
        }
        return params;
    }
}



