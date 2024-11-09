import { Component } from '@angular/core';
import { HelloService } from '../services/hello.service';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-hello',
  templateUrl: './hello.component.html',
  styleUrls: ['./hello.component.scss'],
  standalone: false
})
export class HelloComponent {
  
  vorname?: String;
  antwort?: String;
  antwortWebservice?: Observable<String>; // Member Variable


  constructor(private helloService: HelloService) {

  }
 
  sayHello() {
    const name = this.vorname?? 'unbekannt';
    // this.antwort = this.helloService.sayHello(name);    
    this.antwortWebservice = this.helloService.sayHello2(name);
  }

}
