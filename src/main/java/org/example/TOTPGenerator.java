package org.example;


import com.amdelamar.jotp.OTP;
import com.amdelamar.jotp.type.Type;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

/**
 * 用于国内不支持2FA多因子认证，方便普通人员用于验证码的生成
 *
 */
public class TOTPGenerator {
    public static void main(String[] args) throws IOException, NoSuchAlgorithmException, InvalidKeyException {

        String hexTime = OTP.timeInHex(System.currentTimeMillis(), 30);
        String code = OTP.create("FN45EHHRJKDMVIHC", hexTime, 6, Type.TOTP);
        System.out.println(code);
    }
}