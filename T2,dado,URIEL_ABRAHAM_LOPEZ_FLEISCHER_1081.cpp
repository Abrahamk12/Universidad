#include <iostream>
#include <conio.h>	
#include <stdio.h>
#include <cstdlib>
#include <time.h> 
/*
URIEL ABRAHAM LOPEZ FLEISCHER
1081 MECATRONICA
Introducción a la programación, José Roberto Moreno Ruiz
*/
using namespace std;

int carasAleatorias();
string resultado(int); 
void pausa();
int main()
{
	bool bandera=false;
	int tecla;
	
	do
	{
		system("cls");
		cin.clear();
		cout<< "Calcuadora" <<endl;
		cout<< ".........." <<endl;
		cout<< "\t1 .- desea rrealizaf la operacion?. ingrese 1"<<endl << endl;
		cout<< "\t2 .- Desea salir?. ingrese 2"<<endl;
		
		cin>>tecla;
		
		switch(tecla)
		{
			case '1': 
			system("cls");
			cout<< "Has elejido realizar la operacion. \n";
			//int main()
		{
		string caras_dado;
		int dadoA, dadoB;
	 
		//AQUÍ EVALÚA CON EL NÚMERO DEL DADO INGRESADO POR EL USUARIO
		cout<<"Ingrese un numero de una cara del dado "<<endl;
		cin >> dadoA;
		caras_dado = resultado(dadoA);
		cout << "Primer resultado: " << caras_dado << endl;
	
		//AQUÍ EVALÚA CON EL NÚMERO DEL DADO ALEATORIO
		srand(time(NULL));
		dadoB = carasAleatorias();
		caras_dado = resultado(dadoB);
		cout << "Segundo resultado: " << caras_dado << endl;
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
	}while(bandera!=true);
	
	return 0;
}

void pausa()
{
	cout<<"Pulsa una tecla para continuar..";
	getwchar();
	getwchar();
}

int carasAleatorias()
{
	int c;  
    c = (1 + rand() % 6);
 
	return c;
}

string resultado(int x){
	
	string solucion;
	
	switch(x)
	{
		case 1: solucion = "Uno y cara contraria es 6 \n";	break;
		case 2: solucion = "Dos y cara contraria es 5 \n";	break;
		case 3: solucion = "Tres y cara contraria es 4 \n";	break;
		case 4: solucion = "Cuatro y cara contraria es 3 \n";	break;
		case 5: solucion = "Cinco y cara contraria es 2 \n";	break;
		case 6: solucion = "Seis y cara contraria es 1 \n";	break;
		default: solucion = "Error, ingrese un valor en el rango.."; break;
	}	
	return  solucion;
}
