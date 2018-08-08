package tw.noah.spring.boot.standalone.app.example.model;

import java.util.Map;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * inject property to map , profile is "my." (see as application.yaml)
 */
@Component
@ConfigurationProperties(prefix = "my")
@Data
public class MailConfig {

	@Value("${mailServer}")
	private String mailServer;

	@Value("sender")
	private String sender;

	private Map<String,String> mail;

	/*
	my:
  mail:
    server: myoms.com.tw
    sender: mail@myoms.com.tw
    locale: zh-tw
	 */

}
