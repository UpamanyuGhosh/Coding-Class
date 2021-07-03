#include <stdio.h>

int main(){
	struct code{
	char name[1000];
};
	struct code code1,code2,code3;
	printf("\n Enter The Code Of A Triangle \n");
    scanf("\n %s",code1.name );
   	printf("\n Enter The Code Of A Rectangle \n");
    scanf("\n %s ",code1.name);
   	printf("\n Enter The Code Of Hollow Right Angled Triangle \n");
    scanf("\n %s",code3.name);
printf("\n The Code Of The 1st Pattern(Triangle) is %s",code1.name);
printf("\n The Code Of The 2nd Patter(Rectangle) is %s",code2.name);
printf("\n The Code Of The 3rd Pattern(Hollow Right Angle Triangle) is %s",code3.name);
}

