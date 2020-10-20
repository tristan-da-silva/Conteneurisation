import { Component, OnInit } from '@angular/core';
import { UserService } from 'src/app/services/user.service';
import { User } from 'src/app/models/user.model';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

  name:string;
  salary:number;
  id:number;
  
  user:User = new User();

  constructor(private userService:UserService) { }

  ngOnInit(): void {
    
  }

  onClick(){
    this.userService.save(this.user).subscribe((data)=> {
      JSON.stringify(this.user);
      this.user = new User();
    });
  }

}
