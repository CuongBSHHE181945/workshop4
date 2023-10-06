package DTO;

import java.util.Scanner;



public class Vase extends Item {
    private int height;
    private String material;

    public Vase() {
    }


    public Vase(int value, String creator, int height, String material) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    public void outputVase(){
        super.output();
        
        System.out.println("Height:"+height);
        System.out.println("Material:"+material);
    }
    
    public void inputVase(){
        super.input();
        
        Scanner in = new Scanner(System.in);
        boolean cont = true;
        do {
            try {
               System.out.print("Enter height: ");
               this.height = Integer.parseInt(in.nextLine());
               System.out.print("Enter material");
               this.material = in.nextLine();
               if( this.height<0||this.material.isEmpty()==true) throw new Exception();
               cont = false;
             } catch (Exception e) {
          System.out.println("Unaccepted value!");
           }
        } while (cont==true);
    }
}
