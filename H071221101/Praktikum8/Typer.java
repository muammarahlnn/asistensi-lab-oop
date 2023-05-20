class Typer extends Thread{
    private String botName, wordsTyped;
    private double wpm;
    private TypeRacer typeRacer;

    public Typer(String botName, double wpm, TypeRacer typeRacer) {
        this.botName = botName;
        this.wpm = wpm;
        this.wordsTyped = "";
        this.typeRacer = typeRacer;
    }

    public void setBotName(String botName) {
        this.botName = botName;
    }

    public void setWpm(double wpm) {
        this.wpm = wpm;
    }

    public void addWordTyped(String newWordsTyped) {
        this.wordsTyped += newWordsTyped + " ";
    }

    public String getWordTyped() {
        return wordsTyped;
    }
    
    public String getBotName() {
        return botName;
    }

    public double getWpm() {
        return wpm;
    }
   
    @Override
    public void run() {
        String[] wordsToType = typeRacer.getWordTyped().split(" ");

        // TODO (1)
        double howLongToType = (60000 / (wpm * wordsToType.length));

        // TODO (2)
        for (String word : wordsToType) {
            try {
                sleep(MAX_PRIORITY);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            this.addWordTyped(word);
        }

        this.addWordTyped("(Selesai)");
        // TODO (3)
        synchronized (typeRacer) {
            typeRacer.addResult(this);
        }

    }

    public boolean isFinishedTyping() {
        return true;
    }
}
