package com.arda.reactarda.repository;


import com.arda.reactarda.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}