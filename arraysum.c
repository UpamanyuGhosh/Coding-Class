#include <stdio.h>
int main(){
	int size1,size2,size3,array1[size1],array2[size2],sum[10];
	int a,b,c,d;
	printf("\n Enter The Size Of The First Array");
	scanf("\n %d",&size1);
	
	printf("\n Enter The Size Of The Second Array");
	scanf("\n %d",&size2);
	
	printf("\n Enter The Size Of The Third Array");
	scanf("\n %d",&size3);
	
	printf("\n Enter The First Array's Value \n");
	for(a=0 ; a< size1 ; a++){
		scanf("\n %d",&array1[a]);
	}

printf("\n Enter The Seconds Array's Value \n"); 
for (b=0 ; b<size2 ; b++ ){
	scanf("\n %d",&array2[b]);
	}

for(c=0 ; c < size3 ; c++){
	sum[c] = array1[c] + array2[c] ;  
}
for (d=0 ; d<size3 ; d++){
	printf("\n The Sum Of the 2 Arrays is %d ",sum[d]);
}
return 0;
} 	


