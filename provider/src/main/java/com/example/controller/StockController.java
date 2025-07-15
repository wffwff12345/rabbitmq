package com.example.controller;

import com.example.entity.Stock;
import com.example.service.StockService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
@RequestMapping("/stock")
public class StockController {

    @Autowired
    StockService service;
    //@Autowired
    @Autowired
    ObjectMapper objectMapper;

    @Autowired
    /*@PostConstruct
    public void init() throws JsonProcessingException {
        List<Stock> stocks = service.getAll();
        redisTemplate.boundValueOps("stocks").set(objectMapper.writeValueAsString(stocks));
    }*/

   /* @GetMapping("/stock/{id}")
    public Boolean getOne(@PathVariable("id") Integer id) throws JsonProcessingException {
        String stocks =(String) redisTemplate.boundValueOps("stocks").get();
        if(stocks == null){
            List<Stock> list = service.getAll();
            redisTemplate.boundValueOps("stocks").set(objectMapper.writeValueAsString(list));
        }else{
            List<Stock> stockList = objectMapper.readValue(stocks, new TypeReference<List<Stock>>() {
            });
            for (int i = 0; i < stockList.size(); i++) {
               if(id.equals(stockList.get(i).getId())){
                    if()
                }
            }
        }
    }*/

}
