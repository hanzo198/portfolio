/*
    programmer: Roberto Andino
    date due: 6/23/2019
    description: This program will generate a table of conversion from Celsius(C)
                 to Rankin (R). User will enter the starting Celsius temperature and
                 increment between lines.


*/

#include <stdio.h>
#include <stdlib.h>

int main()
{
    printf("This program will generate a table of conversion from Celsius(C) "
           "to Rankin (R). \n\n");

    float celsius, rankin, increment;
    float count = 1;

    do
    {
        printf("Enter the starting Celsius temperature >> ");
        scanf("%f", &celsius);
        printf("\n");

        if(celsius < -273.15)
        {
              printf("WARNING!! celsius can not be less than -273.15 \n\n");
        }

    }while(celsius < -273.15);


    do
    {
        printf("Enter the increment in degrees fahrenheit >> ");
        scanf("%f", &increment);
        printf("\n");

        if(increment == 0)
        {
             printf("WARNING!! increment can not equal 0 \n\n");
        }

    }while(increment == 0);


    printf("Celsius      ||      rankin \n");

    for(count; count <= 25; count++)
    {
        rankin = (9.0 / 5.0) * (celsius + 273.15);

        printf("%f %18f \n", celsius, rankin);

        celsius += increment;

    }

    return 0;
}
