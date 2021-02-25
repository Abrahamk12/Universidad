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
/*sacar el arrea de una esfera */

float area_circulo(float,float);

float pi=3.1416;
void pausa();
int main()
{
	bool bandera=false;
	int tecla;
	float a, r;
	tecla = 1, 2;
	do
	{
		system("cls");
		cin.clear();
		cout<< "Area de un circulo" <<endl;
		cout<< ".........." <<endl;
		cout<< "\t1 .- Desea realizar la operacion?. Ingrese 1"<<endl << endl;
		cout<< "\t2 .-Desea salir?. Ingrese 2"<<endl<<endl;
		cout<< "Elije una opcion: "<<endl;
		
		cin>>tecla;
		
		switch(tecla)
		{
			case 1: 
			system("cls");
			cout<< "Has elejido hacer la operacion. \n";
			//{
			
				do{
		
				//if( r<=0 ){
				cout<<"Ingrese el valor del radio mayor que 0: "<<endl;
				cin>>r;
				//}
				a = area_circulo(pi,r);
				cout<<"EL area es: "<<a<<endl;

				if(r <= 0) return 0;
				else cout<<a;
				}while (r <= 0);
			pausa();
			//}
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
//int main()
/*{
	float a, r;
	
	do{
		
		//if( r<=0 ){
			cout<<"Ingrese el valor del radio mayor que 0: "<<endl;
			cin>>r;
		//}
		
		a = area_circulo(pi,r);
		cout<<"EL area es: "<<a<<endl;
		
		if(r <= 0) return 0;
		else cout<<a;
	}while (r <= 0);
}*/

float area_circulo(float y, float radio)
{

	float result, area;
	result=pow(radio,2);
	area=pi*result;
	return area;

}
