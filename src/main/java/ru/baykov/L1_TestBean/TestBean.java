package ru.baykov.L1_TestBean;

public class TestBean {
    private String name;

    public TestBean(String name) {
        this.name = name;
        System.out.println("===>Bean Created<===");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
