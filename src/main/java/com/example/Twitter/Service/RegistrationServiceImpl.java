package com.example.Twitter.Service;


import com.example.Twitter.Entity.User;
import com.example.Twitter.Repository.RegisterRepository;

public class RegistrationServiceImpl implements RegistrationService {
private RegisterRepository registerRepository;

    public void setRegisterRepository(RegisterRepository registerRepository) {
        this.registerRepository = registerRepository;
    }

    @Override
    public User save(User user) {
     return    registerRepository.save(user);
    }
}
