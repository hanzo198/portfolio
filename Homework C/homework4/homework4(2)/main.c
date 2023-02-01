/*
    programmer: Roberto Andino
    date due: 6/23/2019
    description: This program will generate a table of conversion from Fahrenheit(f) "
                 to Kelvin(K) temperatures for values 0 F to 200 F, the user will provide
                 the increment in degrees fahrenheit.


*/

#include <stdio.h>
#include <stdlib.h>

int main()
{
    printf("This program will generate a table of conversion from Fahrenheit(f) "
           "to Kelvin(K) temperatures for values 0 F to 200 F.\n\n");

    float kelvin, increment;
    float fahrenheit;

    // I added this part because the program wants to convert the positive values of
    // Fahrenheit from 0 - 200 to Kelvin, meaning that no negative values can be accepted.

    do
    {
        printf("Enter the increment in degrees fahrenheit >> ");
        scanf("%f", &increment);
        printf("\n");

        if(increment <= 0)
        {
            printf("WARNING!! increment must be greater than 0 \n\n");
        }

    }while(increment <= 0);


    printf("Fahrenheit     ||    Kelvin \n");

    do
    {
        kelvin = (5.0 / 9.0) * (fahrenheit - 32) + 273;

        printf("%f %19f \n", fahrenheit, kelvin);

        fahrenheit += increment;

    }while(fahrenheit <= 200);


    return 0;
}
