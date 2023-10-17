package ru.baykov.L2_IoC;

import org.springframework.stereotype.Component;

@Component("rockMusicBean")
public class RockMusic implements Music{

    private RockMusic() {}

    public static RockMusic initRockMusicInstance() {
        return new RockMusic();
    }
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
