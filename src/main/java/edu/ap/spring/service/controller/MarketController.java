package edu.ap.spring.service.controller;


import edu.ap.spring.service.Wallet;
import edu.ap.spring.service.redis.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

@Controller
@Scope("session")
public class MarketController {


    private RedisService service; // pattern : "products":name:weight:amount
    private Wallet a = new Wallet();
    private Wallet b = new Wallet();


    @Autowired

    public void setRedisService(RedisService service) {
        this.service = service;
    }

    public MarketController() {
    }


    @GetMapping("/balance/walletA")
    public String searchByNameForm() {
        return String.valueOf(a.getBalance());
    }


}
