import java.util.*;

class string{
	static int num=0;
	static char op;

	public static void main(String[] args){
		ArrayList<string2> array = new ArrayList<string2>();
		int i=0;
		boolean exitStatus=false;
		Scanner in = new Scanner(System.in);
		String input=in.nextLine();
		while(exitStatus!=true){
			array.add(new string2());
			input=split(input);
			array.get(i).setInt(num);
			array.get(i).setOp(op);
			array.get(i).show();
			if(op=='e'){
				exitStatus=true;
			}
			i++;
		}
	}

	private static String split(String str){
		int x=0;
		boolean end=false;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='+'||str.charAt(i)=='-'||str.charAt(i)=='*'||str.charAt(i)=='/'){
				op=str.charAt(i);
				x=i;
				end=false;
				break;
			}
			else{
				op='e';
				x=str.length();
				end=true;
			}
		}
		String s1=str.substring(0,x);
		//System.out.println(x+"\t"+s1+"\t"+str);
		num=Integer.parseInt(s1);
		if(end==false){
			StringBuilder s = new StringBuilder();
			s.append(str);
			System.out.println(s);
			for(int i=0;i<=x;i++){
				s.deleteCharAt(0);
				//System.out.println(s);
			}
			//System.out.println(s);
			str=s.toString();
			//System.out.println("str: "+str);
		}
		return str;
	}
}

class string2{
	private int num;
	private char op='e';
	private String str;
	
	public void setInt(int x){
		num=x;
	}

	public void setOp(char c){
		op=c;
	}

	public void show(){
		if(op=='e'){
			System.out.println(num);
		}
		else System.out.println(num+"\t"+op);
	}
}
