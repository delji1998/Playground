#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,count;
  std::cin>>n;
  std::cout<<n;
  while(n!=1)
  {
  if(n%2==0)
  {
    n=n/2;
    std::cout<<"\n"<<n;
  }
  else
  {
      n=3*n+1;
      std::cout<<"\n"<<n;
  }
    count++;
  }
  std::cout<<"\n"<<count;
}
  