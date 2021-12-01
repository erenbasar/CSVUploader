package com.example.demo.entity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DataRepo extends JpaRepository<DataDetails, String> {

}
