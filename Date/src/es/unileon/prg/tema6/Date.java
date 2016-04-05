package es.unileon.prg.tema6;


public class Date {

	private int day;
	private int month;
	private int year;
	
	
public Date(int day, int month, int year){
	
	this.setDay(day);
	this.setMonth(month);
	this.setYear(year);
	 
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

String checkDayOfMonth(){
	
	String isDay=null;
	
	switch(this.month){
	
	case 1: 
		if(this.day<0 || this.day>31){
			isDay="El dia de este mes es falso";
		}
		else{
			isDay="El dia de este mes es verdadero";
		}
		break;
		
	case 2: 
		
		if ((this.year % 4 == 0) && ((this.year % 100 != 0) || (this.year % 400 == 0))){
			
			if(this.day<0 || this.day>29){
				isDay="El dia de este mes es falso";
			}
			else{
				isDay="El dia de este mes es verdadero";
			}
			
		}
		
		else if(this.day<0 || this.day>28){
			
			isDay="El dia de este mes es falso";
		}
		
		else{
			isDay="El dia de este mes es verdadero";
		}
		
		
		break;
		
	case 3: 
		
		if(this.day<0 || this.day>31){
			
			isDay="El dia de este mes es falso";
			
		}
		
		else{
			
			isDay="El dia de este mes es verdadero";
		}
		
		break;
		
	case 4: 
		
		if(this.day<0 || this.day>30){
			isDay="El dia de este mes es falso";
		}
		
		else{
			isDay="El dia de este mes es verdadero";
		}
		
		break;
		
	case 5: 
		if(this.day<0 || this.day>31){
			isDay="El dia de este mes es falso";
		}
		
		else{
			isDay="El dia de este mes es verdadero";
		}
		
		break;
		
	case 6: 
		if(this.day<0 || this.day>30){
			isDay="El dia de este mes es falso";
		}
		else{
			isDay="El dia de este mes es verdadero";
		}
		break;
	
	case 7: 
		if(this.day<0 || this.day>31){
			isDay="El dia de este mes es falso";
		}
		else{
			isDay="El dia de este mes es verdadero";
		}
		break;
		
	case 8: 
		if(this.day<0 || this.day>31){
			isDay="El dia de este mes es falso";
		}
		else{
			isDay="EL dia de este mes es verdadero";
		}
		break;
		
	case 9: 
		if(this.day<0 || this.day>30){
			isDay="El dia de este mes es falso";
		}
		else{
			isDay="El dia de este mes es verdadero";
		}
		break;
		
	case 10: 
		if(this.day<0 || this.day>31){
			isDay="El dia de este mes es falso";
		}
		else{
			isDay="El dia de este mes es verdadero";
		}
		break;
		
	case 11: 
		if(this.day<0 || this.day>30){
			isDay="El dia de este mes es falso";
		}
		else{
			isDay="El dia de este mes es verdadero";
		}
		break;
		
	case 12: 
		if(this.day<0 || this.day>31){
			isDay="El dia de este mes es falso";
		}
		else{
			isDay="El dia de este mes es verdadero";
		}
		break;
	
	}
	
	
	return isDay;
		
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
	int i;
	String mes=null;
	
	for(i=this.month+1;i<=12;i++){
		
		switch(i){
		
		case 1: mes="Enero";
		case 2: mes="Febrero";
		case 3: mes="Marzo";
		case 4: mes="Abril";
		case 5: mes="Mayo";
		case 6: mes="Junio";
		case 7: mes="Julio";
		case 8: mes="Agosto";
		case 9: mes="Septiembre";
		case 10: mes="Octubre";
		case 11: mes="Noviembre";
		case 12: mes="Diciembre";
		
		
		}
	}
	
	return mes;
}

}



