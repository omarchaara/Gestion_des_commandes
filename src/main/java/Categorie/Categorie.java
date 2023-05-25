package Categorie;

import Produit.Produit;

public class Categorie {
	
	   private int idCategorie;
	
	   private String name;
	   
	  
	   public java.util.Collection produit;
	   
	   
	   /** @pdGenerated default getter */
	   public java.util.Collection getProduit() {
	      if (produit == null)
	         produit = new java.util.HashSet();
	      return produit;
	   }
	   
	   /** @pdGenerated default iterator getter */
	   public java.util.Iterator getIteratorProduit() {
	      if (produit == null)
	         produit = new java.util.HashSet();
	      return produit.iterator();
	   }
	   
	   /** @pdGenerated default setter
	     * @param newProduit */
	   public void setProduit(java.util.Collection newProduit) {
	      removeAllProduit();
	      for (java.util.Iterator iter = newProduit.iterator(); iter.hasNext();)
	         addProduit((Produit)iter.next());
	   }
	   
	   /** @pdGenerated default add
	     * @param newProduit */
	   public void addProduit(Produit newProduit) {
	      if (newProduit == null)
	         return;
	      if (this.produit == null)
	         this.produit = new java.util.HashSet();
	      if (!this.produit.contains(newProduit))
	         this.produit.add(newProduit);
	   }
	   
	   /** @pdGenerated default remove
	     * @param oldProduit */
	   public void removeProduit(Produit oldProduit) {
	      if (oldProduit == null)
	         return;
	      if (this.produit != null)
	         if (this.produit.contains(oldProduit))
	            this.produit.remove(oldProduit);
	   }
	   
	   /** @pdGenerated default removeAll */
	   public void removeAllProduit() {
	      if (produit != null)
	         produit.clear();
	   }

	}


