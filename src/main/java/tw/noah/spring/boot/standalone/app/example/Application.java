package tw.noah.spring.boot.standalone.app.example;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@Log4j2
public class Application
{
	public static void main(String[] args) {
    ApplicationContext ctx = SpringApplication.run(Application.class, args);
    MainApp app = ctx.getBean(MainApp.class);
    app.run();

    log.info("program success");
  }

}


