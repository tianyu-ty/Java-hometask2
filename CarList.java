package hometask2;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class CarList {  
    public static void main(String[] args) {  
         
        Car[] cars = new Car[5];  
        cars[0] = new Car(1, "Toyota", "Camry", 2010, LocalDate.of(2011, 3, 5), "White", 30000, "A2ST19");  
        cars[1] = new Car(2, "Toyota", "Corolla", 2011, LocalDate.of(2015, 12, 25), "Black", 25000, "306IUU");  
        cars[2] = new Car(3, "Toyota", "Camry", 2016, LocalDate.of(2018, 9, 05), "Gray", 35000, "888UUO");  
        cars[3] = new Car(4, "Ford", "Mustang", 2011, LocalDate.of(2013, 7, 7), "Red", 40000, "3JK78P");  
        cars[4] = new Car(5, "Chevrolet", "Corvette", 2020, LocalDate.of(2021, 5, 31), "Blue", 50000, "398HJK");  
  
        // Save the list of cars of model Toyota to a file  
        String brand = "Toyota";  
        File brandFile = new File("cars_of_" + brand + ".txt");  
        try (PrintWriter writer = new PrintWriter(brandFile)) {  
            for (Car car : cars) {  
                if (car.make.equals(brand)) {  
                    writer.println(car.toString());  
                }  
            }  
        } catch (IOException e) {  
            System.out.println("Error saving list of cars of brand: " + brand);  
            e.printStackTrace();  
        }  
  
        // Save the list of cars of model Camry that have been in use for more than 7 years to a file  
        String model = "Camry";  
        int years = 7; 
        LocalDate now = LocalDate.now();
        List<Car> modelCars = new ArrayList<>();
        for (Car car : cars) {    
            if (car.model.equals(model)) {  
                Period period = Period.between(car.dateOfRegistration, now);  
                if (period.getYears() > years) {    
                    modelCars.add(car);  
                }  
            }    
        }    
        File modelFile = new File("cars_of_" + model + "_more_than_" + years + "_years.txt");    
        try (PrintWriter writer = new PrintWriter(modelFile)) {    
            for (Car car : modelCars) {    
                writer.println(car.toString());    
            }    
        } catch (IOException e) {    
            System.out.println("Error saving list of cars of model: " + model);    
            e.printStackTrace();    
        }    
  
        // Save the list of cars of manufactured in 2011, the price of which is higher than 35000 to a file  
        int year = 2011;  
        double specifiedPrice = 35000;  
        File yearFile = new File("cars_of_" + year + "_higher_than_" + specifiedPrice + ".txt");  
        try (PrintWriter writer = new PrintWriter(yearFile)) {  
            for (Car car : cars) {  
                if (car.yearOfManufacture == year && car.price > specifiedPrice) {  
                    writer.println(car.toString());  
                }  
            }  
        } catch (IOException e) {  
            System.out.println("Error saving list of cars of year of manufacture: " + year);  
            e.printStackTrace();  
        }  
    }  
}