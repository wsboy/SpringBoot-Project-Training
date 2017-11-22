package com.westboy.sell;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author: wangpengbo
 * @date: 2017/11/16
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest {

    //private final Logger logger = LoggerFactory.getLogger(LoggerTest.class);

    @Test
    public void test1() {
        //logger.debug("debug...");
        //logger.info("info...");
        //logger.error("error...");
        log.debug("");
        log.info("info...");
        log.error("error...");

        String name = "westboy";
        String password = "123456";

        log.info("name:{},password:{}", name, password);
    }
}
