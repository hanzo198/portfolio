#ifndef CIRCLECALCULATIONS_H_INCLUDE
#define CIRCLECALCULATIONS_H_INCLUDE
#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#define PI 3.141593

#endif // CIRCLECALCULATIONS_H_INCLUDE


void menu()
{
    printf("Choose what would you like to do: \n"
           "(1) Calculate Diameter of a circle \n"
           "(2) Calculate Circumference of a circle\n"
           "(3) Calculate Area of a circle \n"
           "(4) Calculate Volume of a sphere \n"
           "(5) EXIT \n\n"
           "Type 1 - 5 >> " );
}

int diameterCircle(int radius1)
{
    return 2 * radius1;
}

float circumfenrenceCircle(float radius1)
{
    return 2.0 * PI * radius1;
}

float areaCircle(float radius1)
{
    return PI * powf(radius1, 2);
}

float volumeSphere(float radius1)
{
    return (4.0 / 3.0) * PI * powf(radius1, 3);
}
