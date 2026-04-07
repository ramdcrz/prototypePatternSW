public class Cow implements Animal {
    private Integer legs = 4;
    private String sound = "Moo";
    private String food = "Grass";

    public void setSound(String sound) { this.sound = sound; }
    public String getSound() { return this.sound; }
    
    public void setFood(String food) { this.food = food; }
    public String getFood() { return this.food; }

    @Override
    public Animal clone() {
        try { return (Cow) super.clone(); } 
        catch (CloneNotSupportedException e) { return null; }
    }
    
    @Override
    public void makeSound() { System.out.println(this.sound); }
    
    @Override
    public String getType() { return "Cow"; }
}