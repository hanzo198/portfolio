#ifndef Area.h
#define Area
#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#define PI 3.141593


#endif // Area

float areaSquare(float);
float areaRectangle(float, float);
float areaTriangle(float, float);
float areaCircle(float);

void AreaMenu()
{
    int areaChoice;
    float areaSquare1, areaRectangle1, areaTriangle1, areaCircle1;
    float width, length, height, base, radius;
    char areaChoice2;


    do{
        do{
                printf("What geometrical figure would you like to use for Area? \n"
                       "(1) Square \n"
                       "(2) Rectangle \n"
                       "(3) Triangle \n"
                       "(4) Circle \n"
                       "Type 1-4 >> ");
                scanf("%d", &areaChoice);
                printf("\n");

                switch(areaChoice)
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

                             areaSquare1 = areaSquare(length);

                             printf("The area of the square is : %.2f m\n\n", areaSquare1);

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

                                areaRectangle1 = areaRectangle(length, width);

                                printf("The area of the rectangle is: %.2f m \n\n", areaRectangle1);

                        break;

                    case 3:
                            do{
                                printf("What is the height of the triangle in meters? >> ");
                                scanf("%f", &height);
                                printf("\n");

                                if(height < 0)
                                {
                                    printf("WARNING!! value must be positive\n"
                                           "TRY AGAIN\n");
                                }

                                }while(height < 0);

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


                                areaTriangle1 = areaTriangle(height, base);


                                printf("The area of the triangle is: %.2f m\n\n", areaTriangle1);

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

                             areaCircle1 = areaCircle(radius);

                             printf("The area of the circle is : %.2f m\n\n", areaCircle1);


                        break;

                }

                if(areaChoice < 1 || areaChoice > 4)
                {
                    printf("WARNING!!\n"
                            "Your choice has to be from 1-4 \n"
                            "Try again\n\n");
                }

            }while(areaChoice < 1 || areaChoice > 4);

            printf("Would you like to calculate the area of another figure? \n"
                   "Type Y for (Yes) \n"
                   "Type N for (No) \n"
                   ">> ");
            scanf("\n%c", &areaChoice2);
            printf("\n\n");

        }while(areaChoice2 == 'Y' || areaChoice2 == 'y');

}

float areaSquare(float length1)
{
    return pow(length1, 2);
}

float areaRectangle(float length1, float width1)
{
    return length1 * width1;
}

float areaTriangle(float height1, float base1)
{
    return height1 * base1 * (1.0/2.0);
}

float areaCircle(float radius1)
{
    return PI * pow(radius1, 2);
}
