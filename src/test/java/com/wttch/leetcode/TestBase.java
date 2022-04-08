package com.wttch.leetcode;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class TestBase<T> {
    @SuppressWarnings("unchecked")
    public T solution() {
        var type = this.getClass().getGenericSuperclass();
        if(type instanceof ParameterizedType t) {
            Type[] types = t.getActualTypeArguments();
            if(types.length == 1) {
                try {
                    return (T) Class.forName(types[0].getTypeName()).getConstructor().newInstance();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        throw new RuntimeException("");
    }
}
