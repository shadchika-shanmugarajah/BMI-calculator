/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

/**
 *
 * @author LENOVO
 */
public class Fruit {
    
   private String Name;
  private  String Type;
   private  String Image;
    private String Color;

    public Fruit(String Name, String Type, String Image, String Color) {
        this.Name = Name;
        this.Type = Type;
        this.Image = Image;
        this.Color = Color;
    }

    public String getName() {
        return Name;
    }

    public String getType() {
        return Type;
    }

    public String getImage() {
        return Image;
    }

    public String getColor() {
        return Color;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public void setImage(String Image) {
        this.Image = Image;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }
    
    
    
}
