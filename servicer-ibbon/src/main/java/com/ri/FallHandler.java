package com.ri;

import com.netflix.ribbon.hystrix.FallbackHandler;
import rx.Observable;

import java.util.Map;

public class FallHandler implements FallbackHandler {
    @Override
    public Observable getFallback(com.netflix.hystrix.HystrixInvokableInfo hystrixInvokableInfo, Map map) {
        return null;
    }
}
