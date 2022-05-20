package academy.learnprogramming;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@Slf4j
@SpringBootApplication
public class Main {

//    private static final Logger log = LoggerFactory.getLogger(Main.class); added @slf from lombok hence removing this line

    public static void main(String[] args) {
        log.info("Guess the number game");

        //create context (container)
//        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(GameConfig.class);
         //= new ClassPathXmlApplicationContext(CONFIG_LOCATION); XML path app config
//        context.close();
        SpringApplication.run(Main.class, args);

    }
}
