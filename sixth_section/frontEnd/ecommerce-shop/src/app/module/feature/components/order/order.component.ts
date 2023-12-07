import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-order',
  templateUrl: './order.component.html',
  styleUrls: ['./order.component.scss']
})
export class OrderComponent {

  orderFilter = [
    {value:"on_the_way", label:"On The Way"},
    {value:"delivered", label:"Delivered"},
    {value:"cancelled", label:"Cancelled"},
    {value:"returned", label:"Returned"}
  ]

  orders = [[1,1], [1,1,1]]


  constructor(private router:Router){}

  navigateToOrderDetails = (id:number) =>{
    this.router.navigate([`/order/${id}`])
  }

}
