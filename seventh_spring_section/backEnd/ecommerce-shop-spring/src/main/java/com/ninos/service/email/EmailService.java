package com.ninos.service.email;

import com.ninos.model.dto.Mail;

public interface EmailService {

     void sendCodeByMail(Mail mail);
}
