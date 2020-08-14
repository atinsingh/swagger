package apidocs.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
      ApplicationContext context =  SpringApplication.run(DemoApplication.class, args);
        Docket bean = context.getBean(Docket.class);
        System.out.println(bean);

    }

}
