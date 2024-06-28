import java.util.Scanner;

public class ColorRange {

    public static void main(String args[]) {
        
       String color;
        System.out.print("Insira um código de cor\n");
        Scanner keyboard = new Scanner(System.in);
        double wlength = keyboard.nextDouble();

        if (wlength >= 380 && wlength <450) {
            color = "Violet";
            System.out.println("A cor é " + color);
        } else if (wlength >= 450 && wlength <495) {
            color = "Azul";
            System.out.println("A cor é " + color);
        } else if (wlength >= 495 && wlength <570) {
            color = "Verde";
            System.out.println("A cor é " + color);
        } else if (wlength >= 570 && wlength <590) {
            color = "Amarelo";
            System.out.println("A cor é " + color);
        } else if (wlength >= 590 && wlength <620) {
            color = "Laranja";
            System.out.println("A cor é" + color);
        } else if (wlength >= 620 && wlength <750) {
            color = "Vermelho";
            System.out.println("A cor é " + color);
        }
        else {
        System.out.println("O comprimento de onda inserido não faz parte do espectro visível");
        }
        }
        
        //Violeta: 380-450
        //Azul: 450-495
        // Verde: 495-570
        //Amarelo: 570-590
        //Laranja: 590-620
        //Vermelho: 620-750
        
    
    }

