#include <stdio.h>
int main()
{

printf("What is your name?");
char u2[50];
scanf("%s", &u2);
printf("Welcome to the karate exam, %s \n",u2);

int u4;	
printf("What is your age?");
printf("My age is \n");
scanf("%d", &u4);

char u5[50];
printf("For which belt are you applying for? \n");
scanf("%s", &u5);

printf("So the details are that You are %s, your age is %d and you are apllying for %s",u2,u4,u5);

return 0;
}

