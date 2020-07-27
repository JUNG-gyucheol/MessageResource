package com.example.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class ApplicationRunner implements org.springframework.boot.ApplicationRunner {

    @Autowired
    MessageSource messageSource;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        //메세지 소스는 ReloadableResourceBundleMessageSource 스프링 부트는 자동으로 빈으로 등록 되어있다.
        System.out.println(messageSource.getClass());
        System.out.println(messageSource.getMessage("greeting",new String[]{"규철"}, Locale.KOREA));
        System.out.println(messageSource.getMessage("greeting",new String[]{"규철"}, Locale.ENGLISH));
        System.out.println(messageSource.getMessage("greeting",new String[]{"규철"}, Locale.getDefault()));
    }
}
