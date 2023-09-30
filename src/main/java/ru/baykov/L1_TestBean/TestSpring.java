package ru.baykov.L1_TestBean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContextL1.xml");
        TestBean bean = ctx.getBean("testBean", TestBean.class);
        System.out.println("===>" + bean.getName() + "<===");
        ctx.close();
    }
}
