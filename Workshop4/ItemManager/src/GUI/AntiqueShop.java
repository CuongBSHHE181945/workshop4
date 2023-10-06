package GUI;

import DTO.Item;
import DTO.Painting;
import DTO.Statue;
import DTO.Vase;
import java.util.Scanner;

public class AntiqueShop {
    public static void main(String[] args) {
        String[] options= {"Create a vase","Create a statue","Create a painting","Display the item","exit"};
        Item item = null;
        int choice =0;
        Scanner sc = new Scanner(System.in);
        do {
            choice = Menu.getChoice(options);
            switch (choice) {
                case 1: 
                        item =new Vase();
                        ((Vase)item).inputVase();
                        break;
                case 2:
                        item = new Statue();
                        ((Statue)item).inputStatue();
                        break;
                case 3:
                        item = new Painting();
                        ((Painting)item).inputPainting();
                        break;
                case 4:
                        if(item!=null){
                            if (item instanceof Vase)
                                ((Vase)item).outputVase();
                            else if (item instanceof Statue)
                                ((Statue)item).outputStatue();
                            else if (item instanceof Painting)
                                ((Painting)item).outputPainting();
                        }
                        else 
                            System.out.println("You need to create an object!");
                            break;
                case 5: System.out.println("Exit!");
                        break;
            }
        } while (choice>0&&choice<=4);
    }
}
