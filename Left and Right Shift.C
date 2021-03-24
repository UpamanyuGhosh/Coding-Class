#include<stdio.h>
int main(){
  int a,a1;
  printf("HERE I HAVE USED LEFT SHIFT AND RIGHT SHIFT \n");
  printf("Enter 1st Number");
  scanf("\n %d",&a);
  printf("\n Enter 2nd Number");
  scanf("\n %d",&a1);
  printf("\n Therefore Left Shift of %d by %d number of times is %d",a,a1,a<<a1);
  printf("\n Therefore Right Shift of %d by %d number of times is %d",a,a1,a>>a1);
  int b=a<<a1;
  int b1=a>>a1;
  printf("\n The Sum Of The left and right shift is %d",b+b1);
  return (0);
  }
