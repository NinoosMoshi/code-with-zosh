import { Component, HostListener } from '@angular/core';

@Component({
  selector: 'app-nav-bar',
  templateUrl: './nav-bar.component.html',
  styleUrls: ['./nav-bar.component.scss']
})
export class NavBarComponent {

  currentSection:any;
  isNavbarContentOpen:any;

  openNavbarContent(section:any){
     this.isNavbarContentOpen = true;
     this.currentSection = section;
  }

  closeNavbarContent(){
    this.isNavbarContentOpen = false
 }


  navigateTo(path:any){

  }

  @HostListener('document:click', [`$event`])
  onDocumentClick(event:MouseEvent){
     const modalContainer = document.querySelector(".modal-container");
     const openButtons = document.querySelectorAll(".open-button");

     let clickInsideButton = false;

     openButtons.forEach((button: Element) =>{
        if(button.contains(event.target as Node)){
           clickInsideButton = true;
        }
     })

     if(modalContainer && !clickInsideButton && this.isNavbarContentOpen){
        this.closeNavbarContent();
     }

  }


}
