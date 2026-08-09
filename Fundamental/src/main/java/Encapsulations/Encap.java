package Encapsulations;

public class Encap {
    private int a;
    private int b;
    private Float c;

    public void setA(int x){
        this.a = x;
    }
    public void setB(int x){
        if(x != 0){
            this.b = x;
        }
    }
    public int getA(){
        return a;
    }
    public int getB(){
        return b;
    }
    public float getC(){
        if(b != 0)
            c = (float) a / b;
        else
            c = (float) 0;
        return  c;
    }

}
