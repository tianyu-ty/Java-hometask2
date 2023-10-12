
Tian Yu, 7219180

Description:
 
First defined a class Car which describes attributes of a car and override the toString method to output detailed information of the car in a readable format. In the main method, created an array of cars of type Car and initialize two of its elements.

a) defined a brand name and created a new file brandFile based on it to store all car information that matches that brand. The code ensures that PrintWriter closes correctly after completing the operation through a try with resources statement. In this try block, all cars are traversed and the car information with a manufacturing brand equal to Toyota is written into the brandFile.

b) defined a vehicle model and a year, and obtained the current date now. An empty ArrayList modelCars was created to store vehicles that meet a specific age. Traverse all cars, if the model is equal to Camry, calculate the age of the car (the period between the current date and the vehicle registration date), and if the age exceeds 7 years, add the car to modelCars. Create a new file modelFile based on modelCars and write the eligible car information to this file.

c) a year and a price were defined, and a new file named yearFile was created based on this to store information on all cars manufactured in 2011 and priced higher than 35000. Then, traverse all cars, and if these two conditions are met, write the vehicle information into the yearFile.

Development environment:
java version "1.8.0_381"
Java(TM) SE Runtime Environment (build 1.8.0_381-b09)
Java HotSpot(TM) 64-Bit Server VM (build 25.381-b09, mixed mode)

Thank you Professor.