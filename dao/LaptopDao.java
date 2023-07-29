package com.electronics.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.electronics.repositoty.LaptopRepositoty;

@Repository
public class LaptopDao {
   @Autowired
   LaptopRepositoty lr;
}
