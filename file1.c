#include <stdio.h>

int main() {
    int num1, num2;       // Declare integer variables for user input
    int sum;              // Declare integer variable for the sum
    int unusedVariable = 29;  // Unused integer variable

    printf("Enter first number: ");
    scanf("%d", &num1);

    printf("Enter second number: ");
    scanf("%d", &num2);

    sum = num1 + num2;  // Calculate the sum

    printf("The sum is: %d\n", sum);  // Display the result
    return 0;
}
