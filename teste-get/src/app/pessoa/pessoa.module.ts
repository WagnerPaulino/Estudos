import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { PessoaComponent } from './pessoa.component';
import { PessoaService } from './pessoa.service';


@NgModule({
  imports: [
    CommonModule
  ],
  declarations: [
  PessoaComponent,
  PessoaService
  ],
  exports: [
    PessoaComponent
  ]
})
export class PessoaModule { }
