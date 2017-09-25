package com.java.crownlu.spring.mvc

import com.java.crownlu.spring.service.CityService
import org.springframework.stereotype.Controller

import javax.annotation.Resource

/**
 * Created by crownlu on 17/9/25.
 */
@Controller
class RequestDispatcher {

    @Resource
    CityService cityService

    public String getCityName(int ci) {
        cityService.getCityNameById(ci)
    }
}
