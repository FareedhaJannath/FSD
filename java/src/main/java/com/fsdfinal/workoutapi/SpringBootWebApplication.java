package com.fsdfinal.workoutapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Import;

/**
 * @author Fareedha
 *
 */
@SpringBootApplication(scanBasePackages = {"com.fsdfinal.workoutapi"})
@EnableAutoConfiguration
//@Import({WebConfig.class})
public class SpringBootWebApplication extends SpringBootServletInitializer 
{

    /**
     * @see org.springframework.boot.web.support.SpringBootServletInitializer#configure(org.springframework.boot.builder.SpringApplicationBuilder)
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) 
    {
        return application.sources(SpringBootWebApplication.class);
    }
  
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception 
    {
        SpringApplication.run(SpringBootWebApplication.class, args);
    }
    
  
}

