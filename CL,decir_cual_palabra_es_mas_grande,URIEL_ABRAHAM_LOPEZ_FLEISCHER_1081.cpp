#include <iostream>
#include <stdio.h>
#include <stdlib.h>
#include <string>
#include <cstdlib>
/*
URIEL ABRAHAM LOPEZ FLEISCHER
1081 MECATRONICA
Introducción a la programación, José Roberto Moreno Ruiz
*/
using namespace std;

string comparacioncadena(string,string);
/* Decir cual palabra es mas grande */

void pausa();
int main()
{
	bool bandera=false;
	int tecla;
	tecla= 1, 2;
	
	cout<<"Indicar que palabra es mas grande "<<endl;
	do
	{
		system("cls");
		cin.clear();
		cout<< "Calcuadora" <<endl;
		cout<< ".........." <<endl;
		cout<< "Desea realizar la opracion?, ingrese 1"<<endl;
		cout<< "desea salior?, ibgrese 2"<<endl;
		cout<< "Elije una opcion: "<<endl;
		
		cin>>tecla;
		
		switch(tecla)
		{
			case 1: 
			system("cls");
			cout<< "Elijio hacer la operacion \n";
			//int main()
			{
				string cadenauno, cadenados, resultado;
				int menu_sel;
				
				do {
					cout<<"Imgrese la primera palabra: "<<endl;
					cin>>cadenauno;
					
					cout<<"Ingrese la segunda palabra: "<<endl;
					cin>>cadenados;
					
					resultado = comparacioncadena(cadenauno,cadenados);
					
					cout<<"La palabra mas larga es: "<<resultado<<endl<<endl;
					
					cout<<"Ingrese q o Q y presione para salir o cualquier otro caracter para continuar... "<<endl;
					cin>>menu_sel;
					if(menu_sel== 'q' || menu_sel == 'Q')return 0;
					/*if(int(menu_set) > 0 || int(menu_set)< 256){
						cout<<int(menu_set);
					//	sistemn("CLS");
						cin.ignore();
					}	*/
				} while(menu_sel !='q' || menu_sel !='Q');
			}
			pausa();
			break;
			case 5:
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

string comparacioncadena(string a, string b){
	string c;
		cout<<a<<endl<<endl;
		cout<<b<<endl<<endl;
	if(a>b) c = a;
	if(a<b) c = b;
	if(a==b) c = "ninguna. Las palabras son iguales.";
	
	return c;
}
