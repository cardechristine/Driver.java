public class Monkey extends RescueAnimal{

    //Instance Variables
    private tailLength;
    private height;
    private bodyLength;
    private species;

    //Constructor with inluded monkey attributes
    public Monkey(String name, String gender, String age,
                  String weight, String tailLength, String height, String bodyLength, String species, String acquisitionDate,String acquisitionCountry,
                  String trainingStatus, boolean reserved, String inServiceCountry)
    {
        setName(name);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setTailLength(tailLength);
        setHeight(height);
        setBodyLength(bodyLength);
        setSpecies(species);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
        setAnimalType("monkey"); // This line ensures animalType is set.

    }
    //Accessor Method for tail length
    public String getTailLength() { return tailLength; }

    //Mutator Method for tail length
    public void setTailLength(String monkeyTailLength) { tailLength = monkeyTailLength; }

    //Accessor for height
    public String getHeight() { return height; }

    //Mutator for height
    public void setHeight(String monkeyHeight) { height = monkeyHeight; }

    //Accessor for body length
    public String getBodyLength() { return bodyLength; }

    //Mutator for body length
    public void setBodyLength(String monkeyBodyLength) { bodyLength = monkeyBodyLength; }

    //Accessor for species
    public String getSpecies() { return species;}

    //Mutator for species
    public void setSpecies(String monkeySpecies) {species = monkeySpecies;}

}
