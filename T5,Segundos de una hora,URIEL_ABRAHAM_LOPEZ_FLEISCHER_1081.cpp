/*
URIEL ABRAHAM LOPEZ FLEISCHER
1081 MECATRONICA
Introducción a la programación, José Roberto Moreno Ruiz
*/
#include <iostream>
#include <stdio.h>
#include <conio.h>

using namespace std;
int prro(int,int,int);
bool bandera=false;

main()
{	int h, m, s;
	char o;
	cout<<"Escribe 1.- Si deseas saver los segundos de una hora del dia.\nEscribe 2.- Si deseas salir.\n:";
	cin>> o;
	
	switch(o)
	{
	case '1':
	prro(h, m, s);
	break;
	
	case'2':	
	bandera=true;
	break;
	
	default:
	cout<<"Opcion invalida intentelo denuevo...";
}
while(bandera!=false)
return 0;
}
int prro(int h, int m, int s)
{
	cout<<"Dame solo la hora:";
	cin>>h;
	cout<<"\nDame solo los minutos";
	cin>>m;
	cout<<"\nDame solo los segundos";
	cin>>s;
	h=h*3600;
	m=m*60;
	cout<<"\n                 los segundos totales son: "<< h+m+s << endl;
}
