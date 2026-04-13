package com.medical.shop.entity;

import jakarta.persistence.*;
import jakarta.persistence.Id;
import org.springframework.aot.generate.GenerationContext;

@Entity
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String phone;
    private String items;

    public Long getId() { return id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getItems() { return items; }
    public void setItems(String items) { this.items = items; }
}