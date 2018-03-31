package tw.noah.spring.boot.standalone.app.example.service.impl;

import java.util.Date;
import java.util.List;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import tw.noah.spring.boot.standalone.app.example.model.MailConfig;
import tw.noah.spring.boot.standalone.app.example.service.MyService;

@Service
@Log4j2
public class MyServiceImpl implements MyService {

	@Autowired
	private MailConfig mailConfig;

	/**
	 * inject from properties
	 */
	@Value("${my.mail.server}")
	private String mailServer;

	/**
	 * inject a date type
	 */
	@Value("${your.date}")
	private Date date;

	/**
	 * inject a list type
	 */
	@Value("#{'${your.lists}'.split(',')}")
	private List<Integer> lists;

	public String sayHi(String name) {

		log.info("inject to Map...");
		log.info("config mail size()=" + mailConfig.getMail().size());
		mailConfig.getMail().forEach((k,v)->log.info("k=" + k + ",v=" + v));

		log.info("inject from properties...");
		log.info("mail.server=" + mailServer);

		log.info("inject date type...");
		log.info(date.getTime());

		log.info("inject list type...");
		lists.forEach((v)->log.info(v));


		return "Hi," + name;

	}

}
