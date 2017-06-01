import { Directive, ElementRef, Renderer } from '@angular/core';

@Directive({
  selector: '[appExemploDirective]'
})
export class ExemploDirectiveDirective {

  constructor(private elementRef: ElementRef, private renderer: Renderer) {
    this.renderer.setElementStyle(this.elementRef.nativeElement, 'background-color','blue');
   }

}
