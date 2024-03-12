import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Placement } from './placement.model';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PlacementService {

  constructor(private httpClient:HttpClient) { }

  API_URL = "http://localhost:8080/placement"

  addPlacement(newPlacement:Placement):Observable<Placement>{
    return this.httpClient.post<Placement>(this.API_URL,newPlacement);
  }

  getPlacement():Observable<Placement[]>{
    return this.httpClient.get<Placement[]>(this.API_URL);
  }

  getPlacementById(id:number):Observable<Placement>{
    return this.httpClient.get<Placement>(this.API_URL+"/"+id);
  }

  updatePlacement(id:number, placement:Placement):Observable<Placement>{
    return this.httpClient.put<Placement>(this.API_URL+"/"+id,placement);
  }
  removePlacement(id:number):Observable<Placement>{
    return this.httpClient.delete<Placement>(this.API_URL+"/"+id);
  }
}
