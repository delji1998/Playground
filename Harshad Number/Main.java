#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,s=0,t,d;
  std::cin>>n;
  t=n;
  while(n>0)
  {
   d=n%10;
   //std::cout<<d;
   s+=d;
   n=n/10;
  }
//  std::cout<<s;
  if(t%s==0)
    std::cout<<"Harshad Number";
  else
    std::cout<<"Not Harshad Number";
}