import { Component } from '@angular/core';
import { CalculusModel } from '../models/calculus-model';

@Component({
  selector: 'app-calculus',
  templateUrl: './calculus.component.html',
  styleUrls: ['./calculus.component.scss']
})
export class CalculusComponent {
  model: CalculusModel = {};
  
}
