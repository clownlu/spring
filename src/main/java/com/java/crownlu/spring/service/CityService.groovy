package com.java.crownlu.spring.service

import org.springframework.stereotype.Service

/**
 * Created by crownlu on 17/9/25.
 */
@Service
class CityService {
    static def m = [1: "北京", 10: "上海", 40: "西安"]

    public String getCityNameById(int id) {
        m[id]
    }
}
