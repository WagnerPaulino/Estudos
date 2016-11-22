/*#include <iostream>
#include <stack>//precisa dessa biblioteca para se trabalhar com pilhas
using namespace std;
int main(){
	stack <string> cartas;//criando uma pilha
	if(cartas.empty()){//retorna verdadeiro quando a pilha está vazia
		cout << "Pilha vazia\n\n";
	}else{
		cout << "Pilha com cartas\n\n";
	}
	cartas.push("Rei de Copas");//metodo push adiciona elementos em uma pilha
	cartas.push("Rei de Espadas");
	cartas.push("Rei de Ouros");
	cartas.push("Rei de Paus");
	cout << "Tamanho da pilha: "<<cartas.size()<<"\n";
	cout << "Carta do topo: "<<cartas.top();//retorna o elemento do topo
	cartas.pop();//retira o elemento do topo da pilha
	cout << "\nTamanho da pilha apos o metodo pop: "<<cartas.size()<<"\n";
	if(cartas.empty()){
			cout << "\nPilha vazia\n\n";
		}else{
			cout << "\nPilha com cartas\n\n";
		}
	while(!cartas.empty()){
		cartas.pop();
		cout<<"\nTamanho da pilha\n"<< cartas.size();
	}
	return 0;
}
*/
