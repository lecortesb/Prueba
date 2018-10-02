/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author carlos
 */
public class Fecha {
    private int dia,mes,anio;
    
    public void setdia(int d){
        dia=d;
      }
  public void setmes(int m){
        mes=m;
      }
   public void setanio(int a){
        anio=a;
      }
    public int getdia(){
        return dia;
    }
    public int getmes(){
        return mes;
    }
    public int getanio(){
        return anio;
    }
     public String obtenerformato1()
{
    String s="";
    if(getmes()>=10)
    {
   s= ""+getdia()+"/"+getmes()+"/"+getanio()%100;
    }
   if(getmes()<10)
   {
   s= ""+getdia()+"/0"+getmes()+"/"+getanio()%100;
   }
return s;
}
     public String obtenerformato2()
             
{
    String s="";
switch(mes)
    
{
    case 1:
       s=getdia()+"de Enero del\t"+getanio();
               break;
    case 2:
       s=getdia()+"de Febrero del\t"+getanio();
               break;
                   case 3:
       s=getdia()+"de Marzo del\t"+getanio();
               break;
                   case 4:
       s=getdia()+"de Abril del\t"+getanio();
               break;
                   case 5:
                   {
       s=getdia()+"de Mayo del\t"+getanio();
               break;
                   }
                   case 6:
                   {
       s=getdia()+"de Junio del\t"+getanio();
               break;
                   }
                   case 7:
                   {
       s=getdia()+"de Julio del\t"+getanio();
               break;
                   }
                   case 8:
                   {
       s=getdia()+"de Agosto del\t"+getanio();
               break;
                   }
                   case 9:
                   {
       s=getdia()+"de Septiembre del\t"+getanio();
               break;
                   }
                case 10:
                {
       s=getdia()+"de Octubre del\t"+getanio();
       
               break;
                }
                   case 11:
                   {
       s=getdia()+"de Noviembre del\t"+getanio();
               break;
                   }
                   case 12:
                   {
       s=getdia()+"de Diciembre del\t"+getanio();
               break;
               }
}
return s;
}
    
}
