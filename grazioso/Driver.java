import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    // Instance variables (if needed)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        initializeDogList();
        initializeMonkeyList();

        while (true) {
            displayMenu(); // Add a loop that displays the menu
            String userInput = scanner.nextLine().trim().toLowerCase(); //accepts user input

            switch (userInput) { //takes the appropriate action
                case "1" -> intakeNewDog(scanner);
                break;
                case "2" -> intakeNewMonkey(scanner);
                break;
                case "3" -> reserveAnimal(scanner);
                break;
                case "4", "5", "6" -> printAnimals();
                break;
                case 'q' -> System.out.println("Goodbye!");
                return; //exits the program
                default -> System.out.println("Invalid selection. Please enter a valid selection.");

            }
        }

        // Add a loop that displays the menu, accepts the users input
        // and takes the appropriate action
        // For the project submission you must also include input validation
        // and appropriate feedback to the user.
        // Hint: create a Scanner and pass it to the necessary
        // methods
        // Hint: Menu options 4, 5, and 6 should all connect to the printAnimals() method.

    }

    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Adds monkeys to a list for testing
//Optional for testing
    public static void initializeMonkeyList() {
        Monkey monkey1 = new Monkey("Regis", "female", "4", "19.2", "11.1", "2.8", "3.78", "Macaque", "03-10-2018", "Thailand", "Intake", false, "United States");
        Monkey monkey2 = new Monkey("Arnold", "male", "6", "25.3", "12.5", "3", "48.5", "Capuchin", "07-22-2020", "Cambodia", "Phase 2", true, "Australia");

        monkeyList.add(monkey1);
        monkeyList.add(monkey2);
    }


    // Complete the intakeNewDog method
// The input validation to check that the dog is not already in the list
// is done for you
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for (Dog dog : dogList) {
            if (dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }
        System.out.println("What is the dog's breed?");
        String breed = scanner.nextLine();

        System.out.println("What is the dog's gender?");
        String gender = scanner.nextLine();

        System.out.println("What is the dog's age?");
        String age = scanner.nextLine();

        System.out.println("What is the dog's weight?");
        String weight = scanner.nextLine();

        System.out.println("What is the dog's acquisition date?");
        String acquisitionDate = scanner.nextLine();

        System.out.println("What is the dog's acquisition country?");
        String acquisitionCountry = scanner.nextLine();

        System.out.println("What is the dog's training status?");
        String trainingStatus = scanner.nextLine();

        System.out.println("Is this dog reserved? (true/false)");
        boolean reserved = scanner.nextBoolean();

        System.out.println("Which country will the dog be serving in?");
        String inServiceCountry = scanner.nextLine();

        // Add the code to instantiate a new dog
        Dog newDog = new Dog(name, breed, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry);
        // and add it to the appropriate list
        dogList.add(newDog);

        System.out.println("Dog successfully added to the list!");
    }


    // Complete intakeNewMonkey
