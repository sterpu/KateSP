package com.example.KateSP;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class KateLearningInterfaceImpl2 implements KateLearningInterface{

    @Override
    public Integer f1(String number) {
        return 99;
    }
}
