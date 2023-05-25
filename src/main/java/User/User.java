package User;

import java.util.Date;

import Commande.Commande;

public class User {
	/** @pdOid 60bfff21-c523-4918-928b-475fa69d36a7 */
	   private int idUser;
	   /** @pdOid 21b90a81-5486-43cf-a172-d9c6479db301 */
	   private String firstname;
	   /** @pdOid ab3b8015-2020-4cd2-ae8b-2656f39f6a69 */
	   private String lastname;
	   /** @pdOid 7a821dcd-1ff4-4e42-b8ed-b5a559e8724c */
	   private String email;
	   /** @pdOid 2b0b85a5-e4a3-402d-b6c1-959c08b0e2a4 */
	   private String maidenName;
	   /** @pdOid 2e4a45e9-2684-4025-a9b8-5475284c0feb */
	   private String gender;
	   /** @pdOid f05e5334-132b-4f0f-8be8-d95185f10508 */
	   private String phone;
	   /** @pdOid a8689d43-239c-4704-a2e4-3c2cfb70a9ca */
	   private String username;
	   /** @pdOid 457b3188-a62c-46a1-91c7-8f008ed3ef27 */
	   private String password;
	   /** @pdOid 4383f433-a5a4-4fb1-864e-e10c9cd60580 */
	   private Date birthdate;
	   /** @pdOid 847240a1-fa1b-4c59-a948-266f35875ab1 */
	   private String image;
	   /** @pdOid 0599284c-113f-4e7a-ba8d-08d332e6535c */
	   private int height;
	   /** @pdOid 641e628d-1685-48a2-8302-189928bae2c6 */
	   private int weight;
	   /** @pdOid 6adc2526-deef-474a-8987-6e7e49f7f4d9 */
	   private String address;
	   
	   /** @pdRoleInfo migr=no name=Commande assc=association3 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
	   public java.util.Collection commande;
	   
	   
	   /** @pdGenerated default getter */
	   public java.util.Collection getCommande() {
	      if (commande == null)
	         commande = new java.util.HashSet();
	      return commande;
	   }
	   
	   /** @pdGenerated default iterator getter */
	   public java.util.Iterator getIteratorCommande() {
	      if (commande == null)
	         commande = new java.util.HashSet();
	      return commande.iterator();
	   }
	   
	   /** @pdGenerated default setter
	     * @param newCommande */
	   public void setCommande(java.util.Collection newCommande) {
	      removeAllCommande();
	      for (java.util.Iterator iter = newCommande.iterator(); iter.hasNext();)
	         addCommande((Commande)iter.next());
	   }
	   
	   /** @pdGenerated default add
	     * @param newCommande */
	   public void addCommande(Commande newCommande) {
	      if (newCommande == null)
	         return;
	      if (this.commande == null)
	         this.commande = new java.util.HashSet();
	      if (!this.commande.contains(newCommande))
	         this.commande.add(newCommande);
	   }
	   
	   /** @pdGenerated default remove
	     * @param oldCommande */
	   public void removeCommande(Commande oldCommande) {
	      if (oldCommande == null)
	         return;
	      if (this.commande != null)
	         if (this.commande.contains(oldCommande))
	            this.commande.remove(oldCommande);
	   }
	   
	   /** @pdGenerated default removeAll */
	   public void removeAllCommande() {
	      if (commande != null)
	         commande.clear();
	   }

}
