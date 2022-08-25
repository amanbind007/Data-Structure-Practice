//Create a hello world program in C.
#include <stdio.h>
int main()
{
    printf("Enter string : ");
    char a[1000];
    scanf("%s", a);
    int i = 0;
    while(a[i] != '\0'){
        i++;
    }
    printf("Total : %d", i);
    return 0;
}