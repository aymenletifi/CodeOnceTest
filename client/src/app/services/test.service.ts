import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

const Base_Url = 'http://localhost:8080/';
@Injectable({
  providedIn: 'root'
})
export class TestService {

  constructor(private http: HttpClient ) { }

  ponctuation(s) {
    return this.http.post(Base_Url, s);
  }
}
