package com.hl.common.utils;

import junit.framework.TestCase;

import java.lang.reflect.Method;

public class ReflectionUtilsTest extends TestCase {

    public void testNewInstance() {
        TestClass testClass = ReflectionUtils.newInstance(TestClass.class);
        assertNotNull(testClass);

    }

    public void testGetPublicMethod() {
        Method[] publicMethod = ReflectionUtils.getPublicMethod(TestClass.class);
        assertEquals(1,publicMethod.length);
    }

    public void testInvoke() {
    }
}