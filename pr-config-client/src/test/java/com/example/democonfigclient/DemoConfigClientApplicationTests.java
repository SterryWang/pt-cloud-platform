package com.example.democonfigclient;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=DemoConfigClientApplication.class)

public class DemoConfigClientApplicationTests {

	
	@Value("${database.passwd1}")
	String  dbPasswd;
	@Value("${database.passwd2}")
	String  dbPasswd2;
	@Test
	public void contextLoads() {
		System.out.println("数据库密码为："+dbPasswd);
		System.out.println("数据库密码dbpasswd2为："+dbPasswd2);
	}

}
