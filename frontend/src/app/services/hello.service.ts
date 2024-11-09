import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, of } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class HelloService {

  constructor(private httpClient: HttpClient) { }

  public sayHello(name: String) : String {
    return '...side ' + name;
  }

  public sayHello2(name: String) : Observable<String> {
    return this.httpClient.get('http://localhost:8080/anrede/' + name, {responseType: 'text'});
  }

}
