public class Publisher {
    String publisher, alamat;

    public String getPublisherAlamat(){
        return  getPublisher() + " dan " + getAlamat();
    }
    public Publisher(String publisher, String alamat){
        this.publisher = publisher;
        this.alamat = alamat;
    }
    public void setPublisher(String publisher){
        this.publisher = publisher;
    }
    public String getPublisher(){
        return publisher;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    public String getAlamat(){
        return alamat;
    }
}