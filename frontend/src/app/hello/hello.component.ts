import { Component } from '@angular/core';
import { HelloService } from '../services/hello.service';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-hello',
  templateUrl: './hello.component.html',
  styleUrls: ['./hello.component.scss']
})
export class HelloComponent {

  // Member Variable
  antwort?: String;
  vorname?: String;
  antwortWebservice?: Observable<String>;

  // Konstruktor
  constructor(private helloService: HelloService) {    
  }

  // eine Methode
  askWebservice() {    
    const name = this.vorname ?? 'unbekannt';
    const result = this.helloService.sayHello(name);
    this.antwort = result;
    this.antwortWebservice = this.helloService.sayHello2(name);
  }
}
