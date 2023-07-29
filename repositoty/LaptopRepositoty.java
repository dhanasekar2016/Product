package com.electronics.repositoty;

import org.springframework.data.jpa.repository.JpaRepository;

import com.electronics.entity.Laptop;

public interface LaptopRepositoty extends JpaRepository<Laptop,Integer>  {

}
