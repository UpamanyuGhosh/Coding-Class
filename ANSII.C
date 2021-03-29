#include<stdio.h>
int main(){
	char a,b,c,d,e,f;
	int g = + ;
	
	printf("\n Enter The 1st Number Whose ASCII Value You Want To Print \n");
	scanf("\n %c",&a);

	printf("\n Enter The 2nd Number Whose ASCII Value You Want To Print \n");
	scanf("\n %c",&b);
	
	printf("\n The ASCII Value Of %c is %d",a,a);
	
	printf("\n The ASCII Value Of %c is %d",b,b);

printf("\n Now we will see the SUM/DIFFERENCE/PRODUCT/QUOTIENT of the 2 ASCII values");
printf("\n Please note that all the operations will occur only from the first nuber to the second number.");
printf("\n Please enter this sign --> +");
scanf ("\n %c",&c);
if (c==+){
	printf("\n The sum of %d and %d is %d",a,b,a+b);
}else {
	printf("\n Try the + sign");
}
printf("\n Please enter this sign --> -");
scanf ("\n %c",&d);
if(d==-){
	printf("\n The Difference of %d and %d is %d",a,b,a-b);
}else {
	printf("\n Try the - sign");
	}
	printf("\n Please enter this sign --> *");
scanf ("\n %c",&e);
if(e==*){
	printf("\n The Product of %d and %d is %d",a,b,a*b);
}else {
	printf("\n Try the * sign");
}
	printf("\n Please enter this sign --> /");
scanf ("\n %c",&f);
if(f==/){
	printf("\n The Quotient of %d and %d is %d",a,b,a/b);
}else {
	printf("\n Try the \ sign");
}
