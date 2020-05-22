#include<iostream>
int main()
{
    char str[100];
    int i=0; int len=0;
    scanf("%s",str);
    while(str[i]!='\0')
    {
        len++;
        i++;
    }
    printf("The number of letters in the name is %d",len);
    return 0;
}