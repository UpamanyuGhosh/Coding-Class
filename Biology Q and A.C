#include<stdio.h>
int main(){
	int a,b,c,d;
	printf("This is a question answer session based on Biology \n");
	printf("First question is how many bones are there in the human body?\n");
	scanf("\n %d",&a);
	if(a==206){
		printf("Good Job!! %d is Correct \n",a);
	}
	else
	{
		printf("Nice Try. %d is incorrect \n",a);
	}
	printf("2nd Question is, How many muscles are there approximately in the human body?\n");
	scanf("\n %d",&b);
	if(b==650){
		printf("Good Job!! %d is Correct \n",b);
	}
	else
	{
		printf("\n Hard Luck!! %d is incorrect \n",b);
	}
	printf("3rd Question is, How many fingers are there in total in your body? \n");
	scanf("\n %d",&c);
	if(c==20){
		printf("\n Good Job!! %d is Correct \n",c);
	}
	else
	{
		printf("\n Try Again,%d is incorrect \n",c);
	}
	printf("4th Question is, How many rib bones are present in a human body? \n");
	scanf("\n %d",&d);
	if(d==24){
		printf("Good Job!!  %d is correct \n",d);
	}
	else
	{
		printf("\n Sorry. %d is incorrect \n",d);
	}
	
}\
