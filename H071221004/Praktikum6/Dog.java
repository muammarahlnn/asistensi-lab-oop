abstract class Dog implements Moveble {
    protected int position; 
    protected int averageLength;

    public Dog(){

    }
    public Dog(int position, int averageLength) {
        this.position = position;
        this.averageLength = averageLength;
    }

    abstract void describe();

    int getAverageLength(){
        return averageLength;
    }
}

class Pitbul extends Dog  {
    public Pitbul(int position, int averageLength){
        super(position, averageLength);
    }

    @Override
    public
    void move(){
        System.out.printf("| Posisi baru : %d  |\n", (position + 3));

    }

    @Override
    void describe(){
        System.out.println(" ".repeat(51) + "PITBUL  DESCRIPTION");
        System.out.println(" ".repeat(50) + "-".repeat(21));
        System.out.println("\nInggris\nPitbulls are energetic and intelligent dogs that require a lot of exercise and mental stimulation.\nThey are also known for their loyalty and affection towards their owners.");
        System.out.println("\nTerjemahan\nPitbull adalah ras anjing yang energik dan cerdas yang membutuhkan banyak olahraga\ndan stimulasi mental. Mereka juga dikenal karena kesetiaan dan kasih sayangnya\nterhadap pemiliknya.");
       
    }
}

class SiberianHusky extends Dog  {
    public SiberianHusky(int position, int averageLength){
        super(position, averageLength);
    }

    @Override
    public
    void move(){
        System.out.printf("| Posisi baru : %d  |\n", (position + 2));
    }

    @Override
    void describe(){
        System.out.println(" ".repeat(47) + "SIBERIAN HUSKY DESCRIPTION");
        System.out.println(" ".repeat(46) + "-".repeat(28));

        System.out.println("\nFinlandia\nSiperianhusky on rotu koiraa, joka on tunnettu vahvasta rakenteestaan ja kestävyydestään.\nNe ovat erittäin energisiä ja tarvitsevat paljon liikuntaa ja henkistä stimulaatiota.\nSiperianhuskyt ovat myös tunnettuja uskollisuudestaan ja kiintymyksestään omistajaansa kohtaan");
        System.out.println("\nTerjemahan\nSiberian Husky adalah jenis anjing yang terkenal dengan struktur tubuhnya yang kuat dan\ndaya tahannya. Mereka sangat energik dan membutuhkan banyak latihan fisik dan\nstimulasi mental. Siberian Husky juga terkenal karena kesetiaan dan kasih sayangnya terhadap pemiliknya");
        
    }
}

class Bulldog extends Dog {
    public Bulldog(int position, int averageLength){
        super(position, averageLength);
    }

    @Override
    public
    void move(){
        System.out.printf("| Posisi baru : %d  |\n", (position + 1));
    }

    @Override
    void describe(){
        System.out.println(" ".repeat(51) + "BULLDOG DESCRIPTION");
        System.out.println(" ".repeat(50) + "-".repeat(21));
        System.out.println("\nKorea\nbuldog-eun teog-i teugjing-in geun-yugjil-ui gaelo, oemoneun gwiyeoun banmyeon, geudeul-eun\nmucheog-ina kkeungiwa yong-giga issseubnida, buldog- eun botong jij-ji\nanhgo chabunhamyeo, geotmoseub-e bihae seong-gyeog- eun onsunhabnida.\nideul-eun geonganghan sigseubgwan-eul yujihago geongang geomjin-eul badneun geos-i jung-yohabnida.");
        System.out.println("\nTerjemahan\nBulldog memiliki rahang yang kuat dan berotot, meskipun memiliki penampilan yang lucu dan\nmenggemaskan, mereka sangat sabar dan berani. Biasanya Bulldog tidak\nbanyak menggonggong dan memiliki sifat yang lembut meskipun memiliki\npenampilan yang kasar. Kesehatan mereka tergantung pada makanan sehat dan\nperawatan rutin.");
        
    }
    
}

class GermanShepherd extends Dog {
    public GermanShepherd(int position, int averageLength){
        super(position, averageLength);
    }

    @Override
    public
    void move(){
        System.out.printf("| Posisi baru : %d  |\n", (position + 3));
    }

    @Override
    void describe(){
        System.out.println(" ".repeat(47) + "GERMAN SHEPHERD DESCRIPTION");
        System.out.println(" ".repeat(46) + "-".repeat(29));
        System.out.println("\nSamoa\nO le Leoleo Mamoe Siamani ei ai tulaga lelei i le tulaga o se foliga manaia ma matagofie.\nO lenei taifau mai Siamani e lauiloa i lona usiusitai ma le faamaoni i lē e ana.\nO manu nei e iai ni uiga fa'atonu, e atamamai, faigofie ona toleni, ma tumu i le fa'amaoni.");
        System.out.println("\nTerjemahan\nGerman shepherd memiliki kelebihan dari segi penampilan yang gagah dan menawan.\nAnjing asal Jerman ini terkenal dengan kepatuhan dan kesetiaannya terhadap majikan.\nHewan tersebut memiliki karakter berwibawa, cerdas, mudah dilatih, dan penuh loyalitas.");
        
    }
}
