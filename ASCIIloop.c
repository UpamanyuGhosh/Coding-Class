#include <stdio.h>
int main() {  
    int c,a;
    char d,e;
    printf("\n Enter a character: ");
    scanf("\n %c", &d);  
    
    printf("ASCII value of %c = %d", d, d);
    
    printf("\n Enter another character: ");
    scanf("\n %c", &e);  
    
    printf("\n ASCII value of %c = %d", e, e);
    int f=d; 
    int b=e;
    c=f;
   a=c;
   do{
   	printf("\n %c",a);
   	++a;
   }while(a<=b);

    
    return 0;
}
