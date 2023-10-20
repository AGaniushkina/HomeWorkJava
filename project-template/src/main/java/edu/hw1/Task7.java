package edu.hw1;

public class Task7 {

    int rotetedLeft;
    int rotetedRight;

    Task7(int x, int shift){
        rotetedLeft = rotateLeft(x, shift);
        rotetedRight = rotateRight(x, shift);
    }

    public static int rotateLeft(int n, int shift){
        return (n << shift) | (n >> (Integer.SIZE - shift));
    }

    public static int rotateRight(int n, int shift){
        return (n >> shift) | (n << (Integer.SIZE - shift));
    }


}
