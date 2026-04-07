package src.labSeatwork6;

public class Horse implements Animal {
    private Integer legs = 4;
    private String sound = "Neigh";
    private String food = "Hay";
    private String color = "White"; // Default

    public void setColor(String color) { this.color = color; }
    public String getColor() { return this.color; }

    @Override
    public Animal clone() {
        try { return (Horse) super.clone(); } 
        catch (CloneNotSupportedException e) { return null; }
    }
    
    @Override
    public void makeSound() { System.out.println(this.sound); }
    
    @Override
    public String getType() { return "Horse"; }
}