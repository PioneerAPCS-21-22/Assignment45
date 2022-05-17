package com.mycompany.app;

public class Texting {
    private String text;

    public Texting(String text) {
        this.text = text;
    }

    public String repeatString(int n) {
        if(n < 0) {
            return null;
        }
        
        String str = "";
        for(int i = 0; i < n; i++) {
            str += this.text + " ";
        }

        return str;
    }
}

