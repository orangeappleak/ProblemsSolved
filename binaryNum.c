#include<stdio.h>
#include<stdlib.h>
#include<math.h>

void decToBin(int);

void decToBin(int n){
    int binaryNum[32];
    int i = 0,j=0;
    while(n > 0){
        binaryNum[i] = n%2;
        n = n/2;
        i++;
    }

    for(j=i-1;j>=0;j--){
        printf("%d",binaryNum[j]);
    }
}

int main(){
    int i =0 ;
    for(i=0;i<10;i++){
        decToBin(i);
        printf("\n");
    }
    return 0;
}