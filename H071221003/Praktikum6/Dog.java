public abstract class Dog {
    protected int position;
    protected int averageLength;
    
    public Dog(int position, int averageLength) {
        this.position = position;
        this.averageLength = averageLength;
    }
    
    public abstract void describe();
    
    public void move() {
        position += getPositionIncrement();
    }
    
    protected abstract int getPositionIncrement();
}


class Pitbull extends Dog {
    public Pitbull(int position, int averageLength) {
        super(position, averageLength);
    }
    
    @Override
    public void describe() {
        System.out.println("Ras Pitbull memiliki tubuh yang kuat dan otot yang terlihat jelas.");
    }
    
    @Override
    protected int getPositionIncrement() {
        return 3;
    }
}


class SiberianHusky extends Dog {
    public SiberianHusky(int position, int averageLength) {
        super(position, averageLength);
    }
    
    @Override
    public void describe() {
        System.out.println("Ras Siberian Husky memiliki bulu tebal dan memiliki ukuran yang besar.");
    }
    
    @Override
    protected int getPositionIncrement() {
        return 2;
    }
}


class Bulldog extends Dog {
    public Bulldog(int position, int averageLength) {
        super(position, averageLength);
    }
    
    @Override
    public void describe() {
        System.out.println("Ras Bulldog memiliki kepala yang besar dan cekung, serta memiliki lipatan pada wajah.");
    }
    
    @Override
    protected int getPositionIncrement() {
        return 1;
    }
}


class GermanShepherd extends Dog {
    public GermanShepherd(int position, int averageLength) {
        super(position, averageLength);
    }
    
    @Override
    public void describe() {
        System.out.println("Ras German Shepherd memiliki bulu pendek dan tebal, serta memiliki ukuran yang besar.");
    }
    
    @Override
    protected int getPositionIncrement() {
        return 3;
    }
}
