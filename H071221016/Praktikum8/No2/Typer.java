class Typer extends Thread {
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
    public void setwpm(int wpm) {
        this.wpm = wpm;
    }
    public void addWordTyped(String newWordsTyped) {
        this.wordsTyped += newWordsTyped  + " ";
    }
    public String getWordsTyped() {
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
        String[] worsdToType = typeRacer.getWordsToType().split(" ");
         // TODO (1)
        int howLongToType = (int) (60000 / wpm);
        for (String word : worsdToType) { // todo (2)
            try {
                Thread.sleep((long) howLongToType);
                this.addWordTyped(word);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    // this.addWordTyped(word + " ");
        }
        this.addWordTyped("(selesai)");
        typeRacer.addResult(this);// TODO (3)
    }
}
