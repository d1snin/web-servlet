package xyz.d1snin.webservlet.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"xyz.d1snin.webservlet.repository", "xyz.d1snin.webservlet.service"})
public class ApplicationConfiguration {}
