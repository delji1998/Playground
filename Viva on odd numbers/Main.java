#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float s=0;
  int num,count=0;
  do
  {
    std::cin>>num;
    if(num<0)
    {
      s=s-1;
      break;
    }
    else if(num%2==0)
      s=s-0.5;
    else
    {
      s=s+1;
      count++;
    }
  }while(count!=3);
   std::cout<<s;
}