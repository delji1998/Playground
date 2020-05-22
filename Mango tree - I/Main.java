#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,d,e;
  std::cin>>a>>b>>c;
  d=a*b;
  e=d-b;
  if(c==1)
    std::cout<<"Yes";
  else if(c<=b)
    std::cout<<"Yes";
  else if(c==d)
    std::cout<<"Yes";
  else if(c%b==1)
    std::cout<<"Yes";
  else
    std::cout<<"No";
}