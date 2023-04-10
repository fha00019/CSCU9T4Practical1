package com.stir.cscu9t4practical1;

public class SwrnEntry extends Entry {


    private String where;
    
    /**
     * Constructor for objects of class Cycling
     */
public SwrnEntry(String n, int d, int m, int y, int h, int min, int s, float dist, String we )
{
// intialise instance variables
super(n, d, m, y, h, min, s, dist);
this.where= we; 
 

}
public String getwhere() {
return where;
} 
public void setwhere(String we) {
this.where= we;
} 

/**
* An example of a method - replace this comment 
* 
* @param y a sample parameter for a method 
* @return the sum of x and y 
*/

public String getEntry () {
String result = getName()+" ran " + getDistance() + " km in "
        +getHour()+":"+getMin()+":"+ getSec() + " on "
        +getDay()+"/"+getMonth()+"/"+getYear()+ getwhere()+"\n"  ;
return result;
}
}

