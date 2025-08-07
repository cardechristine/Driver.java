//Christine Carde
//Project 1
//IT-145

import java.util.Scanner;

public class Pet {
        //Private fields
        private String petType;
        private String petName;
        private int petAge;
        private int dogSpaces = 30;
        private int catSpaces = 12;
        private int daysStay;
        private double amountDue;

        //Detailed Constructor that includes all attributes
        public Pet(String petType, String petName, int petAge, int dogSpaces, int catSpaces, int daysStay, double amountDue){
            this.petType;
            this.petName;
            this.petAge;
            this.dogSpaces;
            this.catSpaces;
            this.daysStay;
            this.amountDue;
        }
        //Getters and Setters

        //Accessor for petType
        public String getPetType() {
        return petType;
    }
        //Mutator for petType
        public void setPetType(String petType){
            this.petType;
        }
        //Accessor for petName
        public String getPetName(){
            return petName;
        }
        //Mutator for petName
        public void setPetName(String petName){
            this.petName;
        }
        //Accessor for petAge
        public int getPetAge(){
            return petAge();
        }
        //Mutator for petAge
        public void setPetAge(int petAge){
            this.petAge;
        }
        //Accessor for dog spaces
        public int getDogSpaces(){
            return dogSpaces;
        }
        //Mutator for dogSpaces
        public void setDogSpaces(int dogSpaces){
            this.dogSpaces = dogSpaces;
        }
        //Accessor for catSpaces
        public int getCatSpaces(){
            return catSpaces;
        }
        //Mutator for catSpaces
        public void setCatSpaces(int catSpaces){
            this.catSpaces = catSpaces;
        }
        //Accessor for daysStay
        public int getDaysStay(){
            return daysStay;
        }
        //Mutator for daysStay
        public void setDaysStay(int daysStay){
            this.daysStay = daysStay;
        }
        //Accessor for amountDue
        public double getAmountDue() {
            return amountDue;
        }
        //Mutator for amount due
        public void setAmountDue(double amountDue) {
            this.amountDue = amountDue;
        }

}
