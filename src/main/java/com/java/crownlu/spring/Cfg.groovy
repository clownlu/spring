package com.java.crownlu.spring

import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

/**
 * Created by crownlu on 17/9/25.
 */
@Configuration
//@Import({Cfg.C1.class, Cfg.C2.class})
class Cfg {

    @Configuration
    @ComponentScan("com.java.crownlu.spring.service")
    static class C1 {

    }

    @Configuration
    @ComponentScan("com.java.crownlu.spring.mvc")
    static class C2 {

    }
}
