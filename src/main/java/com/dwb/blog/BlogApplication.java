package com.dwb.blog;

import com.dwb.blog.config.MyBlogProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;

@SpringBootApplication
public class BlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogApplication.class, args);
//        run();
    }

    private static void run(){
        System.out.println("myname:");
    }

}
