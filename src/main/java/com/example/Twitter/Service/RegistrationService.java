package com.example.Twitter.Service;

import com.example.Twitter.Entity.User;
import com.example.Twitter.Repository.RegisterRepository;
import org.springframework.stereotype.Service;

@Service
public interface RegistrationService {




    User save(User user) ;



}
