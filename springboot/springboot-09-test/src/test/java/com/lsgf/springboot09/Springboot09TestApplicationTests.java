package com.lsgf.springboot09;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

@SpringBootTest
class Springboot09TestApplicationTests {

    @Autowired
    JavaMailSenderImpl mailSender;

    @Test
    void contextLoads() {

        //一个简单的邮件
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setSubject("This is a trash mail！!");
        mailMessage.setText("Do not repeat");
        mailMessage.setText("Do not repeat");
        mailMessage.setText("Do not repeat");
        mailMessage.setTo("3040624209@qq.com","2158458230@qq.com");
        mailMessage.setFrom("1251201363@qq.com");

        mailSender.send(mailMessage);
    }

    @Test
    void contextLoads2() throws MessagingException {

        //一个复杂的邮件
//        MimeMailMessage mimeMailMessage = new MimeMailMessage();
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        //组装
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage,true);
        //正文
        helper.setSubject("This is a complicate mail");
        helper.setText("<p style='color:red'>Do not repeat</p>",true);

        //附件
//        helper.addAttachment("1.png",new File("1.png"));
        helper.addAttachment("2.png",new File("D:\\springboot-09-test\\src\\main\\resources\\2.png"));

        helper.setTo("1251201363@qq.com");
        helper.setFrom("1251201363@qq.com");

        mailSender.send(mimeMessage);
    }

    //封装
    @Test
    void  contextLoads3(){
        try {
//            for (int i = 0; i < 100; i++) {

                sendMail(true,
                        "This is a complicate mail",
                        "<p style='color:red'>Do not repeat</p>",
                        "1.png",
                        "D:\\springboot-09-test\\src\\main\\resources\\2.png",
                        "1251201363@qq.com",
                        "1251201363@qq.com"
                );
//            }

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @param html:是否开启
     * @param title
     * @param mailBody
     * @param attachmentName:附件名
     * @param attachmentPath:附件路径
     * @param sendTo
     * @param sendFrom
     * @throws MessagingException
     */
    public void sendMail(Boolean html,String title,String mailBody,String attachmentName,String attachmentPath,String sendTo,String sendFrom) throws MessagingException {

        //一个复杂的邮件
//        MimeMailMessage mimeMailMessage = new MimeMailMessage();
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        //组装
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage,html);
        //正文
        helper.setSubject(title);
        helper.setText(mailBody,true);

        //附件
//        helper.addAttachment("1.png",new File("1.png"));
        helper.addAttachment(attachmentName,new File(attachmentPath));

        helper.setTo(sendTo);
        helper.setFrom(sendFrom);

        mailSender.send(mimeMessage);
    }




//  定时任务  -----
    public void timerTest(){

    }

}
