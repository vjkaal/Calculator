import java.util.*;

class main{
    public static void main(String[] args){
        //list takes className and not object of class
        ArrayList<calculator> array= new ArrayList<calculator>();
        int i=0;
        int entPressed=0;
        while(entPressed!=1){
            array.add(new calculator());
            array.get(i).getNum();
            array.get(i).getOp();
            array.get(i).put();
            if(array.get(i).putEntPress()==1){
                entPressed=1;
                for(int j=0;j<array.size();j++){
                    if(array.get(j).putOp()=='d'||array.get(j).putOp()=='D'){
                        int res=division(array.get(j).putNum(),array.get(j+1).putNum());
                        array.get(j+1).setNum(res);
                        array.remove(j);
                    }
                    else if(array.get(j).putOp()=='m'||array.get(j).putOp()=='M'){
                        int res=product(array.get(j).putNum(),array.get(j+1).putNum());
                        array.get(j+1).setNum(res);
                        array.remove(j);
                    }
                }
                for(int j=0;j<array.size();j++){
                    if(array.get(j).putOp()=='a'||array.get(j).putOp()=='A'){
                        int res=add(array.get(j).putNum(),array.get(j+1).putNum());
                        array.get(j+1).setNum(res);
                        array.remove(j);
                    }
                    else if(array.get(j).putOp()=='s'||array.get(j).putOp()=='S'){
                        int res=subtract(array.get(j).putNum(),array.get(j+1).putNum());
                        array.get(j+1).setNum(res);
                        array.remove(j);
                    }
                }
                System.out.println(array.get(0).putNum());
            }
            i++;
        }
    }

    public static int add(int x,int y){
        y+=x;
        return y;
    }

    public static int subtract(int x,int y){
        y=x-y;
        return y;
    }

    public static int product(int x,int y){
        y*=x;
        return y;
    }

    public static int division(int x,int y){
        y=x/y;
        return y;
    }
}
