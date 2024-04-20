
package entiter;

import java.util.Date;

public class Jalon {
 private String titre;
 private String description ;
 private  Date date ;
 public Jalon (String t,String d,Date  date){
 this.titre=t;
 this.description=d;
 this.date=date;
 }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTitre() {
        return titre;
    }

    public String getDescription() {
        return description;
    }

    public Date getDate() {
        return date;
    }
 
}
