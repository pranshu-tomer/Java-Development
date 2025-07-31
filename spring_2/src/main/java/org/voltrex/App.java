package org.voltrex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        // this line creates the IoC container

        Dev obj = (Dev) context.getBean("pra");
         obj.build();
    }
}
