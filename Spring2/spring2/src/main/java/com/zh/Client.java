package com.zh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext-beans.xml");
        IUserManager iUserManager= (IUserManager) context.getBean("userManagerImpl");
        try {
            iUserManager.addUser("Sally","666") ;
            iUserManager.modifyUser(1,"tom","666");
            iUserManager.queryUser(1);
            iUserManager.delUser(2);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
