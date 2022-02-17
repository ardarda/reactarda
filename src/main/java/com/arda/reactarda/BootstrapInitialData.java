package com.arda.reactarda;


import com.arda.reactarda.Client;
import com.arda.reactarda.repository.ClientRepository;
import com.github.javafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class BootstrapInitialData implements CommandLineRunner {

  private final ClientRepository clientRepository;
  private final Faker faker = new Faker(Locale.getDefault());

  public BootstrapInitialData(ClientRepository clientRepository) {
    this.clientRepository = clientRepository;
  }

  @Override
  public void run(String... args) {
    for (int i = 0; i < 10; i++) {
      clientRepository.save(new Client(faker.name().fullName(), faker.internet().emailAddress()));
    }
  }
}