package tw.noah.spring.boot.standalone.app.example.service.impl;

import org.springframework.stereotype.Service;

import tw.noah.spring.boot.standalone.app.example.service.MyService;

@Service
public class MyServiceImpl implements MyService {

	@Override
	public String sayHi(String name) {
		return "Hi," + name;
	}

}
