#include <iostream>
#include <cstdlib>
/*
URIEL ABRAHAM LOPEZ FLEISCHER
1081 MECATRONICA
Introducción a la programación, José Roberto Moreno Ruiz
*/
using namespace std;

void pausa();
int main()
{
	bool bandera=false;
	char tecla;
	
	do
	{
		system("cls");
		cin.clear();
		cout<< "Calcuadora" <<endl;
		cout<< ".........." <<endl;
		cout<< " Sumar"<<endl << endl;
		cout<< " Restar"<<endl;
		cout<< " Multiplicar"<<endl;
		cout<< " Dividir"<<endl;
		cout<< " Salir"<<endl<<endl;
		cout<< "Elije una opcion: "<<endl;
		
		cin>>tecla;
		
		switch(tecla)
		{
			case 1: 
			system("cls");
			cout<< "Has elejido sumar. \n";
			pausa();
			break;
			case 2:
			system("cls");
			cout<< "Has elejido restar. \n";
			pausa();
			break;	
			case 3:
			system("cls");
			cout<< "Has elejido multiplicar. \n";
			pausa();
			break;
			case 4:
			system("cls");
			cout<< "Has elejido dividir. \n";
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
