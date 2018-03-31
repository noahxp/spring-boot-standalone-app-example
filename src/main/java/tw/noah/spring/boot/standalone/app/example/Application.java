package tw.noah.spring.boot.standalone.app.example;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import tw.noah.spring.boot.standalone.app.example.model.MailConfig;

@SpringBootApplication
//@EnableConfigurationProperties(MailConfig.class)
@Log4j2
//@EnableConfigurationProperties(NumberModel.class)
public class Application
{

//	private final static Logger log = LogManager.getLogger();

	public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);
        MainApp app = ctx.getBean(MainApp.class);
        app.run();
        
        log.info("program success");
    }

}
