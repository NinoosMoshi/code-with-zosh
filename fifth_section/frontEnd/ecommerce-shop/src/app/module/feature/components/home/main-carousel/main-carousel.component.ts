import { Component } from '@angular/core';
import { homeCarouselData } from 'src/Data/mainCarousel';

@Component({
  selector: 'app-main-carousel',
  templateUrl: './main-carousel.component.html',
  styleUrls: ['./main-carousel.component.scss']
})
export class MainCarouselComponent {

  carouselData:any;
  currentSlide=0;
  interval:any;


  ngOnInit(){
    this.carouselData = homeCarouselData;
    this.autoPlay();
  }

  autoPlay(){
    setInterval(() =>{
     this.nextSlide();
    },2000)
  }


  nextSlide(){
    this.currentSlide = (this.currentSlide +1) % this.carouselData.length
  }


}
