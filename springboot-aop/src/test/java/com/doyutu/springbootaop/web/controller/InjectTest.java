package com.doyutu.springbootaop.web.controller;

import com.doyutu.springbootaop.fremework.container.BeanContainer;
import com.doyutu.springbootaop.fremework.init.InitContext;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * 依赖注入测试
 *
 * @author doyutu
 * @date 2018-04-22 20:02
 * springboot
 */
public class InjectTest {

    @Test
    public void testInject() {
        InitContext.init(new String[]{"com.doyutu.springbootaop"});
        AopController bean = BeanContainer.getBean(AopController.class);
        String service = bean.getService();
        System.out.println(service);
        assertEquals("Inject", service);
    }

}