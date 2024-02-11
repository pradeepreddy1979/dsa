package q11266;
class Addition{
void add(int x, int y){
System.out.println("Sum of "+x+" and "+y+" : "+(x+y));
} 
void add(int x, float y){
System.out.println("Sum of "+x+" and "+y+" : "+(x+y));
} 
void add(float x, float y){
System.out.println("Sum of "+x+" and "+y+" : "+(x+y));
} 
void add(float x, double y, double z){
System.out.println("Sum of "+x+", "+y+" and "+z+" : "+(x+y+z));
}
public static void main(String a[]){
int i1=Integer.parseInt(a[0]);
int i2=Integer.parseInt(a[1]);
float f1=Float.parseFloat(a[2]);
float f2=Float.parseFloat(a[3]);
double d1=Double.parseDouble(a[4]);
double d2=Double.parseDouble(a[5]);
Addition a1=new Addition();
a1.add(i1,i2);
a1.add(f1,f2);
a1.add(i2,f2);
a1.add(f1,d1,d2);
}
}
