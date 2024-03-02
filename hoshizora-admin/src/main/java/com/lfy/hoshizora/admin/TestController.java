package com.lfy.hoshizora.admin;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:feiyang
 * @Date:10/27/2023 3:16 PM
 */
@Slf4j
@RestController
public class TestController {


    @RequestMapping("/testSpring")
    public String testSpring() {
        log.info("test logback");
        return "测试成功";
    }

}
