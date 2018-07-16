package com.example.demo;

import com.example.Service.MailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationTests {
	@Autowired
	private JavaMailSender mailSender;

	@Autowired
	private MailService mailService;

	@Test
	public void contextLoads() {
	}

	@Test
	public void sendMail() throws Exception{
//		SimpleMailMessage message = new SimpleMailMessage();
//		message.setFrom("329731984@qq.com");
//		message.setTo("2601732014@qq.com");
//		message.setSubject("主题：简单邮件");
//		message.setText("测试邮件内容");
//
//		mailSender.send(message);

		mailService.sendEmail("2601732014@qq.com","122","this is test email");
	}
}
