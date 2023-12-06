import { Component } from '@angular/core';

@Component({
  selector: 'app-star-rating',
  templateUrl: './star-rating.component.html',
  styleUrls: ['./star-rating.component.scss']
})
export class StarRatingComponent {

  maxRating=5;
  initialRating=3;

  stars:any;
  currentRating=0;

  constructor(){
    this.stars = Array(this.maxRating).fill(0).map((_,i) => i+1);
    this.currentRating = this.initialRating;
  }

  rate(rating:number){
    this.currentRating = rating;
  }

}
