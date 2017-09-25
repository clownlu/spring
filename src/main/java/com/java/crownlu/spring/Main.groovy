package com.java.crownlu.spring

import com.java.crownlu.spring.mvc.RequestDispatcher
import com.java.crownlu.spring.service.CityService
import org.springframework.context.annotation.AnnotationConfigApplicationContext

/**
 * Created by crownlu on 17/9/25.
 */
class Main {
    static def main(def args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Cfg.class)

        CityService cityService = context.getBean(CityService.class)
        println(cityService.getCityNameById(1))

        println(context.getBean(RequestDispatcher.class).getCityName(10))
        context.close()
    }
}
