package com.chenlong.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author chenlong
 * @version 1.0
 * @description
 * @date
 */
public class Test01 {
    public static void main(String[] args) {
        Logger logger = LogManager.getLogger();
        logger.info("测试log4j {}",11111);
        logger.error("错误");
    }
}
