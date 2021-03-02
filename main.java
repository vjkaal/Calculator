import java.util.*;

class main{
    private static int num=0;
	private static char op;

	public static void main(String[] args){
        //list takes className and not object of class
        ArrayList<calculator> array= new ArrayList<calculator>();
        int i=0;
		boolean entPressed=false;
		Scanner in = new Scanner(System.in);
        String input=in.nextLine();
		while(entPressed!=true){
            array.add(new calculator());
			input=split(input);
            array.get(i).getNum(num);
            array.get(i).getOp(op);
            //array.get(i).put();
            if(op=='e'){
				//System.out.println("yes");
				entPressed=true;
                
				for(int j=0;j<array.size();j++){
                    if(array.get(j).putOp()=='/'){
                        int res=division(array.get(j).putNum(),array.get(j+1).putNum());
                        array.get(j+1).setNum(res);
                        array.remove(j);
                    }
				}

				for(int j=0;j<array.size();j++){
					if(array.get(j).putOp()=='*'){
                        int res=product(array.get(j).putNum(),array.get(j+1).putNum());
                        array.get(j+1).setNum(res);
                        array.remove(j);
                    }
                }
                
				for(int j=0;j<array.size();j++){
                    if(array.get(j).putOp()=='+'){
                        int res=add(array.get(j).putNum(),array.get(j+1).putNum());
                        array.get(j+1).setNum(res);
                        array.remove(j);
                    }
				}

				for(int j=0;j<array.size();j++){
                    if(array.get(j).putOp()=='-'){
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

	private static String split(String str){
		int placeHolder=0;//must be at pos = end_of_substring + 1
		boolean end=false;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='+'||str.charAt(i)=='-'||str.charAt(i)=='*'||str.charAt(i)=='/'){
				op=str.charAt(i);
				placeHolder=i;
				end=false;
				break;
			}
			else{
				op='e';//EXIT_CODE
				placeHolder=str.length();
				end=true;
			}
		}
		//get number substring
		String numStr=str.substring(0,placeHolder);
		num=Integer.parseInt(numStr);

		//delete extra from input string
		if(end==false){
			StringBuilder s = new StringBuilder();
			s.append(str);
			for(int i=0;i<=placeHolder;i++){
				s.deleteCharAt(0);
			}
			str=s.toString();
		}
		//System.out.println(str);
		return str;
	}

    private static int add(int x,int y){
        y+=x;
        return y;
    }

    private static int subtract(int x,int y){
        y=x-y;
        return y;
    }

    private static int product(int x,int y){
        y*=x;
        return y;
    }

    private static int division(int x,int y){
        y=x/y;
        return y;
    }
}
