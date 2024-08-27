package com.webmvch2App.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.webmvch2App.entity.Contact;
import com.webmvch2App.repo.ContactRepository;

@Component
public class MyAppRunner implements ApplicationRunner {

    @Autowired
    private ContactRepository repo;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Contact c1 = new Contact();
        c1.setName("Sudhakar");
        c1.setPhno(79884444L); // Use 'L' to specify long type

        Contact c2 = new Contact();
        c2.setName("Smith");
        c2.setPhno(79884444L); // Use 'L' to specify long type

        // Save the contacts to the repository
        repo.saveAll(Arrays.asList(c1, c2));
    }
}
