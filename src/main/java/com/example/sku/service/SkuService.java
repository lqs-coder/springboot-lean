package com.example.sku.service;


import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

@Service
public class SkuService {

    @Cacheable(value = "sku")
    public List<Integer> getAllData(){
        List<Integer> integers = Arrays.asList(1, 2, 3, 4);
        return integers;
    }

    @Cacheable(value = "sku",key = "#id")
    public Integer getData(Integer id){
//        List<Integer> integers = Arrays.asList(1, 2, 3, 4);
        return id;
    }

    @CacheEvict(value = "sku")
    @Transactional(rollbackFor = Exception.class)
    public void deleteSku(){
        System.out.println("deleteAllData");

    }

}
