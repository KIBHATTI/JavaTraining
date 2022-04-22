import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Statement } from './statement/Statement';

@Injectable({
  providedIn: 'root'
})
export class StatementService {

  baseURL:string="";
  constructor(private myHttp: HttpClient) { }

  getStatementServ(accountnumber:number,fromDate:Date,toDate:Date): Observable<Statement>
  {
    console.log("in getstatentserv");
    return this.myHttp.get<Statement>(this.baseURL+"/Statement"+accountnumber);
  }
}
