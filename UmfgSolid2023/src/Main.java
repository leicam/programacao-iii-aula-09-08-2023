import br.edu.umfg.dip.DependencyInversionPrinciple;
import br.edu.umfg.isp.InterfaceSegregationPrinciple;
import br.edu.umfg.lsp.LiskovSubstitutionPrinciple;
import br.edu.umfg.ocp.OpenClosedPrinciple;

public class Main {
    public static void main(String[] args) throws Exception {

        //SingleResponsiblityPrinciple.Execute();
        //OpenClosedPrinciple.Execute();
        LiskovSubstitutionPrinciple.execute();
        InterfaceSegregationPrinciple.Execute();
        DependencyInversionPrinciple.Execute();
    }
}