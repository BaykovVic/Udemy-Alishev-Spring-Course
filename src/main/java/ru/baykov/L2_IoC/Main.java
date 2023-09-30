package ru.baykov.L2_IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContextL2.xml");
        MusicPlayer musicPlayer = ctx.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
        ctx.close();
    }
}
