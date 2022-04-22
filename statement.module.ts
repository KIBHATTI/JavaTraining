import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { WeeklyStatementComponent } from './weekly-statement/weekly-statement.component';
import { MonthlyStatementComponent } from './monthly-statement/monthly-statement.component';
import { YearlyStatementComponent } from './yearly-statement/yearly-statement.component';
//import { StatementComponent } from '../statement/statement.component';



@NgModule({
  declarations: [
    WeeklyStatementComponent,
    MonthlyStatementComponent,
    YearlyStatementComponent,
    //StatementComponent
  ],
  imports: [
    CommonModule
  ],
  exports:[WeeklyStatementComponent,MonthlyStatementComponent,YearlyStatementComponent]
})
export class StatementModule { }
