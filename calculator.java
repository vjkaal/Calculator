import java.util.*;

class calculator{
    private int num;
    private char op;

    public void getNum(int x){
        num=x;
    }

    public void getOp(char c){
		op=c;
    }

    public void setNum(int res){
        num=res;
    }

    public void put(){
        System.out.println(num+" "+op);
    }

    public char putOp(){
        return op;
    }

    public int putNum(){
        return num;
    }
}
