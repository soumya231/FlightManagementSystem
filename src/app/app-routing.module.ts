import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddflightsComponent } from './addflights/addflights.component';
import { ScheduleflightsComponent } from './scheduleflights/scheduleflights.component';


const routes: Routes = [{path:'app-addflights',
component:AddflightsComponent},{path:'app-scheduleflights',component:ScheduleflightsComponent}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
