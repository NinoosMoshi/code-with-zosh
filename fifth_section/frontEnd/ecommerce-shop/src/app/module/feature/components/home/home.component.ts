import { Component } from '@angular/core';
import { gounsPage1 } from 'src/Data/Gouns/gouns';
import { menJeans } from 'src/Data/Men/men_jeans';
import { mens_kurta } from 'src/Data/Men/men_kurta';
import { lehngacholiPage2 } from 'src/Data/Saree/lenghaCholiPage2';
import { mensShoesPage1 } from 'src/Data/shoes';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent {

  theMenJeans:any;
  theWomenGounds:any;
  theLenghaCholi:any;
  theKurta:any;
  theMenShoes:any;


  ngOnInit(){
   this.theMenJeans = menJeans.slice(0,5);
   this.theWomenGounds = gounsPage1.slice(0,5);
   this.theLenghaCholi = lehngacholiPage2.slice(0,5);
   this.theKurta = mens_kurta.slice(0,5);
   this.theMenShoes = mensShoesPage1.slice(0,5);
  }

}
