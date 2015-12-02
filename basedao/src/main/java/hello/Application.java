package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by SDL on 2015/12/2.
 * 声明一个类型为MovieService的Bean。
 * 标注Application.java为@Configuration,这是告诉Spring在Application.java中
 * 定义了一个或多个@Bean方法，让Spring容器可以在运行时生成这些Bean。
 *
 * 注解@ComponentScan则会让Spring容器自动扫描当前package下的
 * 标有@Component的class，这些class都将由Spring托管。
 *
 */
@Configuration
@ComponentScan
public class Application {

    @Bean
    MessageService mockMessageService() {
        return new MessageService() {
            public String getMessage() {
                return "Hello World!";
            }
        };
    }

    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(Application.class);
        MessagePrinter printer = context.getBean(MessagePrinter.class);
        printer.printMessage();
    }
}
