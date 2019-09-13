package SpringConfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

    @SpringBootApplication(scanBasePackages = {"Controller"})
    public class StudentApplicationConfig {

        public static void main(String[] args) {
            System.out.println("Starting application");
            SpringApplication.run(StudentApplicationConfig.class, args);

        }


    }

