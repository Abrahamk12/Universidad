#include <stdio.h>
#include <iostream>
#include <conio.h>
#include <string>
/*
URIEL ABRAHAM LOPEZ FLEISCHER
1081 MECATRONICA
Introducción a la programación, José Roberto Moreno Ruiz
*/
using namespace std;
//palandrimo

void pausa();
int main()
{
	bool bandera=false;
	int tecla;
	tecla= 1, 2;
	
	do
	{
		system("cls");
		cin.clear();
		cout<< "Palindromo" <<endl;
		cout<< ".........." <<endl;
		cout<< "\t1 .- Quiere inciar el programa?, ingrese 1"<<endl << endl;
		cout<< "\t2 .- Desea salir?, ingrese 2"<<endl;
		cout<< "Elije una opcion: "<<endl;
		
		cin>>tecla;
		
		switch(tecla)
		{
			case 1: 
			system("cls");
			cout<< "Has elejido realizar la accion. \n";
			//main()
			{
				string palabra, palabra_alreves;
				int dimension_palabra;
				
				cout<<"Ingresa una palabra para verificar si es palindromo: "<<endl;
				cin>>palabra;
				
				dimension_palabra= palabra.length();
				
				for(int i = dimension_palabra-1; i >= 0; i--)
				{
					palabra_alreves = palabra_alreves + palabra[i];
				}
				
				cout<<"Palabra alreves: "<<palabra_alreves <<endl<<endl;
				
				if(palabra == palabra_alreves) cout<<"La palabra "<<palabra<<" es un palindromo: "<<endl;
				else cout<<"Mo es un palindromo";
			}
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

