package ru.baykov.L2_IoC;

import org.springframework.stereotype.Component;

@Component
public class NativeMusic implements Music{
    @Override
    public String getSong() {
        return "Berezka";
    }
}
