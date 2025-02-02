package com.zhuweitung.signin;

import lombok.Getter;

/**
 * @author Junzhou Liu
 * @create 2020/10/21 19:57
 */
@Getter
public class ServerVerify {

    private final static ServerVerify SERVER_VERIFY = new ServerVerify();
    private static String FTKEY = null;

    public static void verifyInit(String ftKey) {
        ServerVerify.FTKEY = ftKey;
    }

    public static String getFtkey() {
        return FTKEY;
    }

    public static ServerVerify getInstance() {
        return SERVER_VERIFY;
    }
}
