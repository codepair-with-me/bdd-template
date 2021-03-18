package com.codepair;

import org.springframework.stereotype.Component;

@Component
public class TemplateImpl {

    public String getResponse(String request) {
        if ( "Hello".equals(request)) {
            return "Hi";
        } else if ("Bye".equals(request)) {
            return "Bye Bye!!";
        } else {
            return "Undefined";
        }
    }
}
