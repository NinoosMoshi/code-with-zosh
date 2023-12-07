package com.ninos.util;

import org.apache.commons.lang3.RandomStringUtils;

public class UserCode {
    public static String getCode() {
//        return UUID.randomUUID().toString();
        return RandomStringUtils.randomAlphanumeric(5).toUpperCase();
    }


}