public class Tabung extends BangunRuang {
    
    public void hitungLuasPermukaan(){
        luasPermukaan = Math.PI*2*super.getJarijari()*getTinggi() + Math.PI*2* Math.pow(super.getJarijari(), 2);
        System.out.println("4. Tabung");
        System.out.println("luas permukaaan : " + luasPermukaan);
    }

    public void hitungVolume(){
        volume = Math.PI* Math.pow(super.getJarijari(), 2)*getTinggi();
        System.out.println("volume : " + volume + "\n");
    }
}
