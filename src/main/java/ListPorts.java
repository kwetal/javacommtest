import java.util.Enumeration;
import purejavacomm.*;
/**
 *
 * @author in568bax
 */
public class ListPorts
{
    public static void main(String[] args) {
	for (Enumeration<CommPortIdentifier> pId = CommPortIdentifier.getPortIdentifiers(); pId.hasMoreElements(); ) {
	    CommPortIdentifier cpid = pId.nextElement();
	    System.out.println(cpid);
	}
    }
}
