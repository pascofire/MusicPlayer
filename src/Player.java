import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;

public class Player {
    String path;

    public Player(String path) {
        this.path = path;
    }

    public void playAudio() {
        try (
                Scanner scan = new Scanner(System.in);
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(new File(path))
        ) {
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            String response = "";

            clip.start();
            while (!response.equals("Q")) {
                System.out.println("P to play, S to stop, R to restart, Q to quit: ");
                response = scan.nextLine().toUpperCase();

                switch (response) {
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid input");
                }

            }
        } catch (UnsupportedAudioFileException e) {
            System.out.println("Unsupported audio file.");
        } catch (LineUnavailableException e) {
            System.out.println("Audio line unavailable.");
        } catch (IOException e) {
            System.out.println("I/O error occurred.");
        } finally {
            System.out.println("Bye!");
        }
    }


}
