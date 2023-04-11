public class Balok extends BangunRuang{
    
    public void hitungLuasPermukaan(){
        luasPermukaan = 2*(getPanjang()*getLebar()) + 2*(getPanjang()*getTinggi()) + 2*(getLebar()*getTinggi());
        System.out.println("2. Balok");
        System.out.println("luas permukaan : " + luasPermukaan);
    }

    public void hitungVolume(){
        volume = getPanjang()*getLebar()*getTinggi();
        System.out.println("volume :" + volume + "\n");
    }



}
