package es.unileon.prg.tema6;

import java.util.Random;
import java.io.*;

public class Date {

	private int day;
	private int month;
	private int year;
	
	
public Date(int day, int month, int year){
	this.setDay(day);
	this.setMonth(month);
	this.setYear(year);
	
	try {
		checkDayOfMonth();
		checkMonth();
		checkYear();
	} catch (ExceptionDate e) {
		System.err.println(e.getMessage());
		System.exit(0);
	}
	 
}


public int getYear() {
	
	return year;
}


public void setYear(int year) {
	this.year = year;
}


public int getMonth() {
	return month;
}


public void setMonth(int month) {
	this.month = month;
}


public int getDay() {
	return day;
}


public void setDay(int day) {
	this.day = day;
}

public boolean isSameYear(Date otherDate){
	
	if(this.year == otherDate.getYear()){
		return true;
	}
	else{
		return false;
	}

}

public boolean isSameMonth(Date otherDate){
		
		if(this.month == otherDate.getMonth()){
			return true;
		}
		else{
			return false;
		}
	
}

public boolean isSameDay(Date otherDate){
	
	if(this.day == otherDate.getDay()){
		return true;
	}
	else{
		return false;
	}

}
	
public boolean isSame(Date otherDate){
		
return(isSameYear(otherDate) && isSameMonth(otherDate) && isSameDay(otherDate));

}

String getMonthName(){
	
	String mes = null;
	
	switch(this.month){
	
	case 1: mes="Enero";break;
	case 2: mes="Febrero";break;
	case 3: mes="Marzo";break;
	case 4: mes="Abril";break;
	case 5: mes="Mayo";break;
	case 6: mes="Junio";break;
	case 7: mes="Julio";break;
	case 8: mes="Agosto";break;
	case 9: mes="Septiembre";break;
	case 10: mes="Octubre";break;
	case 11: mes="Noviembre";break;
	case 12: mes="Diciembre";break;
	default: mes="No existe ese mes";
	
	}
	
	return mes;
 }

void checkDayOfMonth() throws ExceptionDate{
	
	String isDay=null;
	
	switch(this.month){
	
	case 1: 
		if(this.day<0 || this.day>31){
			throw new ExceptionDate("¡¡ERROR!!\nExcepcionDate:El dia es falso.\nEsto se debe a que ha introducido un dia negativo o un dia incorrecto para este mes.\nRevise el dia");
		}
		break;
		
	case 2: 
		
		if ((this.year % 4 == 0) && ((this.year % 100 != 0) || (this.year % 400 == 0))){
			
			if(this.day<0 || this.day>29){
				throw new ExceptionDate("¡¡ERROR!!\nExcepcionDate:El dia es falso.\nEsto se debe a que ha introducido un dia negativo o un dia incorrecto para este mes.\nRevise el dia");
			
			}
			
		}
		
		else if(this.day<0 || this.day>28){
			
			throw new ExceptionDate("¡¡ERROR!!\nExcepcionDate:El dia es falso.\nEsto se debe a que ha introducido un dia negativo o un dia incorrecto para este mes.\nRevise el dia");
		}
		
		
		
		break;
		
	case 3: 
		
		if(this.day<0 || this.day>31){
			
			throw new ExceptionDate("¡¡ERROR!!\nExcepcionDate:El dia es falso.\nEsto se debe a que ha introducido un dia negativo o un dia incorrecto para este mes.\nRevise el dia");
			
		}
		
		break;
		
	case 4: 
		
		if(this.day<0 || this.day>30){
			throw new ExceptionDate("¡¡ERROR!!\nExcepcionDate:El dia es falso.\nEsto se debe a que ha introducido un dia negativo o un dia incorrecto para este mes.\nRevise el dia");
		}
		
		break;
		
	case 5: 
		if(this.day<0 || this.day>31){
			throw new ExceptionDate("¡¡ERROR!!\nExcepcionDate:El dia es falso.\nEsto se debe a que ha introducido un dia negativo o un dia incorrecto para este mes.\nRevise el dia");
		}
		
		
		break;
		
	case 6: 
		if(this.day<0 || this.day>30){
			throw new ExceptionDate("¡¡ERROR!!\nExcepcionDate:El dia es falso.\nEsto se debe a que ha introducido un dia negativo o un dia incorrecto para este mes.\nRevise el dia");
		}
		break;
	
	case 7: 
		if(this.day<0 || this.day>31){
			throw new ExceptionDate("¡¡ERROR!!\nExcepcionDate:El dia es falso.\nEsto se debe a que ha introducido un dia negativo o un dia incorrecto para este mes.\nRevise el dia");
		}
		
		break;
		
	case 8: 
		if(this.day<0 || this.day>31){
			throw new ExceptionDate("¡¡ERROR!!\nExcepcionDate:El dia es falso.\nEsto se debe a que ha introducido un dia negativo o un dia incorrecto para este mes.\nRevise el dia");
		}
		break;
		
	case 9: 
		if(this.day<0 || this.day>30){
			throw new ExceptionDate("¡¡ERROR!!\nExcepcionDate:El dia es falso.\nEsto se debe a que ha introducido un dia negativo o un dia incorrecto para este mes.\nRevise el dia");
		}
		break;
		
	case 10: 
		if(this.day<0 || this.day>31){
			throw new ExceptionDate("¡¡ERROR!!\nExcepcionDate:El dia es falso.\nEsto se debe a que ha introducido un dia negativo o un dia incorrecto para este mes.\nRevise el dia");
		}
		break;
		
	case 11: 
		if(this.day<0 || this.day>30){
			throw new ExceptionDate("¡¡ERROR!!\nExcepcionDate:El dia es falso.\nEsto se debe a que ha introducido un dia negativo o un dia incorrecto para este mes.\nRevise el dia");
		}
		break;
		
	case 12: 
		if(this.day<0 || this.day>31){
			throw new ExceptionDate("¡¡ERROR!!\nExcepcionDate:El dia es falso.\nEsto se debe a que ha introducido un dia negativo o un dia incorrecto para este mes.\nRevise el dia");
		}
		break;
	
	}
}

