class Ninja {
    boolean chunin;

    void shuriken() {
        System.out.println("ya");
    }
}

class Konoha extends Ninja {
    String clan = "Konoha";
}

class Naruto extends Konoha {
    void rasengan() {
        System.out.println("oke");
    }
}

class Sasuke extends Konoha {
    void chidori() {
        System.out.println("hmmmz");
    }
}

public class Kuis02 {
    public static void main(String[] args) {
        Konoha konoha = new Konoha();
        konoha.shuriken();
    }
}
