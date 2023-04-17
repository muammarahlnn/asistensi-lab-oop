// NO 1
public class MedsosKreditur{
    String email;
    String twitter;

    public String getMedsos(){
        return "\n-----------------------------------------------" + "\n| email\t  : " + getEmail()+ "\t      |" + "\n| twitter : " + getTwitter() + "\t\t      |";
    }
    public MedsosKreditur(String email, String twitter){
        this.email = email;
        this.twitter = twitter;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
    public void setItwitter(String twitter){
        this.twitter = twitter;
    }
    public String getTwitter(){
        return twitter;
    }   
    
}