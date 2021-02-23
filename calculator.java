import java.util.*;

class calculator{
    private int num;
    private char op;
    private int entPress=0;
    Scanner in=new Scanner(System.in);

    public void getNum(){
        System.out.print("Enter number: ");
        num=in.nextInt();
    }

    public void getOp(){
        System.out.print("Enter operation: ");
        op=in.next().charAt(0);
        if(op=='e'){
            entPress=1;
        }
    }

    public int putEntPress(){
        return entPress;
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
