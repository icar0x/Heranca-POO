package Ex4;

public class Main {
    public static void main(String[] args) {


        Ingresso ingresso = new Ingresso(50.00);
        ingresso.imprimeValor();

        System.out.println();


        Normal normal = new Normal(50.00);
        normal.imprimeValor();
        normal.imprimeNormal();

        System.out.println();


        Vip vip = new Vip(50.00, 150.00);
        vip.imprimeValor();   // valor base
        System.out.printf("Valor VIP (com adicional): R$ %.2f%n", vip.getValorVIP());

        System.out.println();


        CamaroteInferior ci = new CamaroteInferior(50.00, 150.00, "Setor A - Frente");
        ci.imprimeValor();
        ci.imprimeLocalizacao();
        System.out.printf("Valor Camarote Inferior:   R$ %.2f%n", ci.getValorVIP());

        System.out.println();


        CamaroteSuperior cs = new CamaroteSuperior(50.00, 150.00, "Setor Premium - Topo", 300.00);
        cs.imprimeValor();
        cs.imprimeLocalizacao();
        System.out.printf("Valor Camarote Superior:   R$ %.2f%n", cs.getValorCamaroteSuperior());
    }
}
