#include<iostream>
#include<cstdlib>
#include<cstddef>
#include "list.h"
using namespace std;



int main(){
list* l=new list();
char op;
int elem,x;
    
    do{
        cout<<endl<<"Enter Operation: ";
        cin>>op;
        switch(op){
            case 'D':
            break;
            case 'a':
            cout<<"Enter an integer: ";
            cin>>elem;
            l->add(elem);
            break;
            case 'p':
             l->print();
            break;
            case 'c':

             cout<<"Enter x: ";
            cin>>elem;
             cout<<"Enter y: ";
            cin>>x;
            cout<<"Linkedlist size: "<<l->corner(elem,x);
            break;
            default:
            cout<<"Not found"<<endl;
            break;
            
                
                
            
        }
        
    }while(op!='D');
  
    
}