export class Statement
{
    transid: number=0;
    accno: number=0;
    trtype: string="";
    tramt: number=0;
    tdesc: string="";
    trdate: Date = new Date();
    trdate1: Date= new Date();
    currbalance: number=0;
}