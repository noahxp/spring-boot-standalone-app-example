package tw.noah.spring.boot.standalone.app.example;

import java.util.UUID;

import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import tw.noah.spring.boot.standalone.app.example.service.MyService;

@Controller
@Log4j2
public class MainApp {
	
//	private final static Logger log = LogManager.getLogger();

//	@Resource
	@Autowired
	private MyService myService;
	
	public void run() {
		log.info("on mainApp.run()");
		String hi = myService.sayHi(UUID.randomUUID().toString());
		log.info(hi);
	}
}
