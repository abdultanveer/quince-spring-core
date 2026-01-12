package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//https://chatgpt.com/share/6964838b-c160-8002-8151-43071ac87c09
// TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");

        // Get object from Spring

        Car car = context.getBean("car", Car.class);

        car.drive();
    }
}