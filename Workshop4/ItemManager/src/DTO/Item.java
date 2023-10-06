package DTO;

import java.util.Scanner;


public class Item {
    private int value;
    private String creator;

    public Item() {
    }

    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    
    public void output(){
        System.out.println("Value:"+this.value);
        System.out.println("Creator: "+ this.creator);
    }
    
    public void input(){
        Scanner in = new Scanner(System.in);
        boolean cont = true;
        do {
            try {
               System.out.print("Enter value: ");
               this.value = Integer.parseInt(in.nextLine());
               System.out.print("Enter creator: ");
               this.creator = in.nextLine();
               if( this.value<0 || this.creator.isEmpty()==true) throw new Exception();
               cont = false;
             } catch (Exception e) {
          System.out.println("Unacceptable value!");
           }
        } while (cont==true);
    }
    
}
