#include<stdio.h>
#include<stdlib.h>

int length = 0;
struct Node *head = NULL;
struct Node* temp = NULL;

void insert(int);
void printList();
void delete(int);
void which_to_delete(int,int);
struct Node *getNode(int);

struct Node{
    int data;
    struct Node *next;
};

struct Node *getNode(int n){
    int count = 1;
    temp = head;
    if(count == 1 && n == 1){
        return head;
    }
    while(count<n){
        temp = temp->next;
        count++;
    }
    return temp;
    
}

void insert(int new_data){
    struct Node *new_node = NULL;
    temp = head;
    new_node = (struct Node*)malloc(sizeof(struct Node));
    length++;
    
    //if the length is zero then the list is empyty hence we make the new _node to be the head
    if(head == NULL){
        new_node->data = new_data;
        new_node->next = NULL;
        head = new_node;
        printList();
    }
    else{
       
        while(temp->next!=NULL){
            temp = temp->next;
        }
        
        new_node->data = new_data;
        new_node->next = NULL;
        temp->next = new_node;
        printList();
    }
}

void which_to_delete(int nf,int fd){
    int flag = head->data;
    int count = 2;
    int delete_pos = 0;
    temp = head;
    while(count<=nf){
        if(flag>getNode(count)->data){
            flag = getNode(count)->data;
            delete_pos = count;
        }
        count++;
    }
    printf("\n\nthe element to be deleted is:%d\n\n",delete_pos);
    delete(delete_pos);
}

void delete(int pos){
    temp = getNode(pos);
    if(getNode(pos)->next == NULL){
        getNode(pos-1)->next = NULL;
    }
    else{
        getNode(pos-1)->next = getNode(pos+1);
    }
    printList();
}

void printList(){
    temp = head;
    while(temp->next!=NULL){
            printf(" %d --> ",temp->data);
            temp = temp->next;
        }
    printf("%d --> NULL\n",temp->data);
}

int main(){
    int test_cases,i = 0,nf = 0,fd = 0,j = 0,temp = 0;
    printf("enter the nof of frds:");
    scanf("%d",&nf);
    printf("how many frds to delete:");
    scanf("%d",&fd);
    printf("enter the popularities of each frd:");
    for(i = 0;i<nf;i++){
        scanf("%d",&temp);
        insert(temp);
    }
    printf("the deletions are as follows:");
    for(i=0;i<fd;i++){
        which_to_delete(nf,fd);
        nf--;
        fd--;
    }
     which_to_delete(nf,fd);
}