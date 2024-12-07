package com.klef.jfsd.Impl;

import com.klef.jfsd.beans.QuestionCI;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CIQuestion {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spconfig.xml");
        QuestionCI questionCI = (QuestionCI) ac.getBean("questioncibean");
        questionCI.display();
    }
}
