package com.klef.jfsd.Impl;

import com.klef.jfsd.beans.StudentSI;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanFactorySetterInjection {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spconfig.xml");
        StudentSI studentSI = (StudentSI) ac.getBean("stdsibean");
        System.out.println("Student ID: " + studentSI.getSid());
        System.out.println("Student Name: " + studentSI.getSname());
        System.out.println("Student Fee: " + studentSI.getSfee());
    }
}
