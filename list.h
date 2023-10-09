#include "node.h"
#include<iostream>
#include<cstdlib>
#include<cstddef>
using namespace std;

class list{
    node* head=NULL;
    node* tail=NULL;
    int size=0;
    public:
    void add(int n)
    {node* newNode = (node*)calloc(1,sizeof(node));
    newNode->elem=n;
    newNode->next=NULL;
        if(head==NULL)
        {
            newNode->prev=NULL;
            tail=newNode;
            head=newNode;
            
            size++;
            return;
        }
        tail->next=newNode;
        newNode->prev=tail;
        tail=newNode;
        size++;
        return;
    }

    void print(){
    node* curr=head;
    while(curr)
    {
    cout<<curr->elem<<" ";
    curr=curr->next;
    }
    }
    

int corner(int a, int b)
    {
    node*x=NULL;
    node* y=NULL;
    int i=a;
    
    //to initialized nodes if it shouldnt be NULL;
    if(a>0){
    x=head;      
    }
    if(b>0){
    y=tail;
    }
    //ends here   

    // for the left side
    while(i>1){
    
    x=x->next;
    i--;
    }
    i=b;
   //ends here

   //for the right side
    while(i>1){
    y=y->prev;
    i--;
    }
    //ends here

    //if node x is null
    if(!x){
        if(y){         //if node y is not null, then it should be head given that node 
        head=y;
         size=a+b;
        return size;
        }
        else{          //if both nodes are null, then head and tail should be null and the list would be empty
        head=NULL;
        tail=NULL;
        size=0;
        return 0;
        }    
    }
    
    if(!y)           //if node y is null the  node x should be the tail as the right side of it will be removed
    {
    tail=x;
    size=a;
    return size;
    }
    // to link both nodes if none of them are null
    x->next=y;
    y->prev=x;
    size=a+b;
    return size;
        
        
    }
    
};