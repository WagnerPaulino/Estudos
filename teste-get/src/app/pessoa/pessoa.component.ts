import { Component, OnInit } from '@angular/core';
import { Pessoa } from './pessoa';
import { PessoaService } from './pessoa.service';

@Component({
  selector: 'app-pessoa',
  templateUrl: './pessoa.component.html',
  styleUrls: ['./pessoa.component.css']
})
export class PessoaComponent implements OnInit {

  private pessoas: Pessoa[] = [];


  constructor(private pessoaService: PessoaService) {
    this.pessoaService.getPessoas()
    .subscribe(data => this.pessoas = data);
  }

  ngOnInit() {

  }
  deletePessoa(pessoa) {
    if (confirm("Você quer deletar " + pessoa.nome + "?")) {
      var index = this.pessoas.indexOf(pessoa);
      this.pessoas.splice(index, 1);

      this.pessoaService.deletePessoa(pessoa.id)
        .subscribe(null, err => {
          alert("Não foi possivel deletar");
          this.pessoas.splice(index, 0, pessoa);
        });
    }
  }
}