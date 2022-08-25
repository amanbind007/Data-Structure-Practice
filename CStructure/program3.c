#include <stdio.h>
#include <string.h>
 
int main()
{
    char str[1000], word[50];

    printf("Enter string : ");
    gets(str);
    printf("Enter word : ");
    gets(word);
    
    int i = 0;
    while(str[i] != '\0'){
        int j=0;
        if(word[i]==str[j]){
            int j = 0;
            int count = 0;
            while(word[j]!= '\0'){
                
                if(word[j]==str[i+j]){
                    count++;
                }
                if(count == strlen(word)){
                    printf("Char found at : %d", i);
                }
                j++;

            }
        }
        i++;
    }
    
    return 0;
}