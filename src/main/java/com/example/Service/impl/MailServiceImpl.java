package com.example.Service.impl;

import com.example.Service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

/**
 * @author: yan
 * @Date: 2018/7/16/0016 23:46
 * @Description:
 */
@Service
public class MailServiceImpl implements MailService{
    //获取发送者信息


    @Autowired
    private JavaMailSender sender;

    @Override
    public void sendEmail(String to, String subject, String content) {
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setFrom("329731984@qq.com");
        mailMessage.setTo(to);
        mailMessage.setSubject(subject);
        mailMessage.setText(content);
        sender.send(mailMessage);
        System.out.println("send");
    }
}
