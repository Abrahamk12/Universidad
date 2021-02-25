#include <iostream>
#include <string>
#include <conio.h>
#include <cstdlib>
/*
URIEL ABRAHAM LOPEZ FLEISCHER
1081 MECATRONICA
Introducción a la programación, José Roberto Moreno Ruiz
*/
using namespace std;

float x, y, m, s, r, d;
char P;
int a;
void i(char);

void pausa();
int main()
{
	bool bandera=false;
	int tecla;
	tecla=1, 2;
	
	do
	{
		system("cls");
		cin.clear();
		cout<< "Calcuadora" <<endl;
		cout<< ".........." <<endl;
		cout<< "\t1 .- Desa realizar la operacion?. ingrese 1"<<endl << endl;
		cout<< "\t2 .-Desea salir?. ingrese 2"<<endl<<endl;
		cout<< "Elije una opcion: "<<endl;
		
		cin>>tecla;
		
		switch(tecla)
		{
			case 1: 
			system("cls");
			cout<< "Has elejido realizar la operacion. \n";
				//int main()
				{
				/*string mul="*";
				string sum="+";
				string res="-";
				string div="/";*/
	
				cout<<"Ingrese un numero: "<<endl;
				cin>>x;
				cout<<"Ingrese otro numero: "<<endl;
				cin>>y;
	
 		 	  	printf ("Selecciones la operacion que decea relizar: \n");
				printf ("+. Suma \n");
				printf ("-. Resta \n");
				printf ("*. Multiplicacion \n");
  				printf ("/. division \n");

  				cout<<"Escoge una "<<endl;
   				cin>>P;
    
   				i(P);
   		 		//cout<< a <<endl;
   
				cin.get();
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
//	getwchar();
}

void i(char q)
{
	switch (q)
	 {
	    case '*':
	    	m=x*y;
	    	cout<<"EL resultado es: "<<  m <<endl;
	    	break;
	    case '+':
	    	s=x+y;
	    	cout<<"El resultado es: "<< s <<endl;
	    	break;
		case '/':
	    	s=x/y;
	    	cout<<"El resultado es: "<< s <<endl;
	    	break;
	    case '-':
	    	r=x-y;
	    	cout<<"El resultado es: "<< r <<endl;
	    	break;
	    default:
	    	cout<<"No escogiste nada de lo que se muestra"; break;
	}
//	return q;
	
}

