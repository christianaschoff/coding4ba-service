import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { CalculusData } from '../model/calculus-model';
import { Observable, catchError, map } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CalcService {

  constructor(private readonly httpClient: HttpClient) {       
  }

  berechne(calcData: CalculusData): Observable<Number> {
    return this.httpClient.post<Number>('http://localhost:8080/calculus', calcData);
  }

}
