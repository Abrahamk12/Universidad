#include <iostream>
#include <conio.h>	
#include <stdio.h>
#include <cstdlib>
#include <time.h> 
/*
URIEL ABRAHAM LOPEZ FLEISCHER
1081 MECATRONICA
Introducci�n a la programaci�n, Jos� Roberto Moreno Ruiz
*/
using namespace std;

float numeroAleatorio();
void pausa();

int main()
{
	bool bandera=false;
	char tecla;	
				
	int dimension;
	
	do
	{
		system("cls");
		cin.clear();
		cout<< "Multiplicaciones de matrices" <<endl;
		cout<< "............................" <<endl;
		cout<< " Desea hacer la operacion?, ingrese 1"<<endl;
		cout<< " Desea salir?, ingrese 2"<<endl;
		cout<< " Salir"<<endl<<endl;
		cout<< "Elije una opcion: "<<endl;
		
		cin>>tecla;
		
		if(tecla == '1'){
			cout<<"Dimension de las matrices: "<<endl;
			cin>>dimension;
		}

		float matrizA[dimension][dimension],matrizB[dimension][dimension],matrizC[dimension][dimension];
		
		switch(tecla)
		{
			case '1':
			cout<<"Desidio realizar la operacion"<<endl; 
			srand(time(NULL));
			system("cls"); 	 
			//AQUI EVALUA EL NUMERO DEL DADO INGRESADO POR EL USUARIO
			cout<<"Primer matriz: "<<endl;
			for(int i=0; i <=dimension-1; i++)
			{
				for(int j= 0; j<=dimension-1; j++)
				{
					if(j%dimension == 0)cout<<endl;
					matrizA[i][j] =numeroAleatorio();
					cout<<matrizA[i][j]<<"\t";
				}
			}
			
			//AQUI EVALUA EL NUMERO DEL DADO INGRESADO POR EL USUARIO
			cout<<"Segunda matriz: "<<endl;
			for(int i=0; i <=dimension-1; i++)
			{
				for(int j= 0; j<=dimension-1; j++)
				{
					if(j%dimension == 0)cout<<endl;
					matrizB[i][j] =numeroAleatorio();
					cout<<matrizB[i][j]<<"\t";
				}
			}
			
			cout<<endl<<endl;
			for(int i=0; i<=dimension-1; i++)
			{
				for(int j = 0; j <= dimension-1; j++)
				{
					for(int k = 0; k <= dimension-1; k++)
					{
						matrizC[i][j]+=matrizA[i][k]*matrizB[k][j];
					}
				}
			}
			cout << "Resultado";
			for(int i = 0; i <= dimension-1; i++)
			{
				for(int j = 0; j<=dimension-1; j++)
				{
					if(j%dimension == 0)cout <<endl;
					cout << matrizC[i][j]<<"\t";
				}
			}
			pausa();
			break;
			
			case '2':
			bandera=true;
			//	exit(1);
			break;
			
			default:
			system("cls");
			cout<< "Opcion no valida. \a\n";
			pausa();
			break;
		}
	}while(bandera==false);
	
	return 0;
}

void pausa()
{
	cout<<"Pulsa una tecla para continuar..";
	getwchar();
	getwchar();
}

float numeroAleatorio()
{
	float n;
	n=(1 + rand() % 3);
	return n;
}
