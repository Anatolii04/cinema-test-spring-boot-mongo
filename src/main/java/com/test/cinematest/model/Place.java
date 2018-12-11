package com.test.cinematest.model;

public class Place {
  private int num;
  private Status status;
  
  public Place(int num, Status status) {
    this.num = num;
    this.status = status;
  }
  
  public Place() {
  }
  
  public int getNum() {
    return num;
  }
  
  public void setNum(int num) {
    this.num = num;
  }
  
  public Status getStatus() {
    return status;
  }
  
  public void setStatus(Status status) {
    this.status = status;
  }
}
