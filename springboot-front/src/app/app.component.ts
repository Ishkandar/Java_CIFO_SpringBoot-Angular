import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { FormGroup } from '@angular/forms';
import { Validators } from '@angular/forms';
import { AuthorService } from './services/author/author.service';
import { BooksService } from './services/books/books.service';
import { QuotesService } from './services/quotes/quotes.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  
  quoteForm: FormGroup;
  books: any;

  constructor(
    public fb: FormBuilder,
    public authorService: AuthorService,
    public booksService: BooksService,
    public quotesService: QuotesService
  ) {
    
  }
  ngOnInit(): void {
    this.quoteForm = this.fb.group({
      subject: ['', Validators.required],
      content: ['', Validators.required],
      quotes: ['', Validators.required]
    });;

    this.booksService.getAllBooks().subscribe(resp => {
      this.books = resp;
      console.log(resp);
    },
    error => { console.error(error) }
    )
  }

  guardar(): void {

  }
}
