/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bmi;

/**
 *
 * @author LENOVO
 */
public class CalBMI {
    
    private String Name;
    private int Age;
    private double Height;
    private double Weight;

    public CalBMI(String Name, int Age, double Height,double Weight) {
        this.Name = Name;
        this.Age = Age;
        this.Height = Height;
        this.Weight=Weight;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public double getHeight() {
        return Height;
    }

    public double getWeight() {
        return Weight;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public void setHeight(double Height) {
        this.Height = Height;
    }

    public void setWeight(double Weight) {
        this.Weight = Weight;
    }
    
    
    public double CalculateBMI(double Height, double Weight ){
        
        return (Weight/(Height*Height));
        
    }
    
    
}
