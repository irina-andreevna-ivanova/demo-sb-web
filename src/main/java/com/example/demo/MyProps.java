package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 10/3/2018.
 * Project: demo
 * *******************************
 */
@Component
@ConfigurationProperties("a.b.c")
public class MyProps {
    String pP1;
    String p2;
    String p3;

    @Deprecated
    public String getP2() {
        return p2;
    }

    public void setP2(String p2) {
        this.p2 = p2;
    }

    @Deprecated
    public String getP3() {
        return p3;
    }

    //@Deprecated
    public void setP3(String p3) {
        this.p3 = p3;
    }

    public String getPP1() {
        return pP1;
    }

    public void setPP1(String pP1) {
        this.pP1 = pP1;
    }
}
