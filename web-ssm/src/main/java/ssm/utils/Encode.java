package ssm.utils;

import sun.misc.BASE64Encoder;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by Administrator on 2017/11/20 0020.
 */
public class Encode {
    public static String EncoderByMD5(String str) throws Exception{
        MessageDigest md5=MessageDigest.getInstance("MD5");
        BASE64Encoder base64Encoder=new BASE64Encoder();
        String newStr=base64Encoder.encode(md5.digest(str.getBytes("utf-8")));
        return newStr;
    }
}
