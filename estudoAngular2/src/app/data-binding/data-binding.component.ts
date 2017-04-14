import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-data-binding',
  templateUrl: 'data-binding.component.html',
  styleUrls: ['data-binding.component.css']
})
export class DataBindingComponent{
  
  pessoa: any = {
    nome: 'Wagner',
    idade: 35
  }
  
  public nome: string = "olá... eu estou aqui...kkkk";

  constructor() { }

  url = 'http://www.google.com';

  conteudoAtual: string = '';
  conteudoSalvo: string = '';
  isMouseOver = false;

  valorInicial : number = 10;

  onValorMudou(event){
    alert(event.novoValor);
  }


  onClick(){
    alert("Botão clicado!");
  }

  onKeyup(event){
    console.log(event);
    this.conteudoAtual = event.target.value;
  }

  onSave(valor: string){
    this.conteudoSalvo = valor;
  }

  OnMouseSpan(){
    this.isMouseOver = !this.isMouseOver;
  }

 
 



}
