abstract class Dog {
    int position;
    int averageLength;

    public Dog(int position, int averageLength) {
        this.position = position;
        this.averageLength = averageLength;
    }
    abstract void move();
    abstract void describe();
}