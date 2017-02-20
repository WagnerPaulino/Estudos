import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';

import { AppComponent } from './app.component';
import { PessoaComponent } from './pessoa/pessoa.component'
import { PessoaService } from './pessoa/pessoa.service'

@NgModule({
  declarations: [
    AppComponent,
    PessoaComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule
  ],
  providers: [ PessoaService ],
  bootstrap: [AppComponent]
})
export class AppModule { }
