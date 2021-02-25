#include <iostream>
#include <conio.h>	
#include <stdio.h>
#include <cstdlib>
/*
URIEL ABRAHAM LOPEZ FLEISCHER
1081 MECATRONICA
Introducción a la programación, José Roberto Moreno Ruiz
*/
using namespace std;

void Valor(int,int);

main()
{
	bool bandera=false;
	int tecla;
	tecla= 1, 2;
	int v1, v2;
	
	do
	{
		system("cls");
		cin.clear();
		cout<< "Calcuadora" <<endl;
		cout<< ".........." <<endl;
		cout<< " Desea relizar la operacion?, ingrese 1"<<endl << endl;
		cout<< " Desea salir?, ingrese 1"<<endl;
		cout<< "Elije una opcion: "<<endl;
		
		//cin>>tecla;
		
		switch(tecla)
		{
			case 1: 
			system("cls");
			cout<< "Has elejido realizar la operacion. \n";
			
			cout<< "Ingrese el  V1"<< endl;
			cin>> v1;
			cout<<"Ingrese el V2" << endl;
			cin>> v2;
			Valor(v1,v2);
			cout<<endl;
			
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
	void Valor(int a, int b)
{	
	int c;	
	c=a;
	a=b;
	b=c;
	cout<< "El valor V1 es:("<< a << ") Y V2 es: (" << b << ")." << endl;
}
