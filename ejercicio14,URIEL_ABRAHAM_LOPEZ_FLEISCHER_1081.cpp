#include <iostream>
#include <conio.h>
#include <stdio.h>
/*
URIEL ABRAHAM LOPEZ FLEISCHER
1081 MECATRONICA
Introducción a la programación, José Roberto Moreno Ruiz
*/
using namespace std;
main(){
	char letra;
	do {
		cout<<"Ingrese S o N: "<<endl;
		cout<<"O ingrese Q para salir: "<<endl;
		cin>>letra;
		
		if(letra == 'q' || letra=='Q')break;  
		
		if(letra=='S' || letra=='N' || letra=='s' || letra=='n')
		cout<<"Laletra es: "<<letra<<endl;
		else cout<<"La letra: "<<letra<<"no es S o N..."<<endl;
	} while (letra != 'S' && letra != 'N' || letra != 's' || letra != 'n');
	
	//getchar();
}	
