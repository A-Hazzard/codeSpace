import java.util.Scanner;
public class physics_calculator{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nMagnetism Calculator\n");
        System.out.println("Remember that:\n\nThe magnitude of a force will depend on the following four (4) factors:\n1. Magnetic Field Strength (flux density), B\n2. Strength of the electric current, I\n3. Length of the conductor perpendicular to the magnetic field, l\n4. The directions of the field and the current\n\n");
        System.out.println("What type of would you like to do?");
        System.out.println("1) Magnetism Formulae");
        System.out.println("2) Flux Density");
        System.out.println("3) FBI Relationship");
        String choice = input.nextLine();

        if(choice.equals("1") || choice.equals("FBI Relationship") || choice.equals("FBI")) formula(input);
        else if(choice.equals("2") || choice.equals("Flux Density") || choice.equals("fluxdensity")) densityFlux(input);
            else if(choice.equals("3") || choice.equals("FBI") || choice.equals("fbi")) FBI(input);
    }//end main



    public static void densityFlux(Scanner input) {
        
        System.out.println("Enter Area");
        double area = input.nextDouble();
        System.out.println("Enter total flux");
        double flux = input.nextDouble();

        double fluxDensity = flux / area;


        System.out.println("Flux Display = " + fluxDensity);
    }

    public static void FBI(Scanner input) {
        System.out.print("Flux Density: ");
        double B = input.nextDouble();
        System.out.print("Strength of current: ");
        double I = input.nextDouble();
        System.out.print("Length of conductor in mm: ");
        double L = input.nextDouble();

        System.out.print("Theta: ");
        double Theta = input.nextDouble();

        double F = B * I * L * Math.sin(Theta);

        System.out.println("F = " + F);

        System.out.print("\nWould you like to calculate BIL: ");
        input.nextLine();
        String choice = input.nextLine();

        if(choice.equals("yes") || choice.equals("y") || choice.equals("YES")){

        System.out.print("Theta: ");
        Theta = input.nextDouble();

            F = B * I * L * Math.sin(Theta);
            System.out.println(B + "," + I + "," + L + "," + Theta);
            System.out.println("New force = " + F);

            
        }

        else{
            System.exit(0);
        }
    }

    public static void formula(Scanner input) {
        System.out.println("WHich formula would you like to see?\n1) Flux Density\n2)The FBI reLationship");
        String choice = input.nextLine();

        if(choice.equals("1") || choice.equals("Flux Density") || choice.equals("fluxdensity"))
            System.out.println("fluxDensity = Weber / Area\n B = Wbr / A");
        else if(choice.equals("2") || choice.equals("FBI Relationship") || choice.equals("FBI")){
            System.out.println("\n\nThe equation which expresses the relationship between the force,\nmagnetic field strength and electric current is given by:\n");
            System.out.println("Force = Flux Density * Strength of magnetic force * length of the conductor * SIN𝜃\n F = BIL SIN𝜃\n\n");
            System.out.println("When the conductor and magnetic field are perpendicular to each other,\ni.e. at right-angles to each other, 𝜃=90°; thus, sin𝜃 = sin90°= 1 ∴ The equation above is reduced to: 𝐹⃗ = BIL");
        }
    }
}//End class