#include <stdio.h>
#include <stdlib.h>

int main()
{
    printf("This program will make a file and save data \n\n");

   int data[10];

   FILE *inputData;

   inputData = fopen("data.txt", "w");

   if(inputData == NULL)
   {
       printf("File was not opened\n\n");

       return -1;
   }

   printf("Enter data: \n");

   for(int count = 0; count < 10; count++)
   {
       printf("#%d ", count+1);
       scanf("%d", &data[count]);

       fprintf(inputData, "[%d] %d\n", count+1, data[count]);

   }

   for(int count = 0; count < 10; count++)
   {
        printf("array[%d] = %d \n", count, data[count]);
   }

   fclose(inputData);

    return 0;
}


