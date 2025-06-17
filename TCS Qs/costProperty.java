import java.util.Scanner;

public class costProperty {
    //interior wall painting=18
    //exterior wall painting=12
    //take no.of interior wall,exterior wall,surface of inetrior and exterior wall (in sq.feet)
    //calculate cost of interior and exterior wall painting
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of interior walls:");
        int interiorWalls =  scanner.nextInt();
        System.out.println("Enter the number of exterior walls:");
        int exteriorWalls = scanner.nextInt();
        if(interiorWalls!=0 && exteriorWalls!=0){
            double totalInteriorSurfaceArea = 0.0;
            double totalExteriorSurfaceArea = 0.0;
            for(int i=0;i<interiorWalls;i++){
                System.out.println("Enter the surface area of interior walls (in sq.feet):");
                double interiorSurfaceArea = scanner.nextDouble();
                totalInteriorSurfaceArea += interiorSurfaceArea;
            }
            for(int j=0;j<exteriorWalls;j++){
                System.out.println("Enter the surface area of exterior walls (in sq.feet):");
                double exteriorSurfaceArea = scanner.nextDouble();
                totalExteriorSurfaceArea += exteriorSurfaceArea;
            }

            double costPerInteriorWall = 18.0; 
            double costPerExteriorWall = 12.0; 

            double totalInteriorCost = totalInteriorSurfaceArea * costPerInteriorWall;
            double totalExteriorCost = totalExteriorSurfaceArea * costPerExteriorWall;

            System.out.println("Total cost for interior wall painting: $" + totalInteriorCost);
            System.out.println("Total cost for exterior wall painting: $" + totalExteriorCost);
            double cost= totalInteriorCost+totalExteriorCost;
            System.out.println("Total cost for painting: $" + cost);
        }

        else{
            System.out.println("INVALID CHOICE!");
        }
    }
}
