#include <stdio.h>
#include <string.h>
int main()
{

    char a[100];
    char b;

    printf("Enter String : ");
    scanf("%s", a);

    printf("\nEnter Search Character : ");
    scanf("%c ", &b);

    int count = 0;
    for (int i = 0; a[i] != '\0'; i++)
    {
        if (a[i] == b)
        {
            printf("\nCharacter found at index : %d", i);
        }
        else
        {
            count++;
        }
    }
    if (count == strlen(a))
    {
        printf("\nCharacter not found");
    }

    return 0;
}