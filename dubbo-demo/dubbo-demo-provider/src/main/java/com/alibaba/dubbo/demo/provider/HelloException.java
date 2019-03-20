package com.alibaba.dubbo.demo.provider;

public class HelloException extends RuntimeException {

    public HelloException() {
    }

    public HelloException(String message) {
        super(message);
    }

}
