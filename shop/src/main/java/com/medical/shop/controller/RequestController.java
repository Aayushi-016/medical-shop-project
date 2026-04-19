package com.medical.shop.controller;

import com.medical.shop.entity.Request;
import com.medical.shop.repository.RequestRepository;
import com.medical.shop.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class RequestController{

   private final RequestRepository repo;
    @Autowired
    private EmailService emailService;
   public RequestController(RequestRepository repo){
        this.repo=repo;
    }

    @PostMapping("/save")
    public Request saveRequest(@RequestBody Request request) {


        System.out.println("API HIT: " + request.getName());

        return repo.save(request);
        //For Deployment
      /* Request saved = repo.save(request);

        emailService.sendEmail(
                request.getName(),
                request.getPhone(),
                request.getItems()
        );

        return saved;*/

    }

}
