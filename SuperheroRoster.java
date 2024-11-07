public class SuperheroRoster {
 
    public static void main(String[] args) {
        // 1. Declare and initialize arrays for hero names, abilities, and power levels
 
        // Example:
        // String[] heroNames = {...};
        // String[] abilities = {...};
        // int[] powerLevels = {...};

        String[] heroNames = {"Spider-Man", "Iron Man", "Black Widow"};
        String[] abilities = {"Web-slinging", "Flying and high-tech armor", "Stealth and combat"};
        int[] powerLevels = {85, 90, 80};
 
        // 2. Print each hero's details using a loop
        // for (int i = 0; i < heroNames.length; i++) { ... }

        for (int i = 0; i < heroNames.length; i++)
        {
            System.out.println("Hero: " + heroNames[i] + ", Ability: " + abilities[i] + ", Power levels: " + powerLevels[i]);
        }
 
        // 3. Call the searchHero method to find a specific hero by name

        String targetHero = "Iron Man";
        searchHero(heroNames, abilities, powerLevels, targetHero);
 
        // 4. Calculate and display the average power level by calling calculateAveragePower method

        double averagePower = calculateAveragePower(powerLevels);
        System.out.println("Average power level: " + averagePower);

        Superhero[] superheros = new Superhero[heroNames.length];
        for (int i = 0; i < heroNames.length; i++)
        {
            superheros[i] = new Superhero(heroNames[i], abilities[i], powerLevels[i]);
            superheros[i].displayHero();
        }
 
    }
 
    // Method: searchHero
    public static void searchHero(String[] names, String[] abilities, int[] powerLevels, String target) {
        // Implement a loop to search for the hero by name
        // If found, print the hero's details
        // If not found, display a message

        boolean found = false;
        for (int i = 0; i < names.length; i++)
        {
            if (names[i].equalsIgnoreCase(target))
            {
                System.out.println("Found Hero: " + names[i] + ", Ability: " + abilities[i] + ", Power levels: " + powerLevels[i]);
                found = true;
                break;
            }
        }
        if (!found)
        {
            System.out.println("Hero not found: " + target);
        }

    }
 
    // Method: calculateAveragePower
    public static double calculateAveragePower(int[] powerLevels) {
        // Implement the calculation for average power level
        // Return the calculated average

        int sum = 0;
        for (int power : powerLevels)
        {
            sum += power;
        }

        return (double) sum / powerLevels.length; // Placeholder return value
    }
}


class Superhero {
    // Declare attributes: name, ability, and powerLevel
 
    // Constructor to initialize name, ability, and powerLevel


    private String name;
    private String ability;
    private int powerLevel;

    public Superhero(String name, String ability, int powerLevel)
    {
        this.name = name;
        this.ability = ability;
        this.powerLevel = powerLevel;
    }
 
    // Method: displayHero
    public void displayHero() {
        // Print the hero's name, ability, and power level

        System.out.println("Hero: " + name + ", Ability: " + ability + ", Power levels: " + powerLevel);
    }
}