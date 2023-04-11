public class Bola extends BangunRuang{

    public void hitungLuasPermukaan(){
        luasPermukaan = Math.PI*4*Math.pow(super.getJarijari(), 2);
        System.out.println("3. Bola");
        System.out.println("luas permukaan : " + luasPermukaan);
    }
    public void hitungVolume(){
        volume = 4/3 * Math.PI * Math.pow(super.getJarijari(), 3);
        System.out.println("volume : " + volume + "\n");
    }
}
