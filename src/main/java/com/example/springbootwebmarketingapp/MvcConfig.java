package com.example.springbootwebmarketingapp;

import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.nio.file.Path;
import java.nio.file.Paths;

public class MvcConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry resourceHandlerRegistry) {
        Path itemImageUploadDir = Paths.get("./Pictures");
        String itemImageUploadPath = itemImageUploadDir.toFile().getAbsolutePath();

        resourceHandlerRegistry.addResourceHandler("/Pictures/**").addResourceLocations("file:/" + itemImageUploadPath + "/");
    }
}
