#include<iostream>
#include<string>
using namespace std;
int main() 
{ 
	std::string fnum;
	//Type your code here
    int i,size;
    getline(cin,fnum);
	size=fnum.length();
    for(i=0;i<size;i++)
      if(fnum[i]!='.')
        continue;
      else
        break;
	std::cout<<"Floating part is : ";
i++;
  for(;i<size;i++)
    std::cout<<fnum[i];
}
