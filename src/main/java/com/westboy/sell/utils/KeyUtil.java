package com.westboy.sell.utils;

import java.util.Random;

/**
 * @author: wangpengbo
 * @date: 2017/11/20
 */
public class KeyUtil {

    /**
     * 生成唯一的主键
     * 格式：时间+六位随机数
     */
    public static synchronized String generateUniqueKey() {
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;
        return String.valueOf(System.currentTimeMillis() + number);
    }
}
