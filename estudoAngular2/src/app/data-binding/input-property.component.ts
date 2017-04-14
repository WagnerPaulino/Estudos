import { Component, Input } from '@angular/core';

@Component({
selector: 'inputs',
templateUrl: 'input-property.component.html',
styleUrls: ['input-property.component.css']
//inputs: ['nomeCurso']
})

export class InputPropertyComponent {
   
    @Input('nome') 
    nomeCurso : string = '';

    constructor(){

    }
}
