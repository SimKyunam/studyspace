package kr.co.fastcampus.web.config.servlet;

import kr.co.fastcampus.web.config.spring.AppConfig;
import kr.co.fastcampus.web.config.spring.MvcConfig;
import kr.co.fastcampus.web.config.spring.SecurityConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by mileNote on 2020-10-25
 * Blog : https://milenote.tistory.com
 * Github : https://github.com/SimKyunam
 */
public class FastcampusInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] {AppConfig.class, MvcConfig.class, SecurityConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[0];
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }
}
