import { Injectable } from '@angular/core';
import { RestService } from './rest.service';
import { HttpClient } from '@angular/common/http';
import { User } from '../models/user.model';


@Injectable({
  providedIn: 'root'
})
export class UserService extends RestService {

  
  constructor(protected http: HttpClient) {
    super("user", http);
  }
  
  save(objectToSave: User){
    return this.http.post(`${this.completeBackendServerUrl}/add/order`,JSON.stringify(objectToSave), { headers: this.headers });
  }

}