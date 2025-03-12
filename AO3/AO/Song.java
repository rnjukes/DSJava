package AO3.AO;
//Ryan Jukes
//3-11-25
//AT Java 

import javax.sound.sampled.LineUnavailableException;
import AO3.AO.ToneGenerator.Note;

public class Song {
    public static void main(String[] args) throws LineUnavailableException {
    ToneGenerator x = new ToneGenerator();
        x.init();
        x.play(Note.E4, 200);
        x.play(Note.REST, 50);
        x.play(Note.D4, 200);
        x.play(Note.REST, 50);
        x.play(Note.C4, 200);
        x.play(Note.REST, 50);
        x.play(Note.D4, 200);
        x.play(Note.REST, 50);
        x.play(Note.E4, 200);
        x.play(Note.REST, 50);
        x.play(Note.E4, 200);
        x.play(Note.REST, 50);
        x.play(Note.E4, 400);
        x.play(Note.REST, 50);
}
}
