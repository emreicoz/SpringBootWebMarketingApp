package com.example.springbootwebmarketingapp;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.nio.file.Path;
import java.nio.file.Paths;

@Configuration
public class MvcConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        Path itemImageUploadDir = Paths.get("src/main/resources/static/Pictures");
        String itemImageUploadPath = itemImageUploadDir.toFile().getAbsolutePath();

        registry.addResourceHandler("/Pictures/**").addResourceLocations("file:/" + itemImageUploadPath + "/");
    }
}
