#include <stdio.h>
int main(){
int a,b,c,d,size;
	printf("\n Please Enter The Number Of Rows You Want To Print The Star");
	scanf("\n %d",&size);
printf("\n Now the star patter is printed in a reverse order \n");
	for(c = size ; c >= 0 ; c--){
	for(d = 1 ; d <= c ; d++){
		
			printf(" * ");

	}
printf("\n");
	}
	for(a = 1 ; a <= size ; a++){
	for(b = 1 ; b <= a ; ++b){
		
			printf(" * ");

	}
printf("\n");
	}
}
