import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-cart-item',
  templateUrl: './cart-item.component.html',
  styleUrls: ['./cart-item.component.scss']
})
export class CartItemComponent {

  @Input() showButton:any;

  updateCartItem(num:Number){
    console.log("num : " + num)
  }

  removeCArtItem(){

  }

}
