#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  //Type your code here.
  char s1[50];
  char s2[50];
  int len1=0,len2=0;
  int i,j,f=0;
  cin.getline(s1,50);
  cin.getline(s2,50);
  len1=strlen(s1);
  len2=strlen(s2);
  i=len1-1;
  j=0;
  while(s1[i]!='\0'&&s2[j]!='\0')
  {
    if(s1[i]!=s2[j])
    {
      f=1;
      break;
    }
    i--;
    j++;
  }
  if(f==0)
    std::cout<<"It is correct";
  else
    std::cout<<"It is wrong";
}