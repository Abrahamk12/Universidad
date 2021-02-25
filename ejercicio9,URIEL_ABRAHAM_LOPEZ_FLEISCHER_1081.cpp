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
	int dia;
	
	cout<<"Ingresa un da de la semana: "<< endl;
	cin>> dia;
	
	switch(dia)
	{
	case 1: cout<< "Domingo"; break;
	case 2: cout<< "Lunes"; break;
	case 3: cout<< "Martes"; break;
	case 4: cout<< "Miercoles"; break;
	case 5: cout<< "Jueves"; break;
	case 6: cout<< "Viernes"; break;
	case 7: cout<< "Sabado"; break;
	default: cout<< "No existe ese dia..."; break;
	}
		
	getch();
}
