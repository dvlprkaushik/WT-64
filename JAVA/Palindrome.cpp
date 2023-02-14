#include<iostream>

using namespace std;

int main(){

    int $str,str,num1,num2=0;

    cout<<"Enter the value : ";
    cin>> str;

    $str=str;

    while (str>0)
    {
        num1=str%10;
        str=str/10;
        num2=num2*10+num1;
    }
    
    if ($str==num2)
    {
        cout << "IT IS PALINDROME";
    }

    else{
        cout << "IT IS NOT PALINDROME";
    }
    
    return 0;
    
}