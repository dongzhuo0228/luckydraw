package com.example.luckydraw;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.logging.Logger;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootElkApplicationTests {

    @Test
    public void contextLoads() {
    }

    private Logger logger = Logger.getLogger("SpringbootElkApplicationTests");

    @Test
    public void test() throws Exception {

        for(int i=0;i<100;i++) {
            logger.info("输出info  ");
            logger.debug("输出debug+skkkw嗡嗡嗡kw");
            logger.error("输出error  嗡嗡嗡我");
        }
    }


}