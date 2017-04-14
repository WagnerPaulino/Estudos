import { Component, OnInit } from '@angular/core';

import {CursosService } from './cursos.service';

@Component({
  selector: 'app-cursos',
  templateUrl: './cursos.component.html',
  styleUrls: ['./cursos.component.css'],
  providers: [CursosService]/*Informa pro angula que ele tem que injetar a classe*/
})
export class CursosComponent implements OnInit {


  nome = 'Wagner';
  cursos;
  constructor(cursosService: CursosService){/*Para fazer isso a classe CursosService precisou da anotação @Injectable()*/
    this.cursos = cursosService.getCursos();
  }

  ngOnInit() {
  }



}
