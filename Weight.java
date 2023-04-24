public class Weight
{
   private int pounds; // defines variables
   private double ounces;
   private int ouncesInPound = 16;
   
   public Weight(int p, double o){ // constructor, initializes the weight and variable
       this.pounds = p;
       this.ounces = o;
   }
  
   public boolean lessThan(Weight w){ // sees if the new weight is less than the current
       
       if(this.pounds < w.pounds) // compares pounds
           return true;
       
       else if(this.pounds > w.pounds)
           return false;
       
       else{
           
           if(this.ounces < w.ounces) // compares ounces
               return true;
           else
               return false;
       }
   }
   
   public void addTo(Weight w){
       this.pounds += w.pounds;
       this.ounces += w.ounces;
       normalize();
   }
   
   public void divide(int x){
	   
       this.ounces = toOunces();
       this.ounces /= x;
       this.pounds = 0;
       normalize();
   }
   
   public String toString(){
       return this.pounds +" lbs. " + this.ounces + " oz.";
   }
   
   private double toOunces(){
       return this.pounds * this.ouncesInPound + this.ounces;
   }
   
   private void normalize(){
       while(this.ounces > this.ouncesInPound)
       {
           this.ounces -= this.ouncesInPound;
           this.pounds++;
       }
   }
}