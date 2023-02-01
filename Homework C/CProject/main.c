/*
    Programmer: Roberto Andino
    Date Due: 7/28/19
    Description: This program will calculate the Perimeter, Area of the following figures:
                 Square, Rectangle, Triangle, Circle, and the Volume of the following figures:
                 Cube, Rectangular Prism, Triangular Pyramid, and Sphere.
*/

#include <stdio.h>
#include <stdlib.h>
#include "Perimeter.h"
#include "Area.h"
#include "Volume.h"

void menu1();

int main()
{
    printf("This program will calculate the Perimeter, Area, and Volume of geometrical figures. \n\n");

    int choice;
    char choice2;

    do{

        do
        {
            menu1();

            scanf("%d", &choice);
            printf("\n");

            switch(choice)
            {
                case 1: PerimeterMenu();
                    break;

                case 2: AreaMenu();
                    break;

                case 3: VolumeMenu();
                    break;
                case 4:
                    printf("Ending Program...\n\n");
                    exit(0);
            }

            if(choice < 1 || choice > 4)
            {
                printf("WARNING!!\n"
                       "Your choice has to be from 1-4 \n"
                       "Try again\n\n");
            }

        }while(choice < 1 || choice > 4);

        printf("\n\nWant to Calculate Something else? \n"
               "Type Y for (Yes) \n"
               "Type N for (No) \n"
               ">> ");
        scanf("\n%c", &choice2);
        printf("\n\n");

    }while(choice2 == 'Y' || choice2 == 'y');

    printf("Ending Program...\n\n");

    return 0;
}

void menu1()
{
    printf("What would you like to calculate: \n"
           "1)Perimeter \n"
           "2)Area \n"
           "3)Volume \n"
           "4)Exit \n\n"
           "Type 1-4 >> ");
}


