package com.example.demo.part1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述：
 *
 * @author qimeng
 * @createTime 2019年10月14日 17:05:00
 */
@RequestMapping("/test")
@RestController
public class Test {

    @RequestMapping
    public String test() {
        return "success";
    }
}
