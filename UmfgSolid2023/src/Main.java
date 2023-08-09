import br.edu.umfg.dip.DependencyInversionPrinciple;
import br.edu.umfg.isp.InterfaceSegregationPrinciple;
import br.edu.umfg.lsp.LiskovSubstitutionPrinciple;
import br.edu.umfg.ocp.OpenClosedPrinciple;
import br.edu.umfg.srp.SingleResponsiblityPrinciple;

public class Main {
    public static void main(String[] args) {

        SingleResponsiblityPrinciple.Execute();
        OpenClosedPrinciple.Execute();
        LiskovSubstitutionPrinciple.Execute();
        InterfaceSegregationPrinciple.Execute();
        DependencyInversionPrinciple.Execute();
    }
}