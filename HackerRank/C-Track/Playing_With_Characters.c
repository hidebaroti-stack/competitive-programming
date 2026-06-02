#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
#define MAX_LEN 100

int main()
{

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */

    char ch;
    scanf("%c", &ch);   // Input single character
    printf("%c\n", ch); // Print character

    char s[MAX_LEN];
    scanf("%s", s);    // Input a string, Word without spaces
    printf("%s\n", s); // Print string

    scanf("\n"); // Clear the newline left in the buffer

    char sen[MAX_LEN];
    scanf("%[^\n]%*c", sen); // Input sentence with spaces
    printf("%s\n", sen);     // Print sentence

    return 0;
}
