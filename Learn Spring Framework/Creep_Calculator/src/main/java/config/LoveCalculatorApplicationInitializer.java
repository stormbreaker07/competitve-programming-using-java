package config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class LoveCalculatorApplicationInitializer implements WebApplicationInitializer {



    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {


//        XmlWebApplicationContext applicationContext;
//            applicationContext = new XmlWebApplicationContext();
//            applicationContext.setConfigLocation("classpath:config.xml");


        AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
        applicationContext.register(BeansConfig.class);
        applicationContext.register(HibernateConfig.class);


        DispatcherServlet dispatcherServlet = new DispatcherServlet((WebApplicationContext) applicationContext);

        System.out.println("hello let see how this WebApplicationInitializer works");
        ServletRegistration.Dynamic servletRegistration =  servletContext.addServlet("dispatcherServlet" , dispatcherServlet);
        servletRegistration.setLoadOnStartup(1);
        servletRegistration.addMapping("/");

    }
}
