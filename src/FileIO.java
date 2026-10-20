import java.io.*;
import java.util.Scanner;

public class FileIO {
/*
    public void readData(String path, Deck deck){

        File file = new File(path);
        try {
            Scanner scan = new Scanner(file);
            scan.nextLine();//skip header
            while(scan.hasNextLine()){
                String s = scan.nextLine();// "Instatiering , kfdksadfkaflækfadskljafdslkadfsklæfdas"
                String[] values = s.split(",");//
                String term = values[0] ;
                String description = values[1];
                boolean status = Boolean.parseBoolean(values[2]);
                FlashCard fc = new FlashCard (term, description, status);
                deck.addCard(fc);
            }

        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("der findes kun 2 værdier pr. række");
        }

    }
    public void saveData(String path, Deck deck){

        try{
            FileWriter writer = new FileWriter(path);
            //todo: gennemløb listen med objekter og skriv hvert objekt til filen

            for(FlashCard element : deck.getCards()) {
                writer.write(element.toCSV());// Void, Void is an method that simply does what you specify within that segment it does not return anything at all. simply does it and moves on., false

            }
            writer.close();

        } catch (IOException e) {

        }
    }
    */

}
