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
	int suma_pares = 0;
	for (int i=0; i<=20; i=i+2)
	{
		cout << "Para encontrar: " << i << endl;
		suma_pares= suma_pares + i;
	}
	
	cout<<"La suma de los pares es: " << suma_pares << endl;
	
	getch();
}
