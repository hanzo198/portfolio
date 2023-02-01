/*
    Programmer: Roberto Andino
    Due Date: 7/31/2019
    Description: This program will calculate 100 data points using the damped function
                 and save the results in a file.
*/

#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#define e 2.71828
#define PI 3.14159265

int main()
{
    printf("This program will calculate 100 data points using the damped function "
           "and save the results in a file.\n\n");

    float time, k, dampedSineWave;
    FILE *newFile;

    newFile = fopen("damped_sinusoidal.txt", "w");

    if(newFile == NULL)
    {
        printf("Could not open file \n\n");
        return -1;
    }

    printf("Calculating....\n\n"
           "Data Point\tTime\t\tDamped sine wave\n");

    for(int count = 1; count <= 100; count++)
    {
        k = rand()%100 + 1;

        time = (k - 1.0) / 10.0;

        //added PI / 180 to convert the result of sin from degrees to radians, to get the right answer
        dampedSineWave = pow(e,  -time) * (sin((2 * PI * time) * (PI / 180.0)));

        printf("(%d)\t\t%f\t%f\n", count, time, dampedSineWave);

        fprintf(newFile, "%f \t %f\n", time, dampedSineWave);
    }

    fclose(newFile);


    return 0;
}
