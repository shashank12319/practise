package com.ayushi;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String url = "harnek.app.com?name=harsh&age=38&city=delhi&country=india&company=abc";
        List<Params> params = Params.parseURL(url);
        for (Params param : params) {
            System.out.println(param.getKey() + ": " + param.getValue());
        }
    }
}