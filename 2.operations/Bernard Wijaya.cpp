#include <iostream>
using namespace std;

double add (double a, double b)
{
	return a+b;
}
double subtract(double a, double b)
{
	return a-b;
}
double multiply(double a, double b)
{
	return a*b;
}
double divide(double a, double b)
{
	return a/b;
}

int main()
{
	double num1;
	double num2;
	int option;
	int asn;
	double result;
	int cal_ctr = 0;
		
	int i = 0;
	while(i==0)
	{
		system("cls");
		cout << "Enter the first number " << endl;
		cin >> num1;
		
		cout << "Enter the second number " << endl;
		cin >> num2;
		
		cout << "What calculation you want to do?" << endl;
		cout << "Choose the following option number:" << endl;
		cout << "choose 1: addition" << endl;
		cout << "choose 2: subtraction" << endl;
		cout << "choose 3: multiplication" << endl;
		cout << "choose 4: division" << endl;
		
		cin >> option;
		
		if(option==1)
		{
		result = add(num1,num2);
		}
		else if(option==2)
		{
		result = subtract(num1,num2);
		}
		else if(option==3)
		{
		result = multiply(num1,num2);
		}
		else if(option==4)
		{
		result = divide(num1,num2);
		}
		
		cal_ctr++;
		cout << "Your Result: "<< result <<endl;
		cout << "Your Total Calculator Usage: " << cal_ctr <<endl;
		cout << endl;
		
		cout << "Do you want to use the calculator again? (input number)" << endl;
		cout <<	"1. Yes" << endl;
		cout << "2. No" << endl;
		cin >> asn;
		
		if(asn==1)
		{
			continue;
		}
		else if(asn==2)
		{
			return 0;
		}
		
	}
}
