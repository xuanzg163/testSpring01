package com.testSpring.mail;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

/**
 *  实现 简单发送邮件
 */
public class Mail {
    public static void main(String[] args) throws MessagingException {

        //卫星
        Message message = null;
        Properties properties = new Properties();

        //邮箱主机
        properties.put("mail.smtp.host","smtp.163.com");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.port", 25);
        Session session = Session.getDefaultInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("xuan_zg@163.com"
                        ,"Qq19920828");
            }
        });

        message = new MimeMessage(session);

        /**
         * 设置邮件
         */

        //发送人
        Address from = new InternetAddress("xuan_zg@163.com");
        message.setFrom(from);

        //接收人
        Address receiver = new InternetAddress("csc17749731709@163.com ");
        message.setRecipient(Message.RecipientType.TO,receiver);

        //内容
        message.setSubject("!!!");
        message.setText("hi this is javamail test!!!");

        //送卫星上天
        Transport.send(message);
    }
}
