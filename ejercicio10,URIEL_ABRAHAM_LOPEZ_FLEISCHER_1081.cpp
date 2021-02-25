#include <iostream>
#include <conio.h>
#include <stdio.h>
/*
URIEL ABRAHAM LOPEZ FLEISCHER
1081 MECATRONICA
Introducción a la programación, José Roberto Moreno Ruiz
*/
using namespace std;
main(){
		int n;
	
	cout<<"Un numero del 0 al 9: "<< endl;
	cin>> n;
	
	switch(n)
	{
	case 0: cout<< "cero"; break;
	case 1: cout<< "uno"; break;
	case 2: cout<< "dos"; break;
	case 3: cout<< "tres"; break;
	case 4: cout<< "cuatro"; break;
	case 5: cout<< "cinco"; break;
	case 6: cout<< "seis"; break;
	case 7: cout<< "siete"; break;
	case 8: cout<< "ocho"; break;
	case 9: cout<< "nueve"; break;
	default: cout<< "Numero no esta incluido.. "; break;
	}
		
	getch();
}
