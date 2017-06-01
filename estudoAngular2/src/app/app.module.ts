import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';

import { AppComponent } from './app.component';
import { CursosComponent } from './cursos/cursos.component';
import {CursosModule} from './cursos/cursos.module';
import { DataBindingComponent } from './data-binding/data-binding.component';
import { DataBindingModule } from "app/data-binding/data-binding.module";
import { ExemploNGTemplateComponent } from './exemplo-ngtemplate/exemplo-ngtemplate.component';
import { ExemploDirectiveDirective } from "shared/exemplo-directive.directive";


@NgModule({
  declarations: [
    AppComponent,
    ExemploNGTemplateComponent,
    ExemploDirectiveDirective
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    CursosModule,
    DataBindingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
