import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { DataBindingComponent } from './data-binding.component';
import { InputPropertyComponent } from './input-property.component'


@NgModule({
  imports: [
    CommonModule
  ],
  declarations: [
  DataBindingComponent,
  InputPropertyComponent
  ],
  exports: [
    DataBindingComponent
  ]
})
export class DataBindingModule { }
