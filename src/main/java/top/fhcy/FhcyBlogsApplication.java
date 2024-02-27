package top.fhcy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication(scanBasePackages = "top.fhcy")
public class FhcyBlogsApplication {
    public static void main(String[] args) {
        SpringApplication.run(FhcyBlogsApplication.class, args);
    }
}
