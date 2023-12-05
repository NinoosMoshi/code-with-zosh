import { Component } from '@angular/core';
import { Route, Router } from '@angular/router';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.scss']
})
export class CartComponent {

  cart = [1,1,1];

  constructor(private router:Router){}


  navigateToCheckout(){
    this.router.navigate(['/checkout'])
  }

}
