package com.test.cinematest.web;

import com.test.cinematest.dao.SeanceRepository;
import com.test.cinematest.model.Seance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cinema")
public class CinemaController {
  @Autowired
  private SeanceRepository seanceRepository;
  
  public CinemaController(SeanceRepository seanceRepository) {
    this.seanceRepository = seanceRepository;
  }
  
  @GetMapping
  @RequestMapping("/seances")
  public List<Seance> getSeances(){
    return seanceRepository.findAll();
  }
  
  @PostMapping
  @RequestMapping("/seance/add")
  public void addSeance(@RequestBody Seance seance){
    seanceRepository.insert(seance);
  }
  
  @PutMapping
  @RequestMapping("/seance/update")
  public void updateSeance(@RequestBody Seance seance){
    seanceRepository.insert(seance);
  }
  
//  @GetMapping
//  @RequestMapping("/seance/get/{name}")
//  public Seance getSeance()

  
}
