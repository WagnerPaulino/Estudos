import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { DataBindingComponent } from './data-binding.component';
import { OutputPropertyComponent } from "app/data-binding/output-property/output-property.component";
import { InputPropertyComponent } from "app/data-binding/input-property/input-property.component";
import { FormsModule } from "@angular/forms";

@NgModule({
  imports: [
    CommonModule,
    FormsModule
  ],
  declarations: [
  DataBindingComponent,
  InputPropertyComponent,
  OutputPropertyComponent
  ],
  exports: [
    DataBindingComponent,
    InputPropertyComponent,
    OutputPropertyComponent
  ]
})
export class DataBindingModule { }
