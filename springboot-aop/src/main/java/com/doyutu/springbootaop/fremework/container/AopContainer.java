package com.doyutu.springbootaop.fremework.container;

import com.doyutu.springbootaop.fremework.annotation.Beans;
import com.doyutu.springbootaop.fremework.annotation.Component;

/**
 * @author doyutu
 * @date 2018-04-18 16:42
 * springboot
 */
public class AopContainer {

    public static final Class<?> [] beanContainer = new Class[]{Beans.class, Component.class};

}
