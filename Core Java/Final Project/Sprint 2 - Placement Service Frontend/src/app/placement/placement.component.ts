import { Component, OnInit } from '@angular/core';
import { Placement } from './placement.model';
import { PlacementService } from './placement.service';
import { CommonModule } from '@angular/common';
import { FormControl, FormsModule } from '@angular/forms';

@Component({
  selector: 'app-placement',
  standalone: true,
  imports: [CommonModule,FormsModule],
  templateUrl: './placement.component.html',
  styleUrl: './placement.component.css'
})
export class PlacementComponent implements OnInit{

  ngOnInit(): void {
      this.getPlacements()
  }
  
  constructor(private placementService:PlacementService){}

  newPlacement:Placement= {companyName:"",jobTitle:"",placementDate:"",studentId:0};
  placementList:Placement[]=[];
  deleteId:number | null=null;
  editId:number | null=null;
  editRecord:Placement = {companyName:"",jobTitle:"",placementDate:"",studentId:0};

  addNewPlacement(){
    this.placementService.addPlacement(this.newPlacement).subscribe(result=>{
      this.placementList.push(result);
    });
    this.newPlacement= {companyName:"",jobTitle:"",placementDate:"",studentId:0};
  }
  getPlacements(){
    this.placementService.getPlacement().subscribe(result=>{
      this.placementList = result;
    })
  }
  setDeleteId(id: number | undefined){
    if (id !== undefined) {
      // If id is defined, assign it to the recordId property
      this.deleteId = id;
    } else {
      // If id is undefined, log an error or handle the case appropriately
      console.error("Failed to store record ID - Placement ID is undefined");
    }
  }

  setEditId(id: number | undefined){
    if (id !== undefined) {
      // If id is defined, assign it to the recordId property
      this.editId = id;
      this.placementService.getPlacementById(this.editId).subscribe(result=>{
        this.editRecord=result;
      });
    } else {
      // If id is undefined, log an error or handle the case appropriately
      console.error("Failed to store record ID - Placement ID is undefined");
    }
  }
  
  deletePlacement(){
    if (this.deleteId !== null) {
      // Call your service method to delete the record with this.deleteId
      this.placementService.removePlacement(this.deleteId).subscribe(() => {
        // Update UI by removing the deleted record from placementList array
      this.getPlacements();
      });
      // Reset deleteId after deletion
      this.deleteId = null;
    }
  }

  editPlacement(){
    if (this.editId !== null) {
      // Call your service method to delete the record with this.deleteId
      this.placementService.updatePlacement(this.editId,this.editRecord).subscribe(result=>{
        this.getPlacements();
      });
      this.newPlacement= {companyName:"",jobTitle:"",placementDate:"",studentId:0};
      // Reset deleteId after deletion
      this.editId = null;
    }
  }
}
