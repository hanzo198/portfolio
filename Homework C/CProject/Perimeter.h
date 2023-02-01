#ifndef Perimeter.h
#define Perimeter
#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#define PI 3.141593


#endif // Perimeter

float perimeterSquare(float);
float perimeterRectangle(float, float);
float perimeterTriangle(float, float, float);
float perimeterCircle(float);

void PerimeterMenu()
{
    int perimeterChoice;
    float perimeterSquare1, perimeterRectangle1, perimeterTriangle1, perimeterCircle1;
    float width, length, sideA, sideC, base, radius;
    char perimeterChoice2;


    do{
        do{
                printf("What geometrical figure would you like to use for Perimeter? \n"
                       "(1) Square \n"
                       "(2) Rectangle \n"
                       "(3) Triangle \n"
                       "(4) Circle \n"
                       "Type 1-4 >> ");
                scanf("%d", &perimeterChoice);
                printf("\n");

                switch(perimeterChoice)
                {
                    case 1:
                            do{
                                printf("What is the length of the sides of the square in meters? >> ");
                                scanf("%f", &length);
                                printf("\n");

                                if(length < 0)
                                {
                                    printf("WARNING!! length must be positive\n"
                                           "TRY AGAIN\n");
                                }

                                }while(length < 0);

                             perimeterSquare1 = perimeterSquare(length);

                             printf("The perimeter of the square is : %.2f m\n\n", perimeterSquare1);

                        break;

                    case 2:
                            do{
                                printf("What is the length of the sides of the rectangle in meters? >> ");
                                scanf("%f", &length);
                                printf("\n");

                                if(length < 0)
                                {
                                    printf("WARNING!! length must be positive\n"
                                           "TRY AGAIN\n");
                                }

                                }while(length < 0);

                              do{
                                printf("What is the width of the sides of the rectangle in meters? >> ");
                                scanf("%f", &width);
                                printf("\n");

                                if(width < 0)
                                {
                                    printf("WARNING!! width must be positive\n"
                                           "TRY AGAIN\n");
                                }

                                }while(width < 0);

                                perimeterRectangle1 = perimeterRectangle(length, width);

                                printf("The perimeter of the rectangle is: %.2f m \n\n", perimeterRectangle1);

                        break;

                    case 3:
                            do{
                                printf("What is the value of the side A of the triangle in meters? >> ");
                                scanf("%f", &sideA);
                                printf("\n");

                                if(sideA < 0)
                                {
                                    printf("WARNING!! value must be positive\n"
                                           "TRY AGAIN\n");
                                }

                                }while(sideA < 0);

                              do{
                                printf("What is the value of the base of the triangle in meters? >> ");
                                scanf("%f", &base);
                                printf("\n");

                                if(base < 0)
                                {
                                    printf("WARNING!! value must be positive\n"
                                           "TRY AGAIN\n");
                                }

                                }while(base < 0);
                               do{
                                printf("What is the value of the side C of the triangle in meters? >> ");
                                scanf("%f", &sideC);
                                printf("\n");

                                if(sideC < 0)
                                {
                                    printf("WARNING!! value must be positive\n"
                                           "TRY AGAIN\n");
                                }

                                }while(sideC < 0);


                                perimeterTriangle1 = perimeterTriangle(sideA, base, sideC);


                                printf("The perimeter of the triangle is: %.2f m\n\n", perimeterTriangle1);

                        break;
                    case 4:
                            do{
                                printf("What is the radius of the circle in meters? >> ");
                                scanf("%f", &radius);
                                printf("\n");

                                if(radius < 0)
                                {
                                    printf("WARNING!! radius must be positive\n"
                                           "TRY AGAIN\n");
                                }

                                }while(radius < 0);

                             perimeterCircle1 = perimeterCircle(radius);

                             printf("The perimeter of the circle is : %.2f m \n\n", perimeterCircle1);


                        break;

                }

                if(perimeterChoice < 1 || perimeterChoice > 4)
                {
                    printf("WARNING!!\n"
                            "Your choice has to be from 1-4 \n"
                            "Try again\n\n");

                }

            }while(perimeterChoice < 1 || perimeterChoice > 4);

            printf("Would you like to calculate the perimeter of another figure? \n"
                   "Type Y for (Yes) \n"
                   "Type N for (No) \n"
                   ">> ");
            scanf("\n%c", &perimeterChoice2);
            printf("\n\n");

        }while(perimeterChoice2 == 'Y' || perimeterChoice2 == 'y');

}

float perimeterSquare(float length1)
{
    return 4.0 * length1;
}

float perimeterRectangle(float length1, float width1)
{
    return 2.0 * (length1 + width1);
}

float perimeterTriangle(float sideA1, float base1, float sideC1 )
{
    return sideA1 + base1 + sideC1;
}

float perimeterCircle(float radius1)
{
    return 2  * PI * radius1;
}


