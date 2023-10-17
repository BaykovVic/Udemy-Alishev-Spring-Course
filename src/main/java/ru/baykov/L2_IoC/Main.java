package ru.baykov.L2_IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContextL3.xml");
       /* MusicPlayer musicPlayer = ctx.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();*/
        Computer computer = ctx.getBean("computer", Computer.class);
        System.out.println(computer.toString());
        ctx.close();
    }
}
