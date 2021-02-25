#include <iostream>
#include <stdio.h>
#include <conio.h>
/*
URIEL ABRAHAM LOPEZ FLEISCHER
1081 MECATRONICA
Introducción a la programación, José Roberto Moreno Ruiz
*/
using namespace std;

main(){
	/*
	int n;
	n='*';
	cout<<"Ingrese un numero "<<endl;
	cin>>n;

	for (int i=0; i < n;i++){
		cout<< "*\t" ;
	}
	*/
	/*
	int m;
	int a[10], x;
	
	for (int i=0; i <10; i++)
	{
		cout<<"Ingrese el numero: "<<i<<":";
		cin>>a[i]; 
	}
	for(int i=0; i<10; i++)
	{	
		x=a[i];
		cout<<"Imprimir "<<x<<"asteriscos: ";
		for(int j=0; j<x; j++)
		{
			cout << "*";
			cout<<endl;	
		}
	}
	*/
	int m;
	
	cout<<"Ingrese un nuemro: ";
	cin>>m;
	int a[m], x;
	for (int i=0; i <m; i++)
	{
		cout<<"Ingrese el numero: "<<i<<":";
		cin>>a[i]; 
	}
	for(int i=0; i<m; i++)
	{	
		x=a[i];
		//cout<<"Imprimir "<<x<<" asteriscos: ";
		for(int j=0; j<x; j++)
		{
			cout << "*";
			cout<<endl;	
		}
	}
}
