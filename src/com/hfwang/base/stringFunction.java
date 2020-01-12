package com.hfwang.base;

public class stringFunction {

	public static void main(java.lang.String[] args) {
	System.out.println(feibo(6));	
	char[] itoaList = iTostring(100);
	System.out.println(itoaList.toString());
//	char a = 'a';
	for(int i=0;i<itoaList.length;i++){
		System.out.print(itoaList[i]);
	}
	System.out.println("");
	int num = stringToint("24233434");
	System.out.println(num);
	
	double num1 = stringTodouble("3.1415");
	System.out.println(num1);
	//System.out.println((char)('0'+1));
	
	char[] encodingList = toEncoding("abcd 1234 ABCD",-20);	
	for(int i=0;i<encodingList.length;i++){
		System.out.print(encodingList[i]);
	}
	System.out.println(" ");
	
	char[] backList = back("abcd 1234 ABCD");	
	for(int i=0;i<backList.length;i++){
		System.out.print(backList[i]);
	}
	
	}
	
	
//斐波那契数列递归生成	
	static int feibo(int m){
		if(m==1||m==2) return 1;
		return feibo(m-1)+feibo(m-2);
	}
//int转成char[]
	public static char[] iTostring(int m){
		int intsize=1;
		int num=m;
		while(num>=10){
			num=num/10;
			intsize++;
		}
		num=m;
		char[] numlist = new char[intsize];
		for(int i=intsize-1;i>=0;i--){
			numlist[i]=(char)(num%10+'0');
			num=num/10;
		}
		return numlist;
	}
//string转成int	
	public static int stringToint(String s ){
		int num=0;
		char[] stringlist =s.toCharArray();
		int[] intlist = new int[stringlist.length];
		for(int i=0;i<intlist.length;i++){
			intlist[i]=(stringlist[i]-'0');
		}
		for(int i=0;i<intlist.length;i++){
			num+=intlist[i]*(Math.pow(10, (intlist.length-i-1)));
		}	
		return num;
	}
//stringTodouble
	static double stringTodouble(String s){

		char[] stringlist = s.toCharArray();
		int dotLocation=0;
		for(int i=0;i<stringlist.length;i++){
			if(stringlist[i]=='.') dotLocation=i; 
		}
		double num=0;
		for(int i=0;i<stringlist.length;i++){
			if(i<dotLocation) num+=(stringlist[i]-'0')*Math.pow(10,(dotLocation-i-1));
			else if (i>dotLocation) num+=(stringlist[i]-'0')*Math.pow(10,(dotLocation-i));
			else continue;
		}
		return num;	
	}
//string编码
	static char[] toEncoding(String s,int key){
		char[] stringlist = s.toCharArray();
		for(int i=0;i<stringlist.length;i++){
			if(stringlist[i]<='9'&&stringlist[i]>='0'){
				stringlist[i]=(char) (stringlist[i]+key%10);
				if(stringlist[i]>'9'){
					stringlist[i]=(char)(stringlist[i]-'9'+'0');
				}
				if(stringlist[i]<'0'){
					stringlist[i]=(char)(stringlist[i]+'9'-'0');
				}
			}
			if(stringlist[i]<='z'&&stringlist[i]>='a'){
				stringlist[i]=(char) (stringlist[i]+key%26);
				if(stringlist[i]>'z'){
					stringlist[i]=(char)(stringlist[i]-'z'+'a');
				}
				if(stringlist[i]<'a'){
					stringlist[i]=(char)(stringlist[i]+'z'-'a');
				}
			}
			if(stringlist[i]<='Z'&&stringlist[i]>='A'){
				stringlist[i]=(char) (stringlist[i]+key%26);
				if(stringlist[i]>'Z'){
					stringlist[i]=(char)(stringlist[i]-'Z'+'A');
				}
				if(stringlist[i]<'A'){
					stringlist[i]=(char)(stringlist[i]+'Z'-'A');
				}
			}			
			if(stringlist[i]==' '){
				stringlist[i]=' ';
			}
		}
		return stringlist;
	}
//词组内的单词逆序
	static char[] back(String s){
		char[] stringlist = s.toCharArray();
		int Location1=0;
		int Location2=0;
		char temp =' ';
		for(int i=0;i<stringlist.length;i++){
			if(stringlist[i]==' '){
				Location2=i-1;
				for(int a=Location1;a<=(Location2+Location1)/2;a++){
					temp=stringlist[a];
					stringlist[a]=stringlist[Location1+Location2-a];
					stringlist[Location1+Location2-a]=temp;
				}
				Location1=Location2+2;
			}		
		}
		Location2=stringlist.length-1;
		for(int a=Location1;a<=(Location2+Location1)/2;a++){
			temp=stringlist[a];
			stringlist[a]=stringlist[Location1+Location2-a];
			stringlist[Location1+Location2-a]=temp;
		}
		return stringlist;
				
	}



}
