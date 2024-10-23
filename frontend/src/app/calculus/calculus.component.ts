import { Component } from '@angular/core';
import { CalculusModel } from '../models/calculus-model';
import { Observable } from 'rxjs';
import { CalculatorService } from '../services/calculator.service';

@Component({
  selector: 'app-calculus',
  templateUrl: './calculus.component.html',
  styleUrls: ['./calculus.component.scss']
})
export class CalculusComponent {
  model: CalculusModel = {};
  erebnis?: Observable<Number>;

  constructor(private readonly calculatorService: CalculatorService) {}

  calculate () {
    this.erebnis = this.calculatorService.caluclationServiceCall(this.model);
  }
}
