package com.acme;

public class Example {
    public String test ;
    private String test2;
    protected String test3;

    public Example(String test, String test2, String test3) {
        this.test = test;
        this.test2 = test2;
        this.test3 = test3;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public String getTest2() {
        return test2;
    }

    public void setTest2(String test2) {
        this.test2 = test2;
    }

    public String getTest3() {
        return test3;
    }

    public void setTest3(String test3) {
        this.test3 = test3;
    }
}
