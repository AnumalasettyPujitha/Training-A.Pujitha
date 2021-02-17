import { Component } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'helloworld';
  constructor()
{
}
public responseforms=new FormGroup({

	uname:new FormControl('kumar'),
	email:new FormControl('kumar@gmail.com'),
	
	
	address:new FormGroup({
		state:new FormControl('TS'),
		city:new FormControl('HYD'),
		place:new FormControl('DILSUKHNAGAR'),
		pincode:new FormControl('500036'),
	})
	
});	

myFun(){
  alert("you submitted the form");
}




}
