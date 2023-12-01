import { Component, Input } from '@angular/core';
import { navigation } from './nav-content';

@Component({
  selector: 'app-nav-content',
  templateUrl: './nav-content.component.html',
  styleUrls: ['./nav-content.component.scss']
})
export class NavContentComponent {

  category:any;
  @Input() selectedSection:any;


  ngOnInit(){
    this.category = navigation;
  }

}
