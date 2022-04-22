import { Component, OnInit } from '@angular/core';
import { StatementService } from '../statement.service';
import { Statement } from './Statement';

@Component({
  selector: 'app-statement',
  templateUrl: './statement.component.html',
  styleUrls: ['./statement.component.css']
})
export class StatementComponent implements OnInit {

  statement:Statement = new Statement();
  accountnumber:number=this.statement.accno;


  statArray: Statement[]=[];
  
  constructor(private statementServ: StatementService) { }

  ngOnInit(): void {
  }
  getstatement(accountnumber:number,fromDate:Date,toDate:Date)
  {
    this.statementServ.getStatementServ(accountnumber,fromDate,toDate).subscribe(
        (data:Statement) =>
        {
          console.log("in getstatment in ts file ");
          this.statement=data;
        },
        (err) =>
        {
          console.log(err);
        }

    );

  }

}
