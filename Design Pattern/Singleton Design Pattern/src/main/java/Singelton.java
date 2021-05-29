import java.util.Arrays;
import java.util.LinkedList;

public class Singelton {

    private static Singelton instance = null;

    String[] scrabbleLetters = {"a", "a", "a", "a", "a", "a", "a", "a", "a",
            "b", "b", "c", "c", "d", "d", "d", "d", "e", "e", "e", "e", "e",
            "e", "e", "e", "e", "e", "e", "e", "f", "f", "g", "g", "g", "h",
            "h", "i", "i", "i", "i", "i", "i", "i", "i", "i", "j", "k", "l",
            "l", "l", "l", "m", "m", "n", "n", "n", "n", "n", "n", "o", "o",
            "o", "o", "o", "o", "o", "o", "p", "p", "q", "r", "r", "r", "r",
            "r", "r", "s", "s", "s", "s", "t", "t", "t", "t", "t", "t", "u",
            "u", "u", "u", "v", "v", "w", "w", "x", "y", "y", "z",};

    private LinkedList<String> list  = new LinkedList<>(Arrays.asList(scrabbleLetters));

    private Singelton() {}

    public static Singelton getInstance() {
        if(instance == null) {
            instance = new Singelton();
        }
        return instance;
    }

    public LinkedList<String> getLetters() {
        return instance.list;
    }

    public LinkedList<String> getTiles(int howManyTiles) {
        LinkedList<String> tiles = new LinkedList<>();
        for(int i=0;i<howManyTiles;i++) {
            tiles.add(instance.list.remove(0));
        }
        return tiles;
    }


}
