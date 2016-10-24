#include <iostream>
#include <stack>//precisa dessa biblioteca para se trabalhar com pilhas

using namespace std;

int main(){

	stack <string> cartas;//criando uma pilha

	cartas.push("Rei de Copas");//metodo push adiciona elementos em uma pilha
	cartas.push("Rei de Espadas");
	cartas.push("Rei de Ouros");
	cartas.push("Rei de Paus");

	cout << "Tamanho da pilha: "<<cartas.size()<<"\n";

	cout << "Carta do topo: "<<cartas.top();//retorna o elemento do topo

	//cartas.pop();//retira o elemento do topo da pilha
	//cout << "Tamanho da pilha apos o metodo pop: "<<cartas.size()<<"\n";

	return 0;
}
