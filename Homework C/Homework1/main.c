/*
    Programmer: Roberto Andino
    Due Date: 5/21/19
    Description: Given radius 12cm write a program that will
                 calculate and display, the diameter, circumference
                 and area of a circle and the volume of a sphere.
*/

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main()
{
    int r = 12;
    double d, c, a, v;
    const float pi = 3.141593;


    printf("Calculating diameter, circumference and area of a circle"
           " with a radius of 12...");
    printf("\n\n");

    d = 2 * r;
    c = 2 * pi * r;
    r = pow(12, 2);
    a = pi * r;

    printf("Diameter (2 x radius) = %lf \n", d);
    printf("Circumference (2 x PI x radius) = %lf \n", c);
    printf("Area (PI x radius^2) = %lf \n\n\n", a);

    printf("Calculating the volume of a sphere with a radius of 12... \n\n");

    r = pow(12, 3);
    v = (4.0 / 3.0) * pi * r;

    printf("volume (4/3 x PI x radius^3) = %lf \n", v);

    return 0;
}


