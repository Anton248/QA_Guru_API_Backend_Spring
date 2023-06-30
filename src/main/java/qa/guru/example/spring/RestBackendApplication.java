package qa.guru.example.spring;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

// Post запрос на http://localhost:8082/user/login
// body:
// {
//    "login": "dima",
//    "password": "   "
// }
@SpringBootApplication
public class RestBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestBackendApplication.class, args);
    }

}
