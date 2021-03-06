import { Component, OnInit, Input, EventEmitter, Output, ViewChild, ElementRef } from '@angular/core';

@Component({
  selector: 'contador',
  templateUrl: './output-property.component.html',
  styleUrls: ['./output-property.component.css']//,
  //outputs: ['mudouValor']
})
export class OutputPropertyComponent implements OnInit {

  @Input()
  valor : number = 0; 

  @Output()
  mudouValor = new EventEmitter();

  constructor() { }

  ngOnInit() {
  }

  decrementa(){
      this.valor--;
      this.mudouValor.emit({novoValor: this.valor});
  }

  incrementa(){
      this.valor++;
      this.mudouValor.emit({novoValor: this.valor});
  }

}