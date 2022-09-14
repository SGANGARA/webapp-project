
package in.saidemy.webapp;

import org.apache.felix.gogo.commands.Command;
import org.apache.karaf.shell.console.OsgiCommandSupport;


/**
 * Displays the last log entries
 */
@Command(scope = "web.war", name = "maven", description = "webappproject")
public class maven extends OsgiCommandSupport {

    protected Object doExecute() throws Exception {
         System.out.println("Executing command maven");
         return null;
    }
}
