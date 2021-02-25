//Ejemplo generar numeros aleatorios del 1 al 20 ahora con semilla
#include <iostream>
#include <cstdlib> //tiene la definicion de la funcion RAND (random)
/*
URIEL ABRAHAM LOPEZ FLEISCHER
1081 MECATRONICA
Introducción a la programación, José Roberto Moreno Ruiz
*/
using std::cout;
using std::endl;
using std::cin;
int main ()
{
  int cantidad;
  int semilla;
  cout << "Cuantos números quiere generar?" << endl;
  cin >> cantidad;
  cout << "Ingrese una semilla para rand()" <<endl; //nueva linea
  cin >> semilla;
  //nuevas linea
  srand(semilla);// nueva linea
  for (int contador =1 ; contador <= cantidad ; contador++)
    {
      cout << (1 + rand() % 20); //mostramos por pantalla los numeros generados del 1 al 20
      cout << endl; //salto de linea para separlos
    }
  return 0 ;
} //fin de main.
