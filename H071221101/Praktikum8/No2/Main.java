package No2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        TypeRacer typeRacer = new TypeRacer();
        typeRacer.setNewWordsToType();
        System.out.println("||  Text to Type  ||");
        System.out.println("\"" + typeRacer.getWordsToType() + "\"");

        Typer[] typers = new Typer[3];

        typers[0] = new Typer("Bot Armin", 80, typeRacer);
        typers[1] = new Typer("Bot Akaashi", 65, typeRacer);
        typers[2] = new Typer("Bot Chigiri", 77, typeRacer);

        typeRacer.getRaceContestant().addAll(Arrays.asList(typers));

        typeRacer.startRace();
    }
}
