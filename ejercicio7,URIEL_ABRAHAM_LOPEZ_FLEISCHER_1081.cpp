#include <iostream>
#include <conio.h>
#include <stdio.h>
/*
URIEL ABRAHAM LOPEZ FLEISCHER
1081 MECATRONICA
Introducci�n a la programaci�n, Jos� Roberto Moreno Ruiz
*/
using namespace std;
main(){
	int n;
	cout<<"Ingrese correctamente un numero entero positivo";
	cin >> n;
	if( n%3 == 0) cout<< "Es divicible!";
	else cout << "No es divicible!";
	
	getch();
}
