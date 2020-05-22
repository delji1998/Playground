#include <cstring>
#include <iostream>
int main()
{
   //Your code goes here
  char a[100];
  int len,count=0;
  std::cin.getline(a,100);
  len=strlen(a);
  for(int i=0;i<len;i++)
    if(a[i]==' ')
      count++;
 // std::cout<<count;
  if(count>10)
    std::cout<<"Caption not eligible for the contest";
  else
    std::cout<<"Caption eligible for the contest";
}