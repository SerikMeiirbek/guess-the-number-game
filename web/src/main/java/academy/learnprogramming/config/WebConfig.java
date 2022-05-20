package academy.learnprogramming.config;

import academy.learnprogramming.utl.ViewNames;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    public void addViewContollers(ViewControllerRegistry registry){
        registry.addViewController("/").setViewName(ViewNames.HOME);
    }
}
