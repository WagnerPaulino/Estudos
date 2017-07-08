import { Pipe, PipeTransform } from '@angular/core';

import { FiltroArrayPipe } from "app/pipes/filtro-array.pipe";

@Pipe({
  name: 'filtroArrayImpuro',
  pure: false
})
export class FiltroArrayImpuroPipe extends FiltroArrayPipe {

}
