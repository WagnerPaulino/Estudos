import { Injectable } from '@angular/core';

@Injectable()
export class CursosService {


  getCursos(){
    return ['WebDesigner','Operador de Sistemas', 'Programador',
    'Banco de Dados'];
  }
}
