import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.*;
import java.io.File;

public class main {
    public static void main(String[] args) throws IOException,LineUnavailableException,UnsupportedAudioFileException
    {
        Scanner scanner = new Scanner(System.in);
        File file = new File("level_up.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip= AudioSystem.getClip();
        clip.open(audioStream);
       
        
        String response="";

        while(!response.equals("Q"))
        {
            System.out.println("P = play, S = stop,R = reset,Q = quit");
            System.out.println("Enter your Choice:");

            response=scanner.next();
            response=response.toUpperCase();

            switch(response)
            {
                case("P"):clip.start();
                break;
                case("S"):clip.stop();
                break;
                case("R"):clip.setMicrosecondPosition(0);
                break;
                case("Q"):clip.close();
                break;
                
                default: System.out.println("this is not a valid response");

            }
            

        }

    }
}
