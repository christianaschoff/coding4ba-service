import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class HelloService {

  constructor(private readonly httpClient: HttpClient) { }

  // eine Methode
  sayHello(name: String) : String {
    return "hallo " + name.toUpperCase();      
  }

  sayHello2(name: String): Observable<String> {
    return this.httpClient.get('http://localhost:8080/anrede/' + name , {responseType: 'text'} );
  }
}
