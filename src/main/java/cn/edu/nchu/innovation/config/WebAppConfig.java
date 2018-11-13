package cn.edu.nchu.innovation.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 文件上传配置
 */
@Configuration
public class WebAppConfig implements WebMvcConfigurer {

    // 获取配置文件中图片的路径
    @Value("${file.path}")
    private String filePath;

    // 访问图片方法
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        String path = "file:" + filePath;//file:E:/files/
        registry.addResourceHandler("/images/**").addResourceLocations(path);
        registry.addResourceHandler("/pioneer/images/**").addResourceLocations(path);
        WebMvcConfigurer.super.addResourceHandlers(registry);
    }
}
