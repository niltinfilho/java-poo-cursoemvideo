package mycompany.idiomadosistema;

import java.util.Locale;

public class IdiomaDoSistema {
    public static void main(String[] args) {
        System.getProperties();
        System.out.print("Seu sistema está em ");
        System.out.println(System.getProperty("user.language"));
        System.out.println("Ou melhor...");
        Locale loc = Locale.getDefault();
        System.out.print("Seu sistema está em ");
        System.out.println(loc.getDisplayLanguage());
    }
}
