import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';

import { AppComponent } from './app.component';
import { PessoaComponent } from './pessoa/pessoa.component'
import { PessoaModule } from './pessoa/pessoa.module';

@NgModule({
  declarations: [
    AppComponent,
    PessoaComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    PessoaModule
  ],
  providers: [ PessoaModule ],
  bootstrap: [AppComponent]
})
export class AppModule { }
