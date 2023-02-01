/*
    Programmer: Roberto Andino
    Date Due: 6/30/2019
    Description: Program will calculate the diameter, circumference, area of a circle and volume of a sphere
                 by using functions. The functions will calculate the circumference, diameter, area of a circle, and
                 volume of a sphere. The user will be given a menu to chose what he wants to calculate.
*/

#include <stdio.h>
#include <stdlib.h>
#include "CircleCalculations.h"

int main()
{
    int choice;
    char choice2;
    int radius, diameter;
    float radiusFloat, circumfenrence, area, volume;

    printf("This program will calculate the diameter, circumference, area of a circle"
           " and volume of a sphere \n\n");

    do
    {
        do
        {
            printf("What is the radius of the circle or sphere >> ");
            scanf("%f", &radiusFloat);
            printf("\n");

            if(radiusFloat < 0)
            {
                printf("Radius can not be less than 0\n"
                       "TRY AGAIN!! \n\n");
            }

        }
        while(radiusFloat < 0);

        menu();

        do
        {
            scanf("%d", &choice);
            printf("\n\n");

            switch(choice)
            {
            case 1:

                radius = (int)radiusFloat;

                diameter = diameterCircle(radius);

                printf("The diameter of the circle is: %d \n", diameter);

                break;

            case 2:

                circumfenrence = circumfenrenceCircle(radiusFloat);

                printf("The circumference of the circle is: %f \n", circumfenrence);

                break;

            case 3:

                area = areaCircle(radiusFloat);

                printf("The area of the circle is: %f \n", area);

                break;

            case 4:

                volume = volumeSphere(radiusFloat);

                printf("The volume of the sphere is: %f \n", volume);

                break;

            case 5:

                printf("ENDING PROGRAM\n\n");

                exit(0);

            default:
                printf("Your choice has to be from 1-5\n"
                       "TRY AGAIN!! \n>> ");
                break;

            }
        }
        while(choice > 5 || choice <= 0);


        printf("\nWould you like to calculate something else? N or Y \n"
               ">> ");
        scanf(" %c", &choice2);
        printf("\n");


    }
    while(choice2 == 'y' || choice2 == 'Y');

    printf("ENDING PROGRAM\n\n");

    return 0;
}
