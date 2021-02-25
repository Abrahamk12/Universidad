#include <iostream>
#include <cstdlib>
#include <conio.h>
/*
URIEL ABRAHAM LOPEZ FLEISCHER
1081 MECATRONICA
Introducción a la programación, José Roberto Moreno Ruiz
*/
using namespace std;

void hr();
void pausa();
int main()
{
	bool bandera=false;
	int tecla;
	tecla= 1, 2;
	int a, b;
	
	cout<<"Calcualr cuanto timpo transcurrio, partiendo de la hora ingresada"<<endl;
	
	do
	{
		system("cls");
		cin.clear();
		cout<< "Menu" <<endl;
		cout<< "...." <<endl;
		cout<< " Desea hacer la operacion?, ingrese 1"<<endl;
		cout<< " Desea salir?, ingrese 2"<<endl;
		cout<< "Elije una opcion: "<<endl;
		
		cin>>tecla;
		
		switch(tecla)
		{
			case 1: 
			system("cls");
			cout<< "Decidio realizar la operacion \n";
			
			hr();
			//cout<<"La hora un segundo despues es: "<<a<<endl;
			
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

void hr()
{
	int h, m, s;
	
	do
	{
	cout<<"Ingrese la hora"<<endl;
	cin>>h;
	
	cout<<"Ingrese los minutos"<<endl;
	cin>>m;
	
	cout<<"Ingrese los segundo"<<endl;
	cin>>s;
	
	if(h>=24 && h<=0 or m>=60 && m<=0 or s>=60 && s<=0)
	{
	cout<<"Ingrese  bien los datos"<<endl;
	}
	cin.clear();
	
	}while(h>=24 && h<=0 or m>=60 && m<=0 or s>=60 && s<=0);
	
	s=s+1;
	if(s>=60)
	{
		m=m+1;
		s=0;
		if(m>=60 )
		{
			h=h+1;
			m=0;
		}
		if(h>=24 )
		{
			h=0;
			m=0;
			s=0;
		}
	} 
	
	cout<<"La hora un segundo despues es: "<<h<<":"<<m<<":"<<s<<endl;
	
	//return n;
}
