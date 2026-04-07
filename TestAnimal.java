public class TestAnimal {
    public static void main(String[] args) {
        AnimalRegistry registry = new AnimalRegistry();

        System.out.println("=========================================");
        System.out.println("          ORIGINAL PROTOTYPES            ");
        System.out.println("=========================================");
        
        Animal sheep = registry.createSheep("Dolly"); 
        Animal cow = registry.createCow();
        Animal horse = registry.createHorse();
        
        System.out.println(sheep.getType() + " named " + ((Sheep) sheep).getName());
        System.out.println(cow.getType()   + " sounds " + ((Cow) cow).getSound());
        System.out.println(horse.getType() + " color is " + ((Horse) horse).getColor());

        System.out.println("\n=========================================");
        System.out.println("        CLONED & MODIFIED ANIMALS        ");
        System.out.println("=========================================");

        // Instructor's Sheep modification
        Animal sheep2 = registry.createSheep();
        ((Sheep) sheep2).setName("Molly");
        System.out.println(sheep2.getType() + " named " + ((Sheep) sheep2).getName());

        // Instructor's Cow modification
        Animal cow2 = registry.createCow();
        ((Cow) cow2).setFood("Grass");
        ((Cow) cow2).setSound("Maa!");
        System.out.println(cow2.getType() + " sounds " + ((Cow) cow2).getSound());
        System.out.println(cow2.getType() + " eats " + ((Cow) cow2).getFood());

        // Instructor's Horse modification
        Animal horse2 = registry.createHorse();
        ((Horse) horse2).setColor("Brown");
        System.out.println(horse2.getType() + " is " + ((Horse) horse2).getColor());
        
        System.out.println("=========================================");
    }
}