package com.example.KateSP;

import org.springframework.stereotype.Component;

@Component
public class KateLearningInterfaceImpl implements KateLearningInterface{

    @Override
    public Integer f1(String number) {
        return 10;
    }
}
