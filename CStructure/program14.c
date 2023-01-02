//Program to count tokens in string

#include <stdio.h>
#include <string.h>

int main()
{
	char str[100];
    int i = 0;
    int count = 0;
    printf("Enter string : ");
    gets(str);
    while(str[i] != '\0'){
        if(str[i] == ' '){
            count++;
        }
        i++;
    }
    printf("Number of tokens : %d", count+1);
    return 0;
}


