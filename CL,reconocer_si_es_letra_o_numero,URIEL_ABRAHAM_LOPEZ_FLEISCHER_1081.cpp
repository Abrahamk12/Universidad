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
	/*
	Hacer que reconosca si es un numero, una letra mayuscula y minuscula, ninguno de los dos
	*/
	/*
	48-57 numeros
	65-90 letras
	97-122 minusculas
	*/
string verificadorTexto(char);

using namespace std;

void pausa();
int main()
{
	bool bandera=false;
	int tecla;
	tecla= 1, 2;
	
	cout<<"Reconocimiento de un caracter o un numero"<<endl;
	
	do
	{
		system("cls");
		cin.clear();
		cout<< "Calcuadora" <<endl;
		cout<< ".........." <<endl;
		cout<< " Decea hacer la operacion?, ingrese 1"<<endl << endl;
		cout<< " Desea salir?, ingrese 2"<<endl;
		cout<< "Elije una opcion: "<<endl;
		
		cin>>tecla;
		
		switch(tecla)
		{
			case 1: 
			system("cls");
			cout<< "Decidio hacer la opracion \n";
			//int main()
			{
				char texto_usuario;
					string resultado;
					
					cout<<"INGRESE UN CARACTER: "<<endl;
					cin>>texto_usuario;
					
					resultado= verificadorTexto(texto_usuario);
					cout<<"El caracter es: "<< resultado;	
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

string verificadorTexto(char x){
	if (int(x) >=48 && int(x) >=57) return "Nunero";
	else if(int(x) >=65 && int(x) <=122)
		if(int(x) >=65 && int(x) <=90) return "Letra mayuscula";
		else return "Letra minuscula";
	else return "No es numero ni letra";
}
