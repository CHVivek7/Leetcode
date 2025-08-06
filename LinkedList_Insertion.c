#include<stdio.h>
#include<stdlib.h>
struct Node{
    int data;
    struct Node *next;
};
struct Node *head = NULL;
void insert_Begin(int data){
    struct Node *newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->data = data;
    newNode->next = head;
    head = newNode;
}
void insert_End(int data){
    struct  Node *newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->data = data;
    newNode->next = NULL;
    if(head == NULL){
        head = newNode;
        return;
    }else{
        struct Node *temp = head;
        while(temp->next != NULL){
            temp = temp->next;
        }
        temp->next = newNode;
    }
}

int main(){
    bool flag = true;
    while (flag){
        int choice;
        printf("Enter 1 for Insertion at Beginning\n");
        printf("Enter 2 for Insertion at End\n");
        printf("Enter 3 for Display\n");
        printf("Enter 4 for Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);
        switch(choice){
            case 1:
                int data;
                printf("Enter the data : ");
                scanf("%d", &data);
                insert_Begin(data);
                break;
            case 2:
                int data1;
                printf("Enter the data : ");
                scanf("%d", &data1);
                insert_End(data1);
                break;
            case 3:
                struct Node *temp = head;
                while(temp != NULL){
                    printf("%d ", temp->data);
                    temp = temp->next;
                }
                printf("\n");
                break;
            case 4:
                flag = false;
                break;
            default:
                printf("Invalid Choice\n");
                break;
        }
    }
}
