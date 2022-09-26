

#include <stdio.h>
#include <string.h>
#include <stdlib.h>

// Counting Number of special characters, keywordsi dentifiers in c program
int main()
{
    FILE *f1, *f2, *f3;
    char c, str[10], st1[10];
    int num[100], lineno = 0, tokenvalue = 0, i = 0, j = 0, k = 0;
    f1 = fopen("demo_program.txt", "r");
    f2 = fopen("identifier", "w");
    f3 = fopen("specialchar", "w");
    while ((c = getc(f1)) != EOF)
    {
        if (isdigit(c))
        {
            tokenvalue = c - '0';
            c = getc(f1);
            while (isdigit(c))
            {
                tokenvalue *= 10 + c - '0';
                c = getc(f1);
            }
            num[i++] = tokenvalue;
            ungetc(c, f1);
        }
        else if (isalpha(c))
        {
            putc(c, f2);
            c = getc(f1);
            while (isdigit(c) || isalpha(c) || c == '_' || c == '$')
            {
                putc(c, f2);
                c = getc(f1);
            }
            putc(' ', f2);
            ungetc(c, f1);
        }
        else if (c == ' ' || c == '\t')
            printf(" ");
        else if (c == '\n')
            lineno++;
        else
            putc(c, f3);
    }
    fclose(f2);
    fclose(f3);
    fclose(f1);
    printf("\n the no's in the program are:");
    for (j = 0; j < i; j++)
        printf("\t%d", num[j]);
    printf("\n");
    f2 = fopen("identifier", "r");
    while ((c = getc(f2)) != EOF)
    {
        if (c == ' ')
        {
            str[k] = '\0';
            keyword(str);
            k = 0;
        }
        else
            str[k++] = c;
    }
    fclose(f2);
    f3 = fopen("specialchar", "r");
    while ((c = getc(f3)) != EOF)
    {
        if (c == ' ')
        {
            st1[k] = '\0';
            special(st1);
            k = 0;
        }
        else
            st1[k++] = c;
    }
    fclose(f3);
    printf("\n the no of lines in the program are:%d", lineno);
    return 0;
}