#ifndef Volume.h
#define Volume
#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#define PI 3.141593

#endif // Volume

float volumeCube(float);
float volumeRectangularPrism(float, float, float);
float volumeTriangularPyramid(float, float);
float volumeSphere(float);

void VolumeMenu()
{
    int volumeChoice;
    float volumeCube1, volumeRectangularPrism1, volumeTriangularPyramid1, volumeSphere1;
    float width, length, edge, height, base, radius;
    char volumeChoice2;


    do{
        do{
                printf("What geometrical figure would you like to use for Volume? \n"
                       "(1) Cube \n"
                       "(2) Rectangular Prism \n"
                       "(3) Triangular Pyramid \n"
                       "(4) Sphere \n"
                       "Type 1-4 >> ");
                scanf("%d", &volumeChoice);
                printf("\n");

                switch(volumeChoice)
                {
                    case 1:
                            do{
                                printf("What is the value of the edge of the cube in meters? >> ");
                                scanf("%f", &edge);
                                printf("\n");

                                if(edge < 0)
                                {
                                    printf("WARNING!! value must be positive\n"
                                           "TRY AGAIN\n");
                                }

                                }while(edge < 0);

                             volumeCube1 = volumeCube(edge);

                             printf("The volume of the cube is : %.2f m\n\n", volumeCube1);

                        break;

                    case 2:
                            do{
                                printf("What is the length of the rectangular prism in meters? >> ");
                                scanf("%f", &length);
                                printf("\n");

                                if(length < 0)
                                {
                                    printf("WARNING!! length must be positive\n"
                                           "TRY AGAIN\n");
                                }

                                }while(length < 0);

                              do{
                                printf("What is the width of the rectangular prism in meters? >> ");
                                scanf("%f", &width);
                                printf("\n");

                                if(width < 0)
                                {
                                    printf("WARNING!! width must be positive\n"
                                           "TRY AGAIN\n");
                                }

                                }while(width < 0);

                              do{
                                printf("What is the height of the rectangular prism in meters? >> ");
                                scanf("%f", &height);
                                printf("\n");

                                if(height < 0)
                                {
                                    printf("WARNING!! value must be positive\n"
                                           "TRY AGAIN\n");
                                }

                                }while(height < 0);


                                volumeRectangularPrism1 = volumeRectangularPrism(length, width, height);

                                printf("The volume of the rectangular prism is: %.2f m \n\n", volumeRectangularPrism1);

                        break;

                    case 3:
                            do{
                                printf("What is the height of the triangular pyramid in meters? >> ");
                                scanf("%f", &height);
                                printf("\n");

                                if(height < 0)
                                {
                                    printf("WARNING!! value must be positive\n"
                                           "TRY AGAIN\n");
                                }

                                }while(height < 0);

                              do{
                                printf("What is the value of the base of the triangular pyramid in meters? >> ");
                                scanf("%f", &base);
                                printf("\n");

                                if(base < 0)
                                {
                                    printf("WARNING!! value must be positive\n"
                                           "TRY AGAIN\n");
                                }

                                }while(base < 0);


                                volumeTriangularPyramid1 = volumeTriangularPyramid(height, base);


                                printf("The volume of the triangular pyramid is: %.2f m\n\n", volumeTriangularPyramid1);

                        break;
                    case 4:
                            do{
                                printf("What is the radius of the sphere in meters? >> ");
                                scanf("%f", &radius);
                                printf("\n");

                                if(radius < 0)
                                {
                                    printf("WARNING!! radius must be positive\n"
                                           "TRY AGAIN\n");
                                }

                                }while(radius < 0);

                             volumeSphere1 = volumeSphere(radius);

                             printf("The volume of the sphere is : %.2f m\n\n", volumeSphere1);


                        break;

                }

                if(volumeChoice < 1 || volumeChoice > 4)
                {
                    printf("WARNING!!\n"
                            "Your choice has to be from 1-4 \n"
                            "Try again\n\n");
                }

            }while(volumeChoice < 1 || volumeChoice > 4);

            printf("Would you like to calculate the volume of another figure? \n"
                   "Type Y for (Yes) \n"
                   "Type N for (No) \n"
                   ">> ");
            scanf("\n%c", &volumeChoice2);
            printf("\n\n");

        }while(volumeChoice2 == 'Y' || volumeChoice2 == 'y');

}

float volumeCube(float edge1)
{
    return pow(edge1, 3);
}

float volumeRectangularPrism(float length1, float width1, float height1)
{
    return length1 * width1 * height1;
}

float volumeTriangularPyramid(float height1, float base1)
{
    return height1 * base1 * (1.0/3.0);
}

float volumeSphere(float radius1)
{
    return (4.0/3.0) * PI * pow(radius1, 3);
}


