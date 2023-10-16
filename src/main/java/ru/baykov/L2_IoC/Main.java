package ru.baykov.L2_IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContextL3.xml");
        RockMusic rockMusic = ctx.getBean("musicBean", RockMusic.class);
        System.out.println(rockMusic.getSong());
        /*MusicPlayer musicPlayer1 = ctx.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayer2 = ctx.getBean("musicPlayer", MusicPlayer.class);
        boolean comparasion = musicPlayer1 == musicPlayer2;
        if (comparasion) {
            System.out.println(
                            "musicPlayer1: " + musicPlayer1 + System.lineSeparator() +
                            "musicPlayer2: " + musicPlayer2);
            System.out.println("Singleton bean scope");
        }
        else {
            System.out.println("Prototype bean scope");
        }
        musicPlayer1.playMusic();*/
        ctx.close();
    }
}
