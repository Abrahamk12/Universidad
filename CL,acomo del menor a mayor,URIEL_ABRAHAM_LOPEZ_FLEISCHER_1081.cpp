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
int num();
void lol(int);
void pausa();
int numeros[5], num_temporal;

int main()
{
	bool bandera=false;
	int tecla;
	tecla=1, 2;

	
	cout<<"Acomodo de los numeros"<<endl;
	
	do
	{
		system("cls");
		cin.clear();
		cout<< "Calcuadora" <<endl;
		cout<< ".........." <<endl;
		cout<< "\t1 .- Desea hacer la accion?, ingrese 1"<<endl << endl;
		cout<< "\t2 .- Desea salir?, ingrese 2"<<endl;
		cout<< "Elije una opcion: "<<endl;
		
		cin>>tecla;
		
		switch(tecla)
		{
			case 1: 
			system("cls");
			cout<< "Has elejido sumar. \n";
			//int main()
			{

				
				for(int i = 0; i  <=4; i++)
				{
					cout<<"Ingresa el numero "<<i<<": ";
					cin>>numeros[i];
				}
				for(int i = 0; i <= 4; i++) cout << numeros[i] << "\t";
				cout<<endl;
				
				cout<<"El orden es:"<<endl;
				
				/*for(int i= 0; i <= 4; i++)	//Se le conoce como ordenamiento burbuja 
				{
					for(int j = 1; j <= 4; j++)	
					{
						if(numeros[j - 1] > numeros[j]){
							num_temporal =numeros[j - 1];
							numeros[j - 1] = numeros[j];
							numeros[j] = num_temporal;
						}
					}
				}
				
				for(int i = 0; i <= 4; i++)
				{
					cout<<numeros[i] << "\t";
				}*/
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
	cout<<"Pulsa una tecla para continuar.. \n";
	getwchar();
	getwchar();
}

void lol(int z)
{
	for(int i= 0; i <= 4; i++)	//Se le conoce como ordenamiento burbuja 
	{
		for(int j = 1; j <= 4; j++)	
		{
			if(numeros[j - 1] > numeros[j])
			{
				num_temporal =numeros[j - 1];
				numeros[j - 1] = numeros[j];
				numeros[j] = num_temporal;
			}
		}
	}
				
	for(int i = 0; i <= 4; i++)
	{
		cout<<numeros[i] << "\t";
	}
}
