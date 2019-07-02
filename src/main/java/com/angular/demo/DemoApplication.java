package com.angular.demo;

import com.angular.demo.dao.UserRepository;
import com.angular.demo.entities.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.jws.soap.SOAPBinding;
import java.io.StringReader;
import java.util.stream.Stream;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
//    @Bean
//    CommandLineRunner init(UserRepository userRepository)
//    {
//        return args -> {
//            Stream.of("Jhon","Julien","Jennifer").forEach(
//                    name -> {
//                        User user = new User(name,name.toLowerCase()+"@gmail.com");
//                        userRepository.save(user) ;
//                    }
//            );
//            userRepository.findAll().forEach(user -> {
//                System.out.println(user.getEmail());
//            });
//        } ;
//    }

}
