// NO 1
import java.text.NumberFormat;
import java.util.Locale;

public class Kurensi {
        double uang;

        public double getUangUSD(){
            return getUang();
        }

        public Kurensi(double uang){
            this.uang = uang;
        }
        public void setUang(double uang){
            this.uang = uang;
        }
        public double getUang(){
            return uang;
        }

        
        public void CekKekayaan(){
            System.out.println("-".repeat(40));
            System.out.println("\nkekayaan kreditur mencapai $".toUpperCase() + uang);
        
        NumberFormat kurensiUS = NumberFormat.getCurrencyInstance(Locale.US);{
            System.out.printf("Harga Dolar: %s %n", kurensiUS.format(uang) + "\n");
            System.out.println("-".repeat(40)+"\n");
        }

        }
}
        

    

