package com.study.swagger;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SwaggerApplicationTests {

    Logger logger = LoggerFactory.getLogger(SwaggerApplicationTests.class);

    @Test
    public void contextLoads() {
        logger.trace("这是trace日志信息...");
        logger.debug("这是debug日志信息...");
        logger.info("这是info日志信息...");
        logger.warn("这是warn日志信息...");
        logger.error("这是error日志信息...");


    }

}
