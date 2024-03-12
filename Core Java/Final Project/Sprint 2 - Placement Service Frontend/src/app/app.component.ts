import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { PlacementComponent } from "./placement/placement.component";

@Component({
    selector: 'app-root',
    standalone: true,
    templateUrl: './app.component.html',
    styleUrl: './app.component.css',
    imports: [RouterOutlet, PlacementComponent]
})
export class AppComponent {
  title = 'PlacementFrontend';
}
