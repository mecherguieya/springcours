package tn.esprit.sptingproject2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;
@EnableAspectJAutoProxy
@SpringBootApplication
@EnableScheduling
public class SptingProject2Application {

    public static void main(String[] args) {
        SpringApplication.run(SptingProject2Application.class, args);
    }

}
