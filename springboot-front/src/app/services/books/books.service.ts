import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class BooksService {

  private API_SERVER = "http://localhost:8080/books/";
  
  constructor(
    private httpClient: HttpClient
  ) {

  }

  public getAllBooks(): Observable<any> {
    return this.httpClient.get(this.API_SERVER);
  }
}
