package com.example.demo.service;

import java.io.IOException;

import java.util.List;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.example.demo.model.Host;
import com.example.demo.model.Time;
import com.example.demo.repository.UserRepository;

@Service
public class Mailservice {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
    private JavaMailSender javaMailSender;

    public void inEmail(String name,String email,String mobno,String hostname,String department) {

        SimpleMailMessage msg = new SimpleMailMessage();
        List<Host> host =userRepository.getHostDetails(hostname, department);
        List<Time> time = userRepository.getVistorDetails(email);
        msg.setTo(host.get(0).getemail());
        //String hostemail="harivilasp@gmail.com";
        //msg.setTo(hostemail);
        msg.setSubject("VISITOR ALERT");
        msg.setText("This is to inform you that Visitor is coming to visit you\n"
        		+ "Name: "+name
        		+ "\nEmail: "+email
        		+ "\nMobile No: "+mobno
        		+ "\nCheckin Time: "+time.get(0).getinTime()
        		);

        javaMailSender.send(msg);

    }

    public void outEmail(String name,String email,String mobno,String hostname,String department) {

        SimpleMailMessage msg = new SimpleMailMessage();
        List<Time> time = userRepository.getVistorDetails(email);
        msg.setTo(email);
        msg.setSubject("Thank You For Visiting");
        msg.setText("This is to Thank You to visit our Company \nDetails Recorded\n"
        		+ "Name: "+name
        		+ "\nPhone No: "+mobno
        		+ "\nCheckin Time: "+time.get(0).getinTime()
        		+ "\nCheckout Time: "+time.get(0).getoutTime()
        		+ "\nHost Name: "+hostname
        		+ "\nAddress Visited: "+department
        		);

        javaMailSender.send(msg);

    }
}
