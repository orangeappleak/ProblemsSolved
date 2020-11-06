#include<stdio.h>
#include<stdlib.h>
int arr[100],size;

void swap(int *a,int *b){
  int temp = *a;
  *a = *b;
  *b = temp;
}

void display(){
  int i;
  for(i=0;i<size;i++){
    printf("%d ",arr[i]);
  }
}

void quickSort(int low,int high){
  int pivot = arr[high+1];
  printf("pivot:%d\n",pivot);
  while(low<high){
    while(arr[low]<pivot){
      low++;
      printf("low is:%d\n",low);
    }
    while(arr[high]>pivot){
      high--;
      printf("high is:%d\n",high);
    }
    if(low<high) swap(&arr[low],&arr[high]);
    display();
  }
  swap(&arr[low],&pivot);
  printf("\nlow:%d\n",low);
  printf("\nhigh:%d\n",high);
  display();
  if(high>1) quickSort(0,high-1);
}

void main(){
  int i,low,high;
  printf("Enter the size of the array:");
  scanf("%d",&size);
  printf("\nEnter the elements into the array:\n");
  for(i=0;i<size;i++) scanf("%d",&arr[i]);
  low = 0;
  high = size-2;
  quickSort(low,high);
}
