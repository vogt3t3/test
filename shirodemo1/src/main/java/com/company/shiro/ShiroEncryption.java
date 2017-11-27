package com.company.shiro;

import org.apache.shiro.codec.Base64;
import org.apache.shiro.crypto.hash.Md5Hash;

/**
 * Created by Administrator on 2017/11/22 0022.
 */
public class ShiroEncryption {
    public static String encBase64(String originStr){
        return Base64.encodeToString(originStr.getBytes());
    }
    public  static String decBase64(String cryptogram){
        return Base64.decodeToString(cryptogram);
    }
    public static String simpleMD5(String originStr){
        return new Md5Hash(originStr).toString();
    }
    public static String encMD5(String originStr) {
        // 防止md5碰撞（例如：http://www.cmd5.com/）
        // 盐值
        String salt = Base64.encodeToString("com.company.project".getBytes());
        System.out.println("salt:"+salt);
        return new Md5Hash(originStr, salt).toString();
    }

    // MD5超级加密（加密速度比较慢）
    public static String superMD5(String originStr) {
        // 盐值
        String salt = Base64.encodeToString("com.company.project".getBytes());
        // 加密次数
        int hashIterations = 1000;
        return new Md5Hash(originStr, salt, hashIterations).toString();
    }

    public static void main(String[] args) {
        String originStr = "123456";
        System.out.println("Base64 encode:"+encBase64(originStr));
        System.out.println("Base64 decode:"+decBase64("aGVsbG8xMjM0NTY="));

        //可以通过MD5碰撞解密
        System.out.println("Simple MD5:"+simpleMD5(originStr));

        long start1 = System.currentTimeMillis();
        System.out.println("add salt MD5:"+encMD5(originStr));
        long end1 = System.currentTimeMillis();
        System.out.println("add salt MD5 cost time:"+(end1-start1)+"ms");

        long start2 = System.currentTimeMillis();
        System.out.println("super MD5:"+superMD5(originStr));
        long end2 = System.currentTimeMillis();
        System.out.println("super MD5 cost time:"+(end2-start2)+"ms");
    }
}
