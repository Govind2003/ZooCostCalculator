/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo01group;

/**
 * This class gives the information about Motor bike fare and calculates the cost of the trip
 * @author Sujith Reddy Naidu
 */
public class Motorbike extends Animal{
       
    private double maxSpeed;
    private VehicleCategories vehicleType;
    private double pricePerHour_dollars;

    /**
     * This is a constructor
     * @param name
     */
    public Motorbike(String name) {
        super(name);
    }

    /**
     * This method returns the maximum speed
     * @return maxSpeed
     */
    public double getMaxSpeed() {
        return maxSpeed;
    }

    /**
     * This method sets the maximum speed
     * @param maxSpeed
     */
    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    /**
     * This method returns the type of the vehicle
     * @return vehicleType
     */
    public VehicleCategories getVehicleType() {
        return vehicleType;
    }

    /**
     * This method sets the type vehicle
     * @param vehicleType
     */
    public void setVehicleType(VehicleCategories vehicleType) {
        this.vehicleType = vehicleType;
    }

    /**
     * This method returns price per hour in dollars
     * @return pricePerHour_dollars
     */
    public double getPricePerHour_dollars() {
        return pricePerHour_dollars;
    }

    /**
     * This method sets the price per hour in dollars
     * @param pricePerHour_dollars
     */
    public void setPricePerHour_dollars(double pricePerHour_dollars) {
        this.pricePerHour_dollars = pricePerHour_dollars;
    }

    /**
     * This method returns the name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This method sets the name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method returns the gender of the Animal
     * @return gender
     */
    public AnimalGender getGender() {
        return gender;
    }

    /**
     * This method sets the gender of the Animal
     * @param gender
     */
    public void setGender(AnimalGender gender) {
        this.gender = gender;
    }
    
     /**
     *
     */
    @Override
    public void speak() {

    }

    /**
     *
     */
    @Override
    public void move() {
    }
    

}
