# prototypePattern
**Seatwork: Animal Cloning with Prototype Pattern**


This project implements the **Prototype Design Pattern** to create and manage animal objects through efficient cloning. The pattern allows us to create new animal instances by cloning existing prototypes without needing to know their concrete classes.

## Problem Statement

You are managing a farm system where you need to create different types of animals (Sheep, Cow, Horse) efficiently. Rather than instantiating animals from scratch each time, you want to:

- Clone pre-configured animal prototypes
- Modify cloned animals independently without affecting the originals
- Maintain a registry of prototype animals for quick access
- Support creating multiple instances of each animal type with different properties

The Prototype Pattern solves this by allowing objects to create copies of themselves, eliminating the need for complex initialization logic.

## Project Structure

```
/workspaces/prototypePatternSW/
├── Animal.java                      # Element: Cloneable interface
├── AnimalRegistry.java              # Prototype Registry: Manages and creates clones
├── Sheep.java                       # Concrete Prototype: Sheep implementation
├── Cow.java                         # Concrete Prototype: Cow implementation
├── Horse.java                       # Concrete Prototype: Horse implementation
└── TestAnimal.java                  # Main: Demonstrates the pattern
```

## Design Pattern Structure

### 1. **Prototype Interface** - `Animal`
Defines the `clone()` method that allows objects to create copies of themselves.

**Methods:**
- `clone()`: Creates a copy of the animal
- `makeSound()`: Produces the animal's sound
- `getType()`: Returns the animal type

### 2. **Concrete Prototypes** - `Sheep`, `Cow`, `Horse`
Implement the `Animal` interface and represent different animal types with their own properties.

#### `Sheep`
**Properties:**
- `legs`: Number of legs (4)
- `sound`: Sound produced ("Baa")
- `food`: Food type ("Grass")
- `name`: Individual sheep name

#### `Cow`
**Properties:**
- `legs`: Number of legs (4)
- `sound`: Sound produced ("Moo")
- `food`: Food type ("Grass")

#### `Horse`
**Properties:**
- `legs`: Number of legs (4)
- `sound`: Sound produced ("Neigh")
- `color`: Coat color

### 3. **Prototype Registry** - `AnimalRegistry`
Maintains prototype instances and provides factory methods to create cloned animals.

**Methods:**
- `createSheep()`: Creates a cloned Sheep
- `createSheep(String name)`: Creates a cloned Sheep with a name
- `createCow()`: Creates a cloned Cow
- `createHorse()`: Creates a cloned Horse

## Execution Flow

1. Create `AnimalRegistry` which instantiates prototype animals
2. Call factory methods to get clones of the prototypes
3. Modify clone properties independently
4. Display results without affecting the original prototypes

## Sample Output

```
=========================================
          ORIGINAL PROTOTYPES            
=========================================
Sheep named Dolly
Cow sounds Moo
Horse color is Chestnut

=========================================
        CLONED & MODIFIED ANIMALS        
=========================================
Sheep named Molly
Cow sounds Maa!
Cow eats Grass
Horse is Brown
=========================================
```

## Benefits of Prototype Pattern

✅ **Efficient Object Creation**: Clone existing objects instead of creating from scratch
✅ **Reduced Initialization**: Avoid complex constructor logic by starting with configured prototypes
✅ **Independent Modifications**: Modify clones without affecting original prototypes
✅ **Simplified Registry**: Centralized storage and creation of prototype instances
✅ **Flexibility**: Add new animal types by implementing the `Animal` interface

## Example Walkthrough

```java
// Create the prototype registry
AnimalRegistry registry = new AnimalRegistry();

// Clone a sheep prototype and set its name
Animal sheep = registry.createSheep("Dolly");
System.out.println(sheep.getType() + " named " + ((Sheep) sheep).getName());
// Output: "Sheep named Dolly"

// Clone a cow prototype and modify its properties
Animal cow = registry.createCow();
((Cow) cow).setSound("Maa!");
((Cow) cow).setFood("Hay");
System.out.println(cow.getType() + " sounds " + ((Cow) cow).getSound());
// Output: "Cow sounds Maa!"

// Clone a horse prototype
Animal horse = registry.createHorse();
((Horse) horse).setColor("Brown");
System.out.println(horse.getType() + " is " + ((Horse) horse).getColor());
// Output: "Horse is Brown"
```

## Key Concepts

| Concept | Implementation |
|---------|-----------------|
| **Prototype** | `Animal` interface with `clone()` method |
| **Concrete Prototype** | `Sheep`, `Cow`, `Horse` classes |
| **Registry** | `AnimalRegistry` manages prototypes |
| **Clone Operation** | `super.clone()` with try-catch for `CloneNotSupportedException` |
| **Shallow Copy** | Each clone is an independent object |

## Animal Types Comparison

| Animal | Sound | Food | Special Property |
|--------|-------|------|------------------|
| Sheep | Baa | Grass | Name |
| Cow | Moo | Grass | Sound & Food (configurable) |
| Horse | Neigh | Hay | Color |

## How to Run

Compile and run the main class:
```bash
javac *.java
java TestAnimal
```

Or use your preferred Java IDE to execute `TestAnimal.java`.

## UML Diagram
![alt text](https://github.com/ramdcrz/prototypePatternSW/blob/main/prototypePatternSW_UML.jpg)