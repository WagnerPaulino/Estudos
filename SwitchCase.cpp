////////////#include <iostream>
////////////using namespace std;
////////////
////////////int main() {
////////////
////////////    int val;
////////////
////////////    cout << "Selecione um Transporte:\n";
////////////    cout << "[1]=Carro, [2]=Moto, [3]=Avião, [4]=Helicopterio\n";
////////////
////////////    cin >> val;
////////////
////////////    switch (val) {
////////////        case 1:
////////////        case 2:
////////////            cout << "\nTransporte Terrestre\n";
////////////            switch (val) {
////////////                case 1:
////////////                    cout << "Carro selecionado\n";
////////////                    break;
////////////                case 2:
////////////                    cout << "Moto Selecionada";
////////////                    break;
////////////            }
////////////            break;
////////////        case 3:
////////////        case 4:
////////////            cout << "\nTransporte Aereo\n";
////////////            switch (val) {
////////////                case 3:
////////////                    cout << "Avião selecionado\n";
////////////                    break;
////////////                case 4:
////////////                    cout << "Helicoptero Selecionado\n";
////////////                    break;
////////////            }
////////////            break;
////////////        default:
////////////            cout << "Transporte selecionado invalido\n";
////////////    }
////////////    cout << "Programa finalizado\n";
////////////    return 0;
////////////}