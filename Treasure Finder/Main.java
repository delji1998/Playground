#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n1,n2,n3;
  int large,p,i;
  std::cin>>n1>>n2>>n3;
  if(n1>=n2&&n1>=n3)
  {
    if(n2>=n3)
      p=n2;
    else
      p=n3;
  }
 
  else if(n2>=n3&&n2>=n1)
  {
    if(n1>=n3)
      p=n1;
    else
      p=n3;
  }
  else
  {
    if(n1>n2)
      p=n1;
    else
      p=n2;
  } 
  std::cout<<"The treasure is in box which has number "<<p<<"\n";
  if(n1>=n2&&n1>=n3)
    large=n1;
  else if(n2>=n2&&n2>=n3)
    large=n2;
  else
    large=n3;
  for(i=large;i>=1;i--)
  {
    if(n1%i==0 && n2%i==0 && n3%i==0)
      break;
  }
  std::cout<<"The code to open the box is "<<i;
}