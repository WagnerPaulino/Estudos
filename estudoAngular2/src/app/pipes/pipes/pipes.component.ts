import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pipes',
  templateUrl: './pipes.component.html',
  styleUrls: ['./pipes.component.css']
})
export class PipesComponent implements OnInit {
  livros: string[] = ['Java','Angular', 'Python'];
  filtro: string;

  valorAsync = new Promise((resolve, reject)=>{
    setTimeout(()=> resolve('Valor assincrono'), 2000)
  });

  constructor() { }

  ngOnInit() {
  }

  addCurso(valor){
    console.log(valor);
    console.log('livros:',this.livros);
    this.livros.push(valor);
    console.log('livros depois:',this.livros);
  }

}
