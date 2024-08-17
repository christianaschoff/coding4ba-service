import { Component } from '@angular/core';
import { CalculusData } from '../model/calculus-model';
import { CalcService } from '../services/calc.service';
import { Observable, map, of } from 'rxjs';

@Component({
  selector: 'app-calculus',
  templateUrl: './calculus.component.html',
  styleUrls: ['./calculus.component.scss']
})
export class CalculusComponent {

  data: CalculusData;
  erg = 'Ergebnis:';
  ergebnis?: Number;
  ergebnis2?: Observable<Number>;

  constructor(private readonly caller: CalcService) {
    this.data = new CalculusData();    
  }

  calculate() {
    this.caller.berechne(this.data).subscribe(x => this.ergebnis = x);
    this.ergebnis2 = this.caller.berechne(this.data);
    //console.log(this.data.zahl1, this.data.operation, this.data.zahl2);
  }

}
