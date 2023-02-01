/*
    programmer: Roberto Andino
    date due: 6/23/2019
    description: This program will convert degrees (0-360) to radians and print a
                 a table showing the degrees and its equivalent value in radians with an increment of 10.


*/

#include <stdio.h>
#include <stdlib.h>

int main()
{
    printf("This program will convert degrees (0-360) to radians and print a"
           "a table showing the degrees and its equivalent value in radians\n\n");

    const float PI = 3.14;
    float radians;
    float degrees = 0;

    printf("Degrees     ||      Radians \n");

    while(degrees <= 360)
    {

        radians = degrees * ( PI / 180);

        printf("%f %19f \n", degrees, radians);

        degrees = degrees + 10;
    }

    return 0;
}
