#include <stdio.h>
#include <stdlib.h> //for abs()

void update(int *a, int *b)
{
    // Complete this function
    int sum = *a + *b;
    int diff = abs(*a - *b);

    *a = sum;  // update value at pointer a
    *b = diff; // update value at pointer b
}

int main()
{
    int a, b;
    int *pa = &a, *pb = &b;

    scanf("%d %d", &a, &b);
    update(pa, pb);
    printf("%d\n%d", a, b);

    return 0;
}
