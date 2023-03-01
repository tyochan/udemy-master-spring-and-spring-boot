package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.config.HelloWorldConfig;
import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.PacManGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App01GamingBasic {

	public static void main(String[] args) {
		// 1: Launch a Spring Context
		var ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);

		// 2: Configuration
//		ctx.getBean("Ranga");
		System.out.println(ctx.getBean("Ravi"));
		System.out.println(ctx.getBean("person2"));
		System.out.println(ctx.getBean("person3"));
		System.out.println(ctx.getBean("person4"));

//		Arrays.stream(ctx.getBeanDefinitionNames())
//				.forEach(System.out::println);
	}

}
