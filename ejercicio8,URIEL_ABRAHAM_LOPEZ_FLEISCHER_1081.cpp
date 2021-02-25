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
		
	int mes;
	cout<<"Ingrese el numero de mes de nacimiento: "<<endl;
	cin>>mes;
	switch (mes){
	case 1: cout<<"Enero \n";		break;
	case 2: cout<<"Febrero \n";		break;
	case 3: cout<<"Marzo \n";		break;
	case 4: cout<<"Abril \n";		break;
	case 5: cout<<"Mayo \n";		break;		
	case 6: cout<<"Junio \n";		break;
 	case 7: cout<<"Julio \n";		break;		
	case 8: cout<<"Agosto \n";		break;
	case 9: cout<<"Septiembre \n";	break;
	case 10: cout<<"Octubre \n";	break;
	case 11: cout<<"Noviembre \n";	break;
	case 12: cout<<"Diciembre \n";	break;
	}
	/*
	Acuario			20 Enero – 18 Febrero
	Piscis			19 Febrero – 20 Marzo
	Aries			21 Marzo – 19 Abril
	Tauro			20 Abril – 20 Mayo
	Géminis			21 Mayo – 20 Junio
	Cáncer			21 Junio – 22 Julio
	Leo				23 Julio – 22 Agosto
	Virgo			23 Agosto – 22 Septiembre
	Libra			23 Septiembre – 22 Octubre
	Escorpio		23 Octubre – 21 Noviembre
	Sagitario		22 Noviembre – 	21 Diciembre
	Capricornio		22 Diciembre –	19 Enero
	*/
	
	int dia;
	cout<<"Ingrese su dia de nacimento:  "<<endl;
	cin>>dia;
	if((mes==1 && dia>=20) || (mes==2 && dia<=18))
	{
		cout<<"Su signo es: "<<"Acuario"<<endl;
	}
	if((mes==2 && dia>=19) || (mes==3 &&dia<=20))
	{
		cout<<"Su signo es: "<<"Piscis"<<endl;
	}
	if((mes==3 && dia>=21) || (mes==4 && dia<=19))
	{
		cout<<"Su signo es: "<<"Aries"<<endl;
	}
	if((mes==4 &&  dia>=20) || (mes==5 && dia<=20))
	{
		cout<<"Su signo es: "<<"Tauro"<<endl;
	}
	if((mes==5 && dia>=21) || (mes==6 && dia<=20))
	{
		cout<<"Su signo es: "<<"Geminis"<<endl;
	}
	if((mes==6 &&  dia>=21) || (mes==7 && dia<=22))
	{
		cout<<"Su signo es: "<<"Cancer"<<endl;
	}
	if((mes==7 && dia>=23) || (mes==8 && dia<=22))
	{
		cout<<"Su signo es: "<<"Leo"<<endl;
	}
	if((mes==8 && dia>=23) || (mes==9 && dia<=22))
	{
		cout<<"Su signo es: "<<"Virgo"<<endl;		
	}
	if((mes==9 && dia>=23 ) || (mes==10 && dia<=22))
	{
		cout<<"Su signo es: "<<"Libra"<<endl;
	}
	if((mes==10 && dia>=23) || (mes==11 && dia<=21))
	{
		cout<<"Su signo es: "<<"Escorpio"<<endl;
	}
	if((mes==11 && dia>=22) || (mes==12 && dia<=21))
	{
		cout<<"Su signo es: "<<"Sagitario"<<endl;
	}
	if((mes==12 && dia>=22) || (mes==1 && dia<=19))
	{
		cout<<"Su signo es: "<<"Capricornio"<<endl;
	}
}

