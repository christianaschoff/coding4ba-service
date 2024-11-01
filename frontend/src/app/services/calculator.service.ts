import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { CalculusModel } from '../models/calculus-model';
import { Observable, of } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CalculatorService {

  constructor(private readonly httpClient: HttpClient) {
  }

  calculationServiceCall(model: CalculusModel) : Observable<Number> {

    if(!model || !model.zahl1 || !model.zahl2 || !model.operator) {
      return of(NaN);
    }

    return this.httpClient.post<Number>('http://localhost:8080/calculus', model);
  }
}
