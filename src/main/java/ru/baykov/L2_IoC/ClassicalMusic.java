package ru.baykov.L2_IoC;

import org.springframework.stereotype.Component;

@Component("classicalMusicBean")
public class ClassicalMusic implements Music{
    @Override
    public String getSong() {
        return "Hungarian Rapsody";
    }
}
