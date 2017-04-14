import { Component, OnInit } from '@angular/core';
import { InputPropertyComponent } from './input-property.component'

@Component({
  selector: 'app-data-binding',
  templateUrl: 'data-binding.component.html',
  styleUrls: ['data-binding.component.css']
})
export class DataBindingComponent{

  constructor() { }

  url = 'http://www.google.com';

  conteudoAtual: string = '';
  conteudoSalvo: string = '';
  isMouseOver = false;


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

 
 
  pessoa = {nome: '', idade: ''};
  nome: string = "olá... eu estou aqui...kkkk";



}
