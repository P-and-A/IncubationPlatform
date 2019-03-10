package com.incubationplatform.common;

import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author liaochaofan
 * @date 2019/3/10 20:24
 */
public class MyPasswordEncoder implements PasswordEncoder {
    @Override
    public String encode(CharSequence charSequence) {
        return charSequence.toString();
    }

    @Override
    public boolean matches(CharSequence charSequence, String s) {
        return s.equals(charSequence.toString());
    }
}
