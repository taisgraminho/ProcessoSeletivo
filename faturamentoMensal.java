
/*Atividade 4 */
import java.text.DecimalFormat;

public class faturamentoMensal {
    public static void main(String[] args) {
        
        double faturamentoSP = 67836.43;
        double faturamentoRJ = 36678.66;
        double faturamentoMG = 29229.88;
        double faturamentoES = 27165.48;
        double outros = 19849.53;

        double TotalFaturamento = faturamentoES + faturamentoMG + faturamentoRJ + faturamentoSP + outros;
        //cálculo da porcentagem
        double percentSP = (faturamentoSP * 100) / TotalFaturamento;
        double percentRJ = (faturamentoRJ * 100) / TotalFaturamento;
        double percentMG = (faturamentoMG * 100) / TotalFaturamento;
        double percentES = (faturamentoES * 100) / TotalFaturamento;
        double percentOutros = (outros * 100) / TotalFaturamento;

        //imprimindo e formatando os resultados para decimal para melhor visualização
        System.out.println("SP: " + new DecimalFormat("#,##0.00").format(percentSP)  + "%");
        System.out.println("RJ: " + new DecimalFormat("#,##0.00").format(percentRJ)  + "%");
        System.out.println("MG: " + new DecimalFormat("#,##0.00").format(percentMG) + "%");
        System.out.println("ES: " + new DecimalFormat("#,##0.00").format(percentES) + "%");
        System.out.println("OUTROS: " + new DecimalFormat("#,##0.00").format(percentOutros) + "%");

    }
}
