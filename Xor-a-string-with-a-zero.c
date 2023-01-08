#include <stdio.h>
#include <string.h>

void main()
{
    char str[] = "Hello world";
    char str1[11];

    int len, i;

    len = strlen(str);
    printf("%d", len);

    for (i = 0; i < len; i++)
    {
        str1[i] = str[i] ^ 0;
        printf("%c", str1[i]);
    }

    printf("\n");

    return 0;
}
