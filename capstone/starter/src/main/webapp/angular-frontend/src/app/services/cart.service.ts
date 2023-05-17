import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class CartService {
  cartProducts: any[] = [];
  private baseUrl = 'http://localhost:8080/orders'

  constructor(private http: HttpClient) { }

  getCartProducts() {
    return this.cartProducts;
  }

  addToCart(product: any, amount: any) {

    let existingProduct = null;
    // Checking if the product was already in the cart
    for (var cartProduct of this.cartProducts) {
      if (cartProduct.id === product.id) {
        existingProduct = cartProduct;
        existingProduct.amount += parseInt(amount);
        break;
      }
    }

    // If it's still null; this means it's not in the cart
    if (existingProduct === null) {
      existingProduct = product;
      this.cartProducts.push(existingProduct);
    }
    console.log(this.cartProducts);
    alert('Added to cart!');
  }

  clearCart() {
    this.cartProducts = [];
    return this.cartProducts;
  }

  updateCart(cart: any) {
    this.cartProducts = cart;

    return this.cartProducts;
  }

  submitOrder(order: any) {
    // Submit the order information the API
    this.http.post(`${this.baseUrl}/submit`, order, { headers: { Authorization: 'Basic dWRhY2l0eTpwYXNzd29yZA=='}}).subscribe(
      (response) => {
        console.log('POST request successful', response);
      },
      (error) => {
        console.error('Error in POST request', error);
      }
    )
  }
}
