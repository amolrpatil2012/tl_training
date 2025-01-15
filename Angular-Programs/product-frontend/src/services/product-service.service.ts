import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Product } from '../product';

@Injectable({
  providedIn: 'root',
})
export class ProductServiceService {
  // Injects httpClient object -- which

  url: string = 'http://localhost:8080/products';

  constructor(private httpClient: HttpClient) {}

  getProducts(): Observable<Product[]> {
    return this.httpClient.get<Product[]>(`${this.url}`);
  }

  createProduct(product: Product): Observable<Object> {
    return this.httpClient.post(`${this.url}`, product);
  }

  deleteProduct(id: number): Observable<Object> {
    return this.httpClient.delete(`${this.url}/${id}`);
  }
}
