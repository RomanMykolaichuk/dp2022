import { Component } from '@angular/core';
import { User } from './interfaces/user';
import { Service1Service } from './services/service1.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'front';
  users:User[]=[];


  constructor(private service:Service1Service){}

  getRest():void{
    this.service.getRest().subscribe(
      (rest1)=>{
        this.users=rest1._embedded.users;
      }
    )
  }

}
