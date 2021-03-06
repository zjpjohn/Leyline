package moe.src.leyline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import moe.src.leyline.framework.LeylineApp;

@EnableJpaRepositories(basePackages = "moe.src.leyline.business")
@ComponentScan(basePackages = { "moe.src.leyline.business", "moe.src.leyline.interfaces" })
@EntityScan(basePackages = "moe.src.leyline.business.domain")
@EnableAspectJAutoProxy
public class App extends LeylineApp {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
