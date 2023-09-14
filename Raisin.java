/**
 *
 * @author azdad_khomsi
 */
public class Raisin {
    private double prix;
    private String origine;
	
    public Raisin() 
    {
        this.prix = 5;  //prix en euros
        this.origine="France";
    }
    
    public Raisin(double prix, String origine) 
    {
	if(prix < 0)
	    this.prix = -prix;  //une solution possible pour interdire les prix negatifs
	else
	    this.prix = prix;

	if(origine.equals(""))
            this.origine = "France";  //France par defaut
	else
            this.origine = origine;   
    }

    public double getPrix(){
	return prix;
    }

    public void setPrix(double prix){
	this.prix=prix;
    }

    public String getOrigine(){
	return origine;
    }
 
    public void setOrigine(String origine){
	this.origine=origine;
    }

    @Override
    public String toString(){
        return "Raisin de " + origine + " a " + prix + " euros";
    }

    @Override
    public boolean equals(Object r){  //predicat pour tester si 2 Raisins sont equivalentes
        if(o != null && getClass() == r.getClass()){
            Raisin ra = (Raisin) r;
            return (prix == ra.prix && origine.equals(ra.origine));
        }
        return false;
    }

    public boolean isSeedless() { 
    return false;
}


    public static void main (String[] args){
        //Ecrire ici vos tests
        Raisin rai = new Raisin(3.5 , "Espagne");
        String rt = rai.toString();
        System.out.println(rt);
   }
}