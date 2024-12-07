package com.klef.jfsd.Impl;

import com.klef.jfsd.beans.Library;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ObjectIntegration {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spconfig.xml");
        Library library = (Library) ac.getBean("libbean");
        System.out.printf("library.book.id: %d%n", library.book.getId());
        System.out.printf("library.book.author: %s%n", library.book.getAuthor());
        System.out.printf("library.book.cost: %.2f%n", library.book.getCost());
    }
}
