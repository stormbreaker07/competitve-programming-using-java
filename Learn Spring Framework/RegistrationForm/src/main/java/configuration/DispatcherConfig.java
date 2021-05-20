package configuration;



import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;


public class DispatcherConfig implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext ct = new AnnotationConfigWebApplicationContext();
        ct.register(RegistrationFormConfig.class);
        ct.register(HibernateConfig.class);

        DispatcherServlet dispatcherServlet = new DispatcherServlet(ct);

        ServletRegistration.Dynamic servlet =  servletContext.addServlet("dispatcherServlet" , dispatcherServlet);
        servlet.setLoadOnStartup(1);
        servlet.addMapping("/");

    }
}
