package mycompany.resolucaodatela;

import java.awt.Toolkit;

public class ResolucaoDaTela {
    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        System.out.print("A sua tela está na resolução ");
        System.out.println(tk.getScreenSize().width + "x" + tk.getScreenSize().height);
        
        System.out.println("Deixando o código mais simples (talvez)");
        
        System.out.print("A sua tela está na resolução ");
        System.out.print(tk.getScreenSize().width);
        System.out.print("x");
        System.out.println(tk.getScreenSize().height);
    }
}
