package org.netbeans.contrib.yenta;

import java.util.logging.Level;
import junit.framework.Test;
import org.netbeans.contrib.yenta.demo.AwtDemo;
import org.netbeans.contrib.yenta.demo.CoreDemo;
import org.netbeans.contrib.yenta.demo.CoreUiDemo;
import org.netbeans.contrib.yenta.demo.FavoritesDemo;
import org.netbeans.junit.NbModuleSuite;
import org.netbeans.junit.NbTestCase;

public class ApplicationTest extends NbTestCase {

    public static Test suite() {
        return NbModuleSuite.createConfiguration(ApplicationTest.class).
                gui(false).
                failOnMessage(Level.WARNING).
                failOnException(Level.INFO).
                suite();
    }

    public ApplicationTest(String n) {
        super(n);
    }

    public void testApplication() {
        new FavoritesDemo().actionPerformed(null);
        new CoreUiDemo().actionPerformed(null);
        new CoreDemo().actionPerformed(null);
        new AwtDemo().actionPerformed(null);
    }

}
