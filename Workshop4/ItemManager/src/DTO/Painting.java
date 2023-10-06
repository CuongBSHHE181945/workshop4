package DTO;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Painting extends Item {
    private int height;
    private int width;
    private boolean isWaterColour;
    private boolean isFramed;

    public Painting() {
    }

    public Painting(int value, String creator, int height, int width, boolean isWaterColour, boolean isFramed) {
        super(value, creator);
        this.height = height;
        this.width = width;
        this.isWaterColour = isWaterColour;
        this.isFramed = isFramed;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean isIsWaterColour() {
        return isWaterColour;
    }

    public void setIsWaterColour(boolean isWaterColour) {
        this.isWaterColour = isWaterColour;
    }

    public boolean isIsFramed() {
        return isFramed;
    }

    public void setIsFramed(boolean isFramed) {
        this.isFramed = isFramed;
    }
    
    public void outputPainting(){
        super.output();
        
        System.out.println("Height:"+this.height);
        System.out.println("Width:"+this.width);
        System.out.println("isWaterColour:"+this.isWaterColour);
        System.out.println("isFramed"+this.isFramed);
    }
    
    public void inputPainting(){
        super.input();
        
        Scanner in = new Scanner(System.in);
        boolean cont = true;
        do {
            try {
               System.out.print("Enter height: ");
               this.height = Integer.parseInt(in.nextLine());
               System.out.print("Enter width: ");
               this.width = Integer.parseInt(in.nextLine());
               if( this.height<0 || this.width<0) throw new Exception();
               cont = false;
             } catch (Exception e) {
          System.out.println("Unacceptable value!");
           }
        } while (cont==true);
        
        cont = true;
        do {
            try {
                System.out.print("Is it water coloured or not (true or false)");
                this.isWaterColour = in.nextBoolean();
                cont = false;
            } catch (InputMismatchException e) {
                System.out.println("Input mismatch");
                in.nextLine();
            }
        } while (cont==true);
        
        cont = true;
        do {
            try {
                System.out.print("Is it framed or not (true or false)");
                this.isFramed = in.nextBoolean();
                cont = false;
            } catch (InputMismatchException e) {
                System.out.println("Input mismatch");
                in.nextLine();
            }
        } while (cont==true);
    }
    
}
