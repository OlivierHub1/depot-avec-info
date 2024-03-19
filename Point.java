import java.util.Scanner;

// Définition de la classe Point
class  Point {
    // Déclaration des attributs et méthodes. À faire
    // +TODO




// -TODO
}

class TestPoint {
    public static void main( String args[] ) {
        Scanner sc= new Scanner( System.in );
        Point point;
        int dx, dy; 

        // Création de l'objet
        point = new Point(); 

        // Entrée des attributs de l'objet créé
        point.x = sc.nextInt();
        point.y = sc.nextInt();

        // Entrée des déplacements
        dx = sc.nextInt();
        dy = sc.nextInt();
    
        // Sortie des attributs de l'objet
        System.out.println( point.x );
        System.out.println( point.y );

        // Appel de la méthode pour déplacer le point
        point.déplacer( dx, dy );

        // Sortie des attributs de l'objet point modifiés
        System.out.println( point.x );
        System.out.println( point.y );
  }
}
