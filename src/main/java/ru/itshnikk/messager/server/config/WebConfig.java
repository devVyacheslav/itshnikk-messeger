package ru.itshnikk.messager.server.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan("ru.itshnikk.messager.server")
public class WebConfig extends WebMvcConfigurerAdapter {
}
