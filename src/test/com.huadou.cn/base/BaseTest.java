package com.huadou.cn.base;

/**
 * Created by jinliang on 16/7/10.
 * 基础的单元测试类
 */


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *  测试单元的公共的方法类
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath:spring-mybatis.xml",
        "classpath:spring-mvc.xml"
//        , "classpath:spring-context-shiro.xml"

})
 public abstract class   BaseTest  extends AbstractTransactionalJUnit4SpringContextTests {
    @Before
    public abstract void  testBefore();
    @Test
    public abstract void test();
    @After
    public abstract void testAfter();
}
