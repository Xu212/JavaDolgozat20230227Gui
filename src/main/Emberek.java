package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Emberek {
    private List<Ember> dolgozok;
        public void FajlOlvasas() throws IOException{
        String hely = "emberek.txt";
        Path path = Paths.get(hely);
        List<String> olvasott = Files.readAllLines(path);
        String fejlec = olvasott.get(0);
        olvasott.remove(0);
        dolgozok = new ArrayList<Ember>();
        for (String string : olvasott) {
            String[]e = string.split(";");
            if(e.length==3){
                dolgozok.add(new Ember(e[0], Integer.parseInt(e[1]), e[2].charAt(0)));
            }
            else if(e.length==3){
                dolgozok.add(new Ember(e[0], Integer.parseInt(e[1]), e[2].charAt(0),Integer.parseInt(e[3])));
            }
        }
    }

    public List<Ember> getDolgozok() {
        return dolgozok;
    }
        
}
