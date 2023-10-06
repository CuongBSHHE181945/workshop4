package DTO;

import java.util.Scanner;



public class Statue extends Item {
    private int weight;
    private String colour;

    public Statue() {
    }

    public Statue(int value, String creator, int weight, String colour) {
        super(value, creator);
        this.weight = weight;
        this.colour = colour;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    
    public void outputStatue(){
        super.output();
        
        System.out.println("Weight:"+weight);
        System.out.println("Colour:"+colour);
    }
    
    public void inputStatue(){
        super.input();
        
        Scanner in = new Scanner(System.in);
        boolean cont = true;
        do {
            try {
               System.out.print("Enter weight: ");
               this.weight = Integer.parseInt(in.nextLine());
               System.out.print("Enter colour: ");
               this.colour = in.nextLine();
               if( this.weight<0 || this.colour.isEmpty()==true) throw new Exception();
               cont = false;
             } catch (Exception e) {
          System.out.println("Unacceptable value!");
           }
        } while (cont==true);
    }
}
