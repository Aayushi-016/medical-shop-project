package com.medical.shop.controller;

import com.medical.shop.entity.Request;
import com.medical.shop.repository.RequestRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class RequestController{
    private final RequestRepository repo;

    public RequestController(RequestRepository repo){
        this.repo=repo;
    }

    @PostMapping("/save")
    public Request saveRequest(@RequestBody Request request) {
        return repo.save(request);
    }

}
