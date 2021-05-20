package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = {"controllers" , "configuration" , "model" , "entity", "services" , "repositories"})
public class RegistrationFormConfig {

    @Bean
     public InternalResourceViewResolver internalResourceViewResolver() {
       InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
       viewResolver.setSuffix(".jsp");
       viewResolver.setPrefix("/WEB-INF/view/");
        return viewResolver ;

    }
}
