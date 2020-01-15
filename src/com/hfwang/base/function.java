package com.hfwang.base;


public class function {

	public static void main(String[] args) {
		
		int year=2020;
		int num =121;
		System.out.println(year+(year(year)?"是闰年":"不是闰年"));
		System.out.println(num+(isPrime(num)?"是素数":"不是素数"));
		System.out.println(num+"开方:"+square(num));
		double num1=0.001;
		System.out.println("cos("+num1+"):"+cos(num1));
		int num2 =123231312;
		System.out.println(num2+(isPalindome(num2)?"是回文":"不是回文"));
		int mon=1;
		int day=8;
		System.out.println(year+"."+mon+"."+day+"是该年第"+dayRank(year,mon,day)+"天");
		System.out.println(year+"."+mon+"."+day+"是星期"+week(year,mon,day));
		int[][] Monlist = printCal(year,mon);
		for(int i=0;i<Monlist.length;i++){
			for(int j=0;j<Monlist[i].length;j++){
				System.out.print(Monlist[i][j]+" ");
				
			}
			System.out.print('\n');	
		}
		int[][] list = loop(5);
		for(int i=0;i<list.length;i++){
			for(int j=0;j<list[i].length;j++){
				System.out.print(list[i][j]+" ");				
			}
			System.out.print('\n');	
		}
		
	}	


	static int[][] loop(int n){
		int[][] loopArray=new int[n][n];
		int loopTime;
		int value = 1;
		if(n%2!=0){
			loopTime=n/2+1;
		}else{
			loopTime=n/2;
		}
		
		for(int i=0;i<loopTime;i++){
//			for(int j=i;j<n-i;j++){
//				loopArray[i][j]=value++;
//			}
//			for(int j=i+1;j<n-i;j++){
//				loopArray[j][n-i-1]=value++;
//			}
//			for(int j=n-i-2;j>=i;j--){
//				loopArray[n-i-1][j]=value++;
//			}
//			for(int j=n-i-2;j>i;j--){
//				loopArray[j][i]=value++;
//			}
			for(int j=i;j<n-i;j++){
				loopArray[i][j]=value++;
			}
			for(int j=i+1;j<n-i-1;j++){
				loopArray[j][n-i-1]=value++;
			}
			for(int j=n-i-1;j>=i+1;j--){
				loopArray[n-i-1][j]=value++;
			}
			for(int j=n-i-1;j>=i+1;j--){
				loopArray[j][i]=value++;
			}
		
		}
		return loopArray;
				
	}
	
	//输出日历
	static int[][] printCal(int year,int mon){
		int[] dayMon = {31,28,31,30,31,30,31,31,30,31,30,31};
		if(year(year)) dayMon[1]=29;
		int day1week=week(year,mon,1);
		int[][] Mon = new int[6][7];
		for(int i=0;i<Mon.length;i++){
			for(int j=0;j<Mon[i].length;j++){
				if(i==0) Mon[i][j]=j;	
			}
		}
		for(int i=1;i<=dayMon[mon+1];i++){
			int j,k;
			int monRank=7+day1week+i-1;
			j=monRank/7;
			k=monRank%7;
			Mon[j][k]=i;	
		}
		return Mon;
	}
	
	//计算该日为星期几
	static int week(int year,int mon,int day){
		int dayTo1990 = 0;
		for(int i=1990;i<year;i++){
		dayTo1990 += (year(i)?366:365);
		}
		dayTo1990 += dayRank(year,mon,day);
		return dayTo1990%7;
	}
	
		
	//计算该日在此年的排名
	static int dayRank(int year,int mon,int day){
		int dayrank=0;
		switch(mon-1) {
		case 11 : dayrank=dayrank+30;
		case 10 : dayrank=dayrank+31;
		case 9 : dayrank=dayrank+30;
		case 8 : dayrank=dayrank+31;
		case 7 : dayrank=dayrank+31;
		case 6 : dayrank=dayrank+30;
		case 5 : dayrank=dayrank+31;
		case 4 : dayrank=dayrank+30;
		case 3 : dayrank=dayrank+31;
		case 2 : dayrank=dayrank+28+(year(year)?1:0);
		case 1 : dayrank=dayrank+31;
		case 0 : dayrank=dayrank+day;
		}
		return dayrank;
	}

	//判断是否回文数
	static boolean isPalindome(int num){
		int num1=num;
		int size=1;
		while(num1>=10){
			num1=num1/10;
			size++;
		}
		int[] list=new int[size];
		for(int i=0;i<list.length;i++){			
			list[i]=num%10;
			num=num/10;
		}
		int i;
		for(i=0;i<list.length;i++){
			if(list[i]!=list[list.length-1-i]) break;
		}
		if(i==list.length) return true;
		return false;
		
	}
	//判断是否是闰年
	static boolean year(int m){
			
		return((m%4==0&&m%100!=0)||(m%400==0));
			
	}
	//判断是否是素数
	static boolean isPrime(int m){
		int i;	
		for(i=2;i<m;i++){
			if(m%i==0)	
			return true;			
		}
		return false;
	}
	//开方
	static double square(double num){
		double x1=1;
		double x2=2;
		while(Math.abs(x1-x2)>1E-6){
			x1=x2;
			x2=0.5*(x1+num/x1);
		}
		return x1;		
	}
	//cos(x)
	static double cos(double x){
		int flag=1;
		int i=1;
		double cos=1;
		while((Math.pow(x,2*i)/jiechen(2*i))>1E-6){
			flag=-flag;			
			cos+=flag*(Math.pow(x,2*i)/jiechen(2*i));		
			i++;
		}
		return cos;
	}
	//求x的阶乘
	static double jiechen(int x){
		double ji=1;
		for(int i=1;i<=x;i++){
			ji=ji*i;
		}
		return ji;
	}
}
