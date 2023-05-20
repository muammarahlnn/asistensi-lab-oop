import java.util.ArrayList;
import java.util.Random;

class TypeRacer {
    private String wordsToType;
    private ArrayList<Typer> raceContestant = new ArrayList<>();
    private ArrayList<Result> raceStanding = new ArrayList<>();

    public String getWordsToType() {
        return wordsToType;
    }

    private void raceStanding(Typer typer) {
    }

    public ArrayList<Typer> getRaaceContestant() {
        return raceContestant;
    }

    // word by Yususf Syam, Silahkan diubah jika dirasa kurang bijak
    private String[] wordsToTypeList = { "Menuju tak terbatas dan melampauinya",
            "Kehidupan adalah perjalanan yang penuh dengan lika-liku. Jadikan setiap tantangan sebagai kesempatan untuk tumbuh dan berkembang",
            "Cinta sejati adalah ketika dua jiwa saling melengkapi, memberi dukungan dan menginspirasi satu sama lain untuk menjadi yang terbaik",
            "Hidup adalah anugerah yang berharga. Nikmati setiap momen dan hargai kebahagiaan sederhana di sekitar kita",
            "Perubahan adalah satu-satunya konstanta dalam hidup. Yang bertahan adalah mereka yang dapat beradaptasi dengan fleksibilitas",
            "Kebersamaan adalah fondasi yang kuat dalam membangun hubungan yang langgeng dan bermakna",
            "Masa depan adalah milik mereka yang memiliki imajinasi, tekad, dan kerja keras untuk mewujudkan visi mereka",
            "Ketika kita berbagi dengan orang lain, kita tidak hanya mengurangi beban mereka, tetapi juga memperkaya hati kita sendiri",
            "Kesuksesan sejati adalah ketika kita mencapai tujuan kita sambil tetap mempertahankan integritas dan empati terhadap orang lain",
            "Rasa syukur adalah kunci untuk mengalami kebahagiaan yang sejati dalam hidup. Mencintai apa yang kita miliki adalah kunci kepuasan yang tak ternilai", };

    public void setNewWordsToType() {
        Random random = new Random();
        int angkaRandom = random.nextInt(10);
        wordsToType = wordsToTypeList[angkaRandom];
    }

    // TODO (4)
    public void addResult(Typer[] typeRaceTable) {
        for (Typer typer : typeRaceTable) {
            if (typer.isFinishedTyping()) {
                raceStanding(typer);
            }
        }
    }

    private void printRaceStanding() {
        System.out.println("\nKlasemen Akhir Type Racer");
        System.out.println("=".repeat(30) + "\n");

        // TODO (5)
            int position = 1;
            for (Result result : raceStanding) {
                System.out.println(position + "." + result.getBotName() + " = " + result.getWordsTyped() + " | "
                        + result.getWpm() + " WPM");
                position++;
        }
    }

    public void startRace() {
        // TODO (6)
        try {
            for (Typer typer : raceContestant) {
                typer.start();
                typer.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // TODO (7)
        for (Typer typer : raceContestant) {
            System.out.println("- " + typer.getBotName() + "\t=> " + typer.getWordTyped());
            System.out.println("-".repeat(50));
        }
        try {
            Thread.sleep(2000);
            System.out.println("\n" + "#".repeat(50));
            System.out.println("\nTyping Progress ...");
            System.out.println("=".repeat(20) + "\n");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // TODO (8)
        printRaceStanding();
    }

    public String getWordTyped() {
        return wordsToType;
    }

    public void addResult(Typer typer) {
    }
}
