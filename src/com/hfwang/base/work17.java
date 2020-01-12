package com.hfwang.base;

public class work17 {

	public static void main(String[] args) {
	
	double cos=0,x=0.001;
	int i=0;
	int ji=1;
	int flag=1;

	while(Math.pow(x,2*i)/ji>1E-6)
	{
		cos=cos+flag*(Math.pow(x,2*i)/ji);
		flag=flag*(-1);
		i++;
		for(int a=1;a<=i;a++)
			ji=ji*a;
	}
	System.out.println(cos);
	}

}
