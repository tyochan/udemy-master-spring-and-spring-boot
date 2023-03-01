package com.in28minutes.learnspringframework.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age, Address address) { }
record Address (String firstLine, String city) { }

@Configuration
public class HelloWorldConfig {
    @Bean
    public String name() {
        return "Ranga";
    }

    @Bean
    public int age() {
        return 15;
    }

    @Bean(name = "Ravi")
    public Person person() {
        return new Person("Ravi", 20, new Address("Main Street", "Utrecht"));
    }

    @Bean
    public Person person2() {
        return new Person(name(), age(), address());
    }

    @Bean
    public Person person3(String name, int age, Address address) {
        return new Person(name, age, address);
    }

    @Bean
    public Person person4(String name, int age, @Qualifier("address2") Address address) {
        return new Person(name, age, address);
    }

    @Bean
    public Address address() {
        return new Address("Baker Street", "London");
    }

    @Bean
    @Qualifier(value = "address2")
    public Address address2() {
        return new Address("Main Street", "Utrecht");
    }
}
