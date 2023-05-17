import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Product } from '../models/Product';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  private baseUrl = 'http://localhost:8080/api'
  constructor(private http: HttpClient) { }

  getProduct(id: number): Observable<Product> {
    return this.http.get<Product>(`${this.baseUrl}/product/${id}`, { headers: { Authorization: 'Basic dWRhY2l0eTpwYXNzd29yZA=='}});
  }

  getProducts(): Observable<Product[]> {
  return this.http.get<Product[]>(`${this.baseUrl}/allProducts`, { headers: { Authorization: 'Basic dWRhY2l0eTpwYXNzd29yZA=='}});
  }
}
