package academy.learnprogramming.console;

import academy.learnprogramming.config.GameConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class Main {

//    private static final Logger log = LoggerFactory.getLogger(Main.class); added @slf from lombok hence removing this line

    public static void main(String[] args) {
        log.info("Guess the number game");

        //create context (container)
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(GameConfig.class);
         //= new ClassPathXmlApplicationContext(CONFIG_LOCATION); XML path app config

        context.close();

    }
}