 void checkMonth() throws ExceptionDate  {
	if(this.month<0||this.month>12){
		throw new ExceptionDate("¡¡ERROR!!\nExcepcionDate:El mes es falso.\nEsto se debe a que ha introducido un mes negativo o mayor que 12.\nRevise el mes");
	}
	
}

 void checkYear() throws ExceptionDate {
	if(this.year<=0){
		throw new ExceptionDate("¡¡ERROR!!\nExcepcionDate:El año es falso.\nEsto se debe a que ha introducido un año negativo.\nRevise el año");
	}
	
}

String getSeason(){
	String season=null;
	
	switch(this.month){
	case 1:
		season="Invierno";
		break;
		
	case 2:
		season="Invierno";
		break;
		
	case 3:
		if(this.day <= 20){
			season="Invierno";	
		}
		else{
			season="Primavera";
		}
		break;
		
	case 4:
		season="Primavera";
		break;
		
	case 5:
		season="Primavera";
		break;
		
	case 6:
		
		if(this.day <= 20){
			season="Primavera";	
		}
		else{
			season="Verano";
		}
		break;
		
	case 7:
		season="Verano";
		break;
		
	case 8:
		season="Verano";
	    break;
	   
	case 9:
		if(this.day <= 20){
			season="Verano";	
		}
		else{
			season="Otoño";
		}
		break;
		
	case 10:
		season="Otoño";
	    break;
	    
	case 11:
		season="Otoño";
		break;
		
	case 12:
		if(this.day <= 20){
			season="Verano";	
		}
		else{
			season="Otoño";
		}
		break;
		
	}
	return season;

}

String getMonthNameEndYear(){
	
	
	StringBuffer todosMes=new StringBuffer();
	int count=0;
	
	for(int i=this.month+1;i<=12;i++){
		
		this.month=i;
		
		todosMes.append(getMonthName()+" ");
		
		count++;
		}
	
	this.month=this.month-count;
	
	return todosMes.toString();
}

public String toString(){
	
	StringBuffer fecha=new StringBuffer();
	
	fecha.append("El "+this.day+" de "+getMonthName()+" de "+this.year);
	
	return fecha.toString();
	
}

int getmonthDays(){
	

	int monthDays = 0;
	
	switch(this.month){
	
	case 1: monthDays=31;break;
	case 2: 
		if ((this.year % 4 == 0) && ((this.year % 100 != 0) || (this.year % 400 == 0))){
			monthDays=29;break;
		}
		else{
			monthDays=28;break;
		}
		
	case 3: monthDays=31;break;
	case 4: monthDays=30;break;
	case 5: monthDays=31;break;
	case 6: monthDays=30;break;
	case 7: monthDays=31;break;
	case 8: monthDays=31;break;
	case 9: monthDays=30;break;
	case 10: monthDays=31;break;
	case 11: monthDays=30;break;
	case 12: monthDays=31;break;
	
	}
	return monthDays;
}

public String printDatesToEndMonth(){
	
	StringBuffer fechasFin=new StringBuffer();
	
	for(int i=this.day;i<=getmonthDays();i++){
		
	fechasFin.append("El "+i+" de "+getMonthName()+" de "+this.year+"\n");
	
	}
	
return fechasFin.toString();

}

public String printMonthSameDays(){
	
	StringBuffer mismosDias=new StringBuffer();
	
	int mes=this.month;
	int diasMes=getmonthDays();
	
	
	for(int i=0;i<=12;i++){
		
		this.month=i;
		
		
		if(diasMes==getmonthDays()){
			
		mismosDias.append(getMonthName()+" ");
		
		}
		;
		}

	this.month=mes;
	
	return mismosDias.toString();
}


public int daysToDate(){
		
		int count=0;
		int mes=getMonth();
		
	
		for(int i=1;i<mes;i++){
			this.month=i;
			for(int j=0;j<getmonthDays();j++){
				
				count ++;
				
			}
		}
		
		
		for(int k=mes;k==mes;k++){	
				
				for(int j=0;j<this.day;j++){
					
					count ++;
				}
		}
		
		this.month=mes;
		return count;
		
	}

public int numberOfAttempts(){
	
	int count=1;
	boolean acierto=true;
	boolean aciertoDia=true;
	
	while(acierto == true){
		
		while(aciertoDia == true){
			
		int day = (int) (Math.random()*31+1);
		
		if(day == this.day){
			 
			aciertoDia=false;
		}
		
		else{
			count++;
		  }
		
		}	
		
int mes = (int) (Math.random()*31+1);
		
		if(mes == this.month){
			 
		   	acierto=false;
		}
		
		else{
			count++;
		}
	}
	
	
	return count;
}

public int numberOfAttempts2(){
	int count=0;
	boolean acierto=true;
	boolean aciertoDia=true;
	
	do{
		do{
			int day = (int) (Math.random()*31+1);
			
			if(day == this.day){
				 
				aciertoDia=false;
			}
			
			else{
				count++;
			  }
		}while(aciertoDia == true);
		
		int mes = (int) (Math.random()*31+1);
		
		if(mes == this.month){
			 
		   	acierto=false;
		}
		
		else{
			count++;
		}
		
	}while(acierto == true);
	
	return count;
	
	
}

}

