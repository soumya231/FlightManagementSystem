import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {FormsModule} from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';
import { AddflightsComponent } from './addflights/addflights.component';
import { ScheduleflightsComponent } from './scheduleflights/scheduleflights.component';

@NgModule({
  declarations: [
    AppComponent,
    AddflightsComponent,
    ScheduleflightsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})

export class AppModule { }
