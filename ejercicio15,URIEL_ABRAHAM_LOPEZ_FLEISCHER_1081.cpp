#include <iostream>
/*
URIEL ABRAHAM LOPEZ FLEISCHER
1081 MECATRONICA
Introducción a la programación, José Roberto Moreno Ruiz
*/
using namespace std;
main(){
	float may, men;
	float n[10];
	
	for (int i=0; i<10; i++){
		cout <<"Ingresa el numero "<<i<<": ";
		cin>> n[i];}
	may= n[0];
	men=n[1];
	
	cout<<endl<<endl;
	
	for(int i=0; i<10;i++){
		if(n[i]>may)may=n[i];
		else if(n[i]<men)men=n[i];}
	
	cout<<"El mayor es: "<<may<<" y el menor es: "<<men;
	//getch();
}
