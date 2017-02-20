import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { PessoaComponent } from './pessoa.component';

@NgModule({
  imports: [
    CommonModule
  ],
  declarations: [
  PessoaComponent
  ],
  export: [
    PessoaComponent
  ]
})
export class PessoaModule { }
