
/*
@Param typeOperation: AJOUT OU RETRAIT
@Param produit:
@Param stock:
@Param quantite:

 */


public class StockManager {


    // gere le stock
    public void ajout(String typeOperation, String produit, int quantite, int stock) {
        // Ajout au stock
        if (typeOperation.equals("ajout")) {
            stock += quantite;
            System.out.println("Produit : " + produit + ", Stock après ajout : " + stock);
        } else {
            System.out.println("Opération inconnue.");
        }
        // Retrait du stock
    }
}
     public void ajout(String typeOperation, String produit, int quantite, int stock) {
            // Retrait du stock
         if (typeOperation.equals("retrait") && stock >= quantite ) {
                stock -= quantite;
                System.out.println("Produit : " + produit + ", Stock après retrait : " + stock);
            } else {
                System.out.println("Stock insuffisant pour le produit : " + produit);
            }
              else {
                System.out.println("Opération inconnue.");
        // Si l'action est inconnu
        }
}

