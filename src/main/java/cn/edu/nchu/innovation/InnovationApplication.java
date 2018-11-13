package cn.edu.nchu.innovation;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@MapperScan("cn.edu.nchu.innovation.mapper")
@SpringBootApplication
public class InnovationApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(InnovationApplication.class, args);
    }

    //为了打包springboot项目
    @Override
    protected SpringApplicationBuilder configure(
            SpringApplicationBuilder builder) {
        return builder.sources(InnovationApplication.class);
    }
}
