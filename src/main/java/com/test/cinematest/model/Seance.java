package com.test.cinematest.model;

import com.test.cinematest.model.Place;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Document(collection = "Seances")
public class Seance {
  @Id
  private String id;
  private String name;
  private LocalDateTime date;
  private List<Place> places;
  
  public Seance(String id, String name, LocalDateTime date, List<Place> places) {
    this.id = id;
    this.name = name;
    this.places = places;
    this.date = date;
  }
  
  public Seance(String name, LocalDateTime date, List<Place> places) {
    this.name = name;
    this.date = date;
    this.places = places;
  }
  
  public Seance() {
  }
  
  public String getId() {
    return id;
  }
  
  public void setId(String id) {
    this.id = id;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public List<Place> getPlaces() {
    return places;
  }
  
  public void setPlaces(List<Place> places) {
    this.places = places;
  }
  
  public LocalDateTime getDate() {
    return date;
  }
  
  public void setDate(LocalDateTime date) {
    this.date = date;
  }
}
