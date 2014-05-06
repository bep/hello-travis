package com.bepsays.travis.support;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * Just a simple controller doing nothing sensible ...
 *
 * @author bep
 * @since 2014-05-03
 */
@RestController
class HelloTravis {

    @RequestMapping("/")
    String hey() {
        return "Hey, Travis!";
    }

}