//Instantiate and add the new monkey to the appropriate list
// For the project submission you must also  validate the input
// to make sure the monkey doesn't already exist and the species type is allowed
    public static void intakeNewMonkey(Scanner scanner) {
        System.out.println("What is the monkey's name?");
        String name = scanner.nextLine();
        for (Monkey monkey : monkeyList) {
            if (monkey.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis monkey is already in our system\n\n");
                return; //returns to menu
            }
        }
        System.out.println("What is the monkey's gender");
        String gender = scanner.nextLine();

        System.out.println("What is the monkey's age?");
        String age = scanner.nextLine();

        System.out.println("What is the monkey's weight?");
        String weight = scanner.nextLine();

        System.out.println("What is the length of the monkey's tail?");
        String tailLength = scanner.nextLine();

        System.out.println("What is the length of the monkey's body?");
        String bodyLength = scanner.nextLine();

        System.out.println("What is the monkey's height?");
        String height = scanner.nextLine();

        //Validate species
        String[] allowedSpecies = {"Capuchin", "Guenon", "Macaque", "Marmoset", "Squirrel Monkey", "Tamarin"}; //Declares allowed species
        String species = ""; //variable to store user input
        boolean validSpecies = false;
        while (!validSpecies) { //keeps looping until input becomes valid
            System.out.println("What is the monkey's species?");
            species = scanner.nextLine();
            for (String allowed : allowedSpecies) {
                if (allowed.equalsIgnoreCase(species)) { //checks if user input is equal to any of the species in the allowed array
                    validSpecies = true;
                    break; //exits the loop
                }
            }
            if (!validSpecies) { //if species is invalid
                System.out.println("Invalid species. Allowed: Capuchin, Guenon, Macaque, Marmoset, Squirrel Monkey, Tamarin");
            }

            System.out.println("What is the monkey's acquisition date?");
            String acquisitionDate = scanner.nextLine();

            System.out.println("What is the monkey's acquisition country?");
            String acquisitionCountry = scanner.nextLine();

            System.out.println("What is the monkey's training status?");
            String trainingStatus = scanner.nextLine();

            System.out.println("Is this monkey reserved? (true/false)");
            boolean reserved = scanner.nextBoolean();

            System.out.println("Which country will the monkey be serving in?");
            String inServiceCountry = scanner.nextLine();

            // Add the code to instantiate a new monkey
            Monkey newMonkey = new Monkey(name, gender, age, weight, tailLength, height, bodyLength, species, acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry);
            // and add it to the appropriate list
            MonkeyList.add(newMonkey);

            System.out.println("Monkey successfully added to the list!");
        }
    }

    // Complete reserveAnimal
    // You will need to find the animal by animal type and in service country
    public static void reserveAnimal(Scanner scanner) {
        System.out.println("Enter the animal type to reserve (dog or monkey): ");
        String animalType = scanner.nextLine().toLowerCase();

        //validates animal type
        if (!animalType.equals("dog") && !animalType.equals("monkey")) {
            System.out.println("Invalid animal type. Please choose dog or monkey.");
            return;
        }
        System.out.println("Enter the country where the animal will be in service: ");
        String inServiceCountry = scanner.nextLine();

        boolean found = false; //have not found the animal yet

        if (animalType.equals("dog")) {
            for (Dog dog : dogList) {
                if (dog.getInServiceCountry().equalsIgnoreCase(inServiceCountry) && !dog.isReserved()) { //if dog is in the country and not reserved
                    dog.setReserved(true); //sets the dog as reserved
                    System.out.println(dog.getName() + "has been reserved.");
                    found = true; //animal has been found
                    break;

                }
            }

        } else if (animalType.equals("monkey")) {
            for (Monkey monkey : monkeyList) {
                if (monkey.getInServiceCountry().equalsIgnoreCase(inServiceCountry) && !monkey.isReserved()) { //if monkey is in the country and not reserved
                    monkey.setReserved(true); //sets the monkey as reserved
                    System.out.println(monkey.getName() + " has been reserved.");
                    found = true; //animal has been found
                    break;

                }
            }
        }
        if (!found) {
            System.out.println("No available " + animalType + " found in " + inServiceCountry);
        }

    }

    public static void printAnimals(String option) {

        //option 4 Print a list of all dogs
        if (option.equals("4")) {
            System.out.println("\n **** List of All Dogs ***");
            for (Dog dog : dogList) {
                System.out.println("Name: " + dog.getName()
                        + ", Breed: " + dog.getBreed()
                        + ", Gender: " + dog.getGender()
                        + ", Age: " + dog.getAge()
                        + ", Weight: " + dog.getWeight()
                        + ", Acquisition Date " + dog.getAcquisitionDate()
                        + ", Acquisition Location " + dog.getAcquisitionLocation()
                        + ", Training Status: " + dog.getTrainingStatus()
                        + ", Reserved: " + dog.isReserved()
                        + ", In Service Country: " + dog.getInServiceCountry())
            }
        }
        //option 5 Print a list of all monkeys
        else if (option.equals("5")) {
            System.out.println("\n **** List of All Dogs ***");
            for (Monkey monkey : monkeyListList) {
                System.out.println("Name: " + monkey.getName()
                        + ", Gender: " + monkey.getGender()
                        + ", Age: " + monkey.getAge()
                        + ", Weight: " + monkey.getWeight()
                        + ", Tail Length: " + monkey.getTailLength()
                        + ", Height: " + monkey.getHeight()
                        + ", Body Length " + monkey.getBodyLength()
                        + ", Species " + monkey.getSpecies()
                        + ", Acquisition Date " + monkey.getAcquisitionDate()
                        + ", Acquisition Location " + monkey.getAcquisitionLocation()
                        + ", Training Status: " + dog.getTrainingStatus()
                        + ", Reserved: " + dog.isReserved()
                        + ", In Service Country: " + dog.getInServiceCountry());


            }
        }
        //option 6 Print animals that are not reserved
        else if (option.quals("6")) {  //dogs
            System.out.println("\n *** Available Dogs ***");
            for (Dog dog : dogList) {
                if (!dog.isReserved()) {
                    System.out.println("Name: " + dog.getName()
                            + ", Breed: " + dog.getBreed()
                            + ", In Service Country: " + dog.getInServiceCountry()
                            + ", Training Status: " + dog.getTrainingStatus());
                }
            }
            System.out.println("\n *** Available Monkeys ***"); //monkeys
            for (Monkey monkey : monkeyList) {
                if (!monkey.isReserved()) {
                    System.out.println("Name: " + monkey.getName()
                            + ", Species: " + monkey.getSpecies()
                            + ", In Service Country: " + monkey.getInServiceCountry()
                            + ", Training Status: " + monkey.getTrainingStatus());
                }
            }
        } else { //unexpected input
            System.out.println("Invalid option");
        }
    }
}