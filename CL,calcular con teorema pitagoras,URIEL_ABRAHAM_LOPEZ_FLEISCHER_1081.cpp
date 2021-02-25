#include <iostream>
#include <conio.h>
#include <stdio.h>
#include <math.h>
#include <cstdlib>
/*
URIEL ABRAHAM LOPEZ FLEISCHER
1081 MECATRONICA
Introducción a la programación, José Roberto Moreno Ruiz
*/
using namespace std;
float pitagoras(float, float);
/*
	realisar una operacion con el teorema de pitagoras
*/

void pausa();
int main()
{
	bool bandera=false;
	int tecla;
	tecla= 1, 2;
	
	cout<<"Resolver por medio de teorema de pitaogras"<<endl;
	
	do
	{
		system("cls");
		cin.clear();
		cout<< "Calcuadora" <<endl;
		cout<< ".........." <<endl;
		cout<< "\t1 .- Desea relizar la operacion?, ingrese 1"<<endl << endl;
		cout<< "\t2 .- Desea salir?, ingrese 2"<<endl;
		cout<< "Elije una opcion: "<<endl;
		
		cin>>tecla;
		
		switch(tecla)
		{
			case 1: 
			system("cls");
			cout<< "Has elejido realizar la operacion \n";
			//int main()
			{
				float ca, co, h;
				char menu_set;
				
				do{
					cout<<"Ingrese el cateto adyacente del trinagulo: "<<endl;
					cin>>ca;
					
					cout<<"Ingrese el cateto opuesto del trinagulo: "<<endl;
					cin>>co;
					
					h=pitagoras(ca,co);
					
					cout<<"La hipotenusa del triangulo es: "<<h<<endl<<endl;
					
					cout<<"Presione cualquier letra para continuar o ingtrese Q para salir del programa.. "<<endl;
					cin>>menu_set;
					
					if(menu_set == 'q' || menu_set == 'Q') return 0;
					if(int(menu_set) > 0 || int(menu_set) < 256){
						cout<<int(menu_set);
						// system ("CLS");
						cin.ignore();
					}
				}while (menu_set != 'q' && menu_set != 'Q');
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

float pitagoras(float a, float b){
	
	float c;
	c=sqrt(pow(a,2) + pow(b,2));
	return c;
}
	
/*
main()
{
	float co, ca, hip, c;
	cout<<"Ingrese el valor del cateto adyasente: "<<endl;
	cin>>ca;
	cout<<"Ingrese el valor del cateto opuesto: "<<endl;
	cin>>co;
	
	hip=((pow(co,2))+(pow(ca,2)));
	c=sqrt(hip);
	cout<<"El resultado es: "<<c<<endl;
}
*/
