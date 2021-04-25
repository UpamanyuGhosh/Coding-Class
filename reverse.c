#include<stdio.h>
void main(){
	int a,b=0, c;
	printf("\n Enter a number");
	scanf("\n %d",&a);
	while(a != 0){
		c = a%10;
		b = b*10 +c;
		a = a/10;
	}
	printf("\n Reverse of the number is %d",b);
	
}
