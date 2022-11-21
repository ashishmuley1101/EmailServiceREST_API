package com.bridgelabz.springmailserviceapp.service;

import com.bridgelabz.springmailserviceapp.model.EmailDetails;

public interface IEmailService {

        // Method
        // To send a simple email
        String sendSimpleMail(EmailDetails details);

        // Method
        // To send an email with attachment
        String sendMailWithAttachment(EmailDetails details);
    }

