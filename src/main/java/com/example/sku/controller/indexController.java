package com.example.sku.controller;

import com.example.sku.service.SkuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@Controller
@RestController
public class indexController {

    @Autowired
    private SkuService skuService;

    @GetMapping("/")
    public List<Integer> index() {
        List<Integer> allData = skuService.getAllData();
        return allData;
    }

    @GetMapping("/one")
    public Integer one(@RequestParam("id") Integer id) {
//        skuService.deleteSku();
        return skuService.getData(id);
    }

    @GetMapping("/del")
    public List<Integer> del() {
        skuService.deleteSku();
        return skuService.getAllData();
    }

}
