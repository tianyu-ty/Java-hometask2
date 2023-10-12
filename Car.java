package hometask2;

import java.time.LocalDate;

class Car {  
    int id;  
    String make;  
    String model;  
    int yearOfManufacture;
    LocalDate dateOfRegistration;
    String color;  
    double price;  
    String registrationNumber;  
  
    public Car(int id, String make, String model, int yearOfManufacture, LocalDate dateOfRegistration, String color, double price, String registrationNumber) {  
        this.id = id;  
        this.make = make;  
        this.model = model;  
        this.yearOfManufacture = yearOfManufacture;
        this.dateOfRegistration = dateOfRegistration;
        this.color = color;  
        this.price = price;  
        this.registrationNumber = registrationNumber;  
    }  
  
    @Override  
    public String toString() {  
    	return "Car [id=" + id + ", Make=" + make + ", Model=" + model + ", Year of manufacture=" + yearOfManufacture + ", Year of registration=" + dateOfRegistration + ", Color=" + color + ", Price=" + price + ", Registration number=" + registrationNumber + "]";  
    }    
}  
  
