package com.viet.api.hibernatelogin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Calendar;
import java.util.Date;

@SpringBootApplication
public class HibernateloginApplication {
    private static Date date=Calendar.getInstance().getTime();
    public static void main(String[] args) {

        SpringApplication.run(HibernateloginApplication.class, args);
//        CategoryDAOImpl categoryDAO = new CategoryDAOImpl();
//        categoryDAO.insertCategory(new Category (0,"ad1235",0,
//                "ukukuku",date));
    }


}
