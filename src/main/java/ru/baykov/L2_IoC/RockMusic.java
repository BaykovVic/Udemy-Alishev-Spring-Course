package ru.baykov.L2_IoC;

public class RockMusic implements Music{
    public void initBean() {
        System.out.println("Initialize bean");
    }

    public void destroyBean() {
        System.out.println("Destroy bean");
    }
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
