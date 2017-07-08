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
import { PipesComponent } from './pipes/pipes/pipes.component';
import { FiltroArrayPipe } from './pipes/filtro-array.pipe';
import { FiltroArrayImpuroPipe } from './pipes/filtro-array-impuro.pipe';


@NgModule({
  declarations: [
    AppComponent,
    ExemploNGTemplateComponent,
    ExemploDirectiveDirective,
    PipesComponent,
    FiltroArrayPipe,
    FiltroArrayImpuroPipe
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
