package kr.co.fastcampus.web.config.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by mileNote on 2020-10-28
 * Blog : https://milenote.tistory.com
 * Github : https://github.com/SimKyunam
 */
@Configuration
@EnableWebMvc
@ComponentScan("kr.co.fastcampus.web.controller")
public class MvcConfig {
}
