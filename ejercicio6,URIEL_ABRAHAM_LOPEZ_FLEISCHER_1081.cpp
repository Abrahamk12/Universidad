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
	cout << "Ingresa correctamente un umero entero positivo: ";
	cin >> n;
	if(n%2 == 0) cout << "El numro es par!";
	else cout << "El numero es impar!";
	
	getch();
}
