import java.util.ArrayList;
import java.util.Random;
class TypeRacer {
    private String wordsToType;
    private ArrayList<Typer> raceCountestant = new ArrayList<>();
    private ArrayList<Result> raceStanding = new ArrayList<>();
    
    public String getWordsToType() {
        return wordsToType;
    }
    public ArrayList<Typer> getRaceCountestant() {
        return raceCountestant;
    }
    private String[] wordsToTypeList = {
        "Menuju tak terbatas dan melampauinya",
        // "Kehidupan adalah perjalanan yang penuh dengan lika-liku.Jadikan setiap tantangan sebagai kesempatan untuk tumbuh dan berkembang",
        // "Cinta sejati adalah ketika dua jiwa saling melengkapi,memberi dukungan dan menginspirasi satu sama lain untuk menjadi yang terbaik",
        // "Hidup adalah anugerah yang berharga.Nikmati setiap momen dan hargai kebahagiaan sederhana disekitar kita",
        // "Perubahan adalah satu-satunya konstanta dalam hidup .Yang bertahan adalah mereka yang dapat beradaptasi dengan fleksibilitas",
        // "Kebersamaan adalah fondasi yang kuat dalam membangun hubungan yang langgeng dan bermakna",
        // "Masa depan adalah milik mereka yang memiliki imajinasi,tekad dan kerja keras untuk mewujudkan visi mereka",
        // "Ketika kita berbagi dengan orang lain,kita hanya mengurangi beban mereka tetapi juga memperkaya hati kita sendiri",
        // "Kesuksesan sejati adalah ketika kita mencapai tujuan kita sambil tetap mempertahankan integritas dan empati terhadap orang lain",
        // "Rasa syukur adalah kunci untuk mengalami kebahagiaan yang sejati dalam hidup.Mencintai apa yang kita miliki adalah kunci kepuasan yang tak ternilai"
    };

    public void setNewWordsToType() {
        Random random = new Random();
        int angkaRandom = random.nextInt(wordsToTypeList.length);
        wordsToType = wordsToTypeList[angkaRandom];
    }
     // TODO (4)
    public void addResult(Typer typer) { 
        int waktu = typer.getWordsTyped() .split(" ").length * (int) (60000 / typer.getWpm()) ;
        Result result = new Result(typer.getBotName(), waktu);
        raceStanding.add(result);
    } 
    public void printRaceStanding() {
        System.out.println("\nKlasemen Akhir Type Racer");
        System.out.println("===============\n");
        
        // TODO (5)
        for (int i = 0; i < raceStanding.size(); i++) {
            int inttime = raceStanding.get(i).getFinishTime(); 
            double fixtime = (double) inttime / 1000;
            System.out.println(String.format("%d. %s = %.2f detik", i+1, raceStanding.get(i).getName(), fixtime));
        }

    }
    public void startRace() {
        // TODO (6)
        setNewWordsToType();
        for (Typer typer : raceCountestant) {
           typer.start();
        }
        // TODO (7)
        Boolean isFinish = false;
        while (true) {
            if (isFinish) {
                break;
            } else {
                if (raceStanding.size() != raceCountestant.size()) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Typing Progress....");
                    System.out.println("===================\n");
                    for (Typer pembalap : raceCountestant) {
                        System.out.println(String.format(" - %s  => %s", pembalap.getBotName(), pembalap.getWordsTyped()));
                    }
                } else {
                    isFinish = true;
                }
            }
        // TODO (8)
        }
        printRaceStanding();
    }
}

