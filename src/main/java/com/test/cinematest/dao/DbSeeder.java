package com.test.cinematest.dao;

import com.test.cinematest.model.Seance;
import com.test.cinematest.model.Place;
import com.test.cinematest.model.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.ZonedDateTime;
import java.util.Arrays;

@Component
public class DbSeeder implements CommandLineRunner {
  @Autowired
  private SeanceRepository seanceRepository;
  @Override
  public void run(String... args) throws Exception {
    Seance seance = new Seance(
        "Night",
        ZonedDateTime.now().toLocalDateTime(),
        Arrays.asList(new Place(1, Status.FREE), new Place(2, Status.RESERVED), new Place(3, Status.SOLD))
    );
    seanceRepository.insert(seance);
  }
}
