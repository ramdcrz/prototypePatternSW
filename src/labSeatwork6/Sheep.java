package src.labSeatwork6;

public class Sheep implements Animal {
    private Integer legs = 4;
    private String sound = "Baa";
    private String food = "Grass";
    private String name;

    public void setName(String name) { this.name = name; }
    public String getName() { return this.name; }

    @Override
    public Animal clone() {
        try { return (Sheep) super.clone(); } 
        catch (CloneNotSupportedException e) { return null; }
    }
    
    @Override
    public void makeSound() { System.out.println(this.sound); }
    
    @Override
    public String getType() { return "Sheep"; }
}