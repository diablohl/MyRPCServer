package com.hl.common.utils;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

/**
 * 反射工具类
 */
public class ReflectionUtils {

    /**
     * 根据class创建对象
     * @param classzz
     * @param <T> 对象类型
     * @return
     */
    public   static <T> T  newInstance(Class<T> classzz){
        try {
            return classzz.newInstance();
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    /**
     * 获取所有公共方法
     * @param classzz
     * @return
     */
    public static Method[] getPublicMethod(Class classzz){
        Method[] methods = classzz.getDeclaredMethods();
        List<Method> pmethod = new ArrayList<>();
        for (Method method : methods) {
            if (Modifier.isPublic(method.getModifiers())) {
                pmethod.add(method);
            }
        }
        return pmethod.toArray(new Method[0]);
    }

    /**
     * 调用指定对象的指定方法
     * @param obj
     * @param method
     * @param args
     * @return
     */
    public static Object invoke(Object obj,Method method,Object... args){
        try {
            return method.invoke(obj, args);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }
}
