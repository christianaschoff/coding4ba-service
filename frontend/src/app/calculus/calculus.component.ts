import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';

@Component({
  selector: 'app-calculus',
  templateUrl: './calculus.component.html',
  styleUrls: ['./calculus.component.scss']
})
export class CalculusComponent {
  
  num!:Number;
  result!:Number;

  constructor(private readonly httpClient: HttpClient) {        
  }

  public click() {
    this.httpClient.get<Number>(`http://localhost:8080/calculus/${this.num}`).subscribe(x => this.result = x);
  }
}
