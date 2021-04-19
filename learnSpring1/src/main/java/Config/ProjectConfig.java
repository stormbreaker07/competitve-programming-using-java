package Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = {"repositories" , "services"})
public class ProjectConfig {

//@Bean
//public MyBean myBean1() {
//    MyBean bean = new MyBean();
//    bean.setName("tanuj");
//    return bean;
//}
//
//@Bean
//public MyBean myBean2() {
//    MyBean bean = new MyBean();
//    bean.setName("yadav");
//    return bean;
//}


}
