#include <iostream>
#include <cstdlib>
#include <conio.h>
#include <stdio.h>
#include <math.h>
/*
URIEL ABRAHAM LOPEZ FLEISCHER
1081 MECATRONICA
Introducción a la programación, José Roberto Moreno Ruiz
*/
using namespace std;

int elv(int);

void pausa();

int main()
{
	bool bandera=false;
	int tecla, a, b, x;
	tecla= 1, 2;
	
	cout<<"Suma de numeros pares al cuadrado"<<endl;
	cout<<"Instrucciones"<<endl;
	cout<<"Consiste en ingresar un numero. Despues de ingresarlo el numero, ingresar los 2 numeros pares sigientes partiendo del primer numero ingresado."<<endl;
	cout<<"Si es un numero impar no importa.";
	//cout<<"Ejemplo: 7 + 8 + 10 "<<endl;
	
	do
	{
		system("cls");
		cin.clear();
		
		cout<< "Menu" <<endl;
		cout<< "...." <<endl;
		cout<< " Desea ralizar la operacion?, ingrese 1"<<endl;
		cout<< " Desea salir?, ingrese 2"<<endl;
		cout<< "Elije una opcion: "<<endl;
		
		cin>>tecla;
		
		switch(tecla)
		{
			case 1: 
			system("cls");
			cout<< "Has elejido realizar la operacion. \n";
			
			cout<<"Ingrese un numero"<<endl;
			cin>>x;
	
			a=elv(x);
			cout<<"La suma es: "<<a<<endl;
			
			pausa();
			break;
			
			case 2:
			bandera=true;
			//	exit(1);
			break;
			
			default:
			system("cls");
			cout<< "Opcion no valida. \a\n";
			pausa();
			break;
		}
	}while(bandera!=true);
	
	return 0;
}

void pausa()
{
	cout<<"Pulsa una tecla para continuar..";
	getwchar();
	getwchar();
}

int elv(int k)
{ 
	int num, limite;

	if(k%2 != 0)
	{
		k = k+1;
	}
	
	limite = k + 5;
		
	for(k; k <= limite; k = k+2)
	{	
		num += pow(k,2);
	}
		
	return num;
}
