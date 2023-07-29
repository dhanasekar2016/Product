package com.electronics.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.electronics.dao.LaptopDao;

@Service
public class LaptopService {
	@Autowired
	LaptopDao ld;

}
