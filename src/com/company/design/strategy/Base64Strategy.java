package com.company.design.strategy;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * Created by mileNote on 2021-05-15
 * Blog : https://milenote.tistory.com
 * Github : https://github.com/SimKyunam
 */
public class Base64Strategy implements EncodingStrategy{
    @Override
    public String encode(String text) {
        return Base64.getEncoder().encodeToString(text.getBytes());
    }
}
