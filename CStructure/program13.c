#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void swap(char *x, char *y)
{
    char t = *x;
    *x = *y;
    *y = t;
}

// Function to reverse `buffer[i…j]`
char *reverse(char *buffer, int i, int j)
{
    while (i < j)
    {
        swap(&buffer[i++], &buffer[j--]);
    }

    return buffer;
}

// Iterative function to implement `itoa()` function in C
char *itoa(int value, char *buffer, int base)
{
    // invalid input
    if (base < 2 || base > 32)
    {
        return buffer;
    }

    // consider the absolute value of the number
    int n = abs(value);

    int i = 0;
    while (n)
    {
        int r = n % base;

        if (r >= 10)
        {
            buffer[i++] = 65 + (r - 10);
        }
        else
        {
            buffer[i++] = 48 + r;
        }

        n = n / base;
    }

    // if the number is 0
    if (i == 0)
    {
        buffer[i++] = '0';
    }

    // If the base is 10 and the value is negative, the resulting string
    // is preceded with a minus sign (-)
    // With any other base, value is always considered unsigned
    if (value < 0 && base == 10)
    {
        buffer[i++] = '-';
    }

    buffer[i] = '\0'; // null terminate string

    // reverse the string and return it
    return reverse(buffer, 0, i - 1);
}

struct three
{
    char data[10], temp[7];
} s[30];
int main()
{
    char d1[7], d2[7] = "t";
    int i = 0, j = 1, len = 0;
    FILE *f1, *f2;

    f1 = fopen("sum.txt", "r");
    f2 = fopen("out.txt", "w");
    while (fscanf(f1, "%s", s[len].data) != EOF)
        len++;
    itoa(j, d1, 7);
    strcat(d2, d1);
    strcpy(s[j].temp, d2);
    strcpy(d1, "");
    strcpy(d2, "t");
    if (!strcmp(s[3].data, "+"))
    {
        fprintf(f2, "%s=%s+%s", s[j].temp, s[i + 2].data, s[i + 4].data);
        j++;
    }
    else if (!strcmp(s[3].data, "-"))
    {
        fprintf(f2, "%s=%s-%s", s[j].temp, s[i + 2].data, s[i + 4].data);
        j++;
    }
    for (i = 4; i < len - 2; i += 2)
    {
        itoa(j, d1, 7);
        strcat(d2, d1);
        strcpy(s[j].temp, d2);
        if (!strcmp(s[i + 1].data, "+"))
            fprintf(f2, "\n%s=%s+%s", s[j].temp, s[j - 1].temp, s[i + 2].data);
        else if (!strcmp(s[i + 1].data, "-"))
            fprintf(f2, "\n%s=%s-%s", s[j].temp, s[j - 1].temp, s[i + 2].data);
        strcpy(d1, "");
        strcpy(d2, "t");
        j++;
    }
    fprintf(f2, "\n%s=%s", s[0].data, s[j - 1].temp);
    fclose(f1);
    fclose(f2);
    return 0;
}
