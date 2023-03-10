/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package at.redeye.duke_launcher;

import at.redeye.FrameWork.base.BaseModuleLauncher;
import at.redeye.FrameWork.base.FrameWorkConfigDefinitions;
import at.redeye.FrameWork.base.LocalRoot;
import at.redeye.FrameWork.base.Setup;
import at.redeye.FrameWork.widgets.StartupWindow;
import org.apache.log4j.Level;

/**
 *
 * @author martin
 */
public class ModuleLauncher extends BaseModuleLauncher
{
    MainWin mainwin;

    public ModuleLauncher( String[] args )
    {
        super( args );

        BaseConfigureLogging(Level.ERROR);
        
        root = new LocalRoot("DukeLauncher", "DukeLauncher", false, false);

        root.setBaseLanguage("de");
        root.setDefaultLanguage("en");

    }

    @Override
    public String getVersion() {
        return "0.1";
    }
    
    public void invokeGui()
    {
        if (splashEnabled()) {
            splash = new StartupWindow(
                    "/at/redeye/FrameWork/base/resources/pictures/redeye.png");
        }

         // this sets the default value only
        FrameWorkConfigDefinitions.LookAndFeel.value.loadFromString("nimbus");

        AppConfigDefinitions.registerDefinitions();
	FrameWorkConfigDefinitions.registerDefinitions();

        setLookAndFeel(root);

        configureLogging();

        if( mainwin == null )
            mainwin = new MainWin(root);

        closeSplash();

        mainwin.setVisible(true);
        mainwin.toFront();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        new ModuleLauncher(args).invokeGui();

    }    
    
}
