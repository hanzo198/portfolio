#include <iostream>
#include <fstream>
#include <string>

using namespace std;

void filecheck(string);

int main()
{
    cout << "-----------------------------------------------------------------------------\n"
         << "This program will ask the user for a file name \n"
         << "Then the program will display the first 10 lines of the file"
         << " on the screen. \n"
         << "If the file has fewer than 10 lines, the entire file should be displayed \n"
         << "with a message indicating the entire file has been displayed\n"
         << "-----------------------------------------------------------------------------\n\n";

    string filename;

    cout << "What is the name of the file? >> ";
    cin >> filename;

    filecheck(filename);

    return 0;
}

void filecheck(string filename1)
{

    ifstream file;
    int num[20];
    int count = 0;

    file.open(filename1);

    if(file)
    {

        while(count < 20 && file >> num[count])
        {
            count++;
        }
        file.close();


        if(count < 10)
        {
            cout << "The file has less than 10 lines \n"
                << "The data in the file is: \n";

            for(count = 0; count < 10; count++)
            {
                cout << num[count] << endl;
            }
        }
        else
        {

            cout << "\n First 10 values in the file are: \n";

            for(count = 0; count < 10; count++)
            {
                cout << num[count] << endl;
            }
        }
    }
    else

        cout << " ERROR, can not open file \n\n";



}
