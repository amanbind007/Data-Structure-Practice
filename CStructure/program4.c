#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main()
{
    FILE *ptr;
    char ch;

    ptr = fopen("program1.c", "r");
    if (ptr == NULL)
    {
        printf("Error!");
    }
    while ((ch = fgetc(ptr)) != EOF)
    {
        putchar(ch);
    }
    fclose(ptr);
    return 0;
}