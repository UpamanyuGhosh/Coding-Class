#include <stdio.h>
int main(){
    int a,b,size;
    printf("\n Enter the size of the array");
    scanf("\n %d",&size);
    int array[size];
    for(a=1 ; a <= size ; a++){
        printf("\n Enter the value of element %d is	",a);
        scanf("\n %d",&array[a]);
    }
    for(b = 1 ; b <= size ; b++ ){
        if( array[1] < array[b] ){
          array[1] = array[b] ;  
        } 
        }printf("\n The maximum number is %d ",array[1]);
            }
    

