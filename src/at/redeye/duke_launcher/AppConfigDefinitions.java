/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.redeye.duke_launcher;

import at.redeye.FrameWork.base.BaseAppConfigDefinitions;
import at.redeye.FrameWork.base.prm.PrmDefaultChecksInterface;
import at.redeye.FrameWork.base.prm.bindtypes.DBConfig;
import at.redeye.FrameWork.base.prm.impl.GlobalConfigDefinitions;
import at.redeye.FrameWork.base.prm.impl.LocalConfigDefinitions;
import at.redeye.FrameWork.base.prm.impl.PrmDefaultCheckSuite;

/**
 *
 * @author martin
 */
public class AppConfigDefinitions extends BaseAppConfigDefinitions {

    public static DBConfig IconSize = new DBConfig("IconSize","100","Icon Größe", new PrmDefaultCheckSuite(PrmDefaultChecksInterface.PRM_IS_LONG));    
    public static DBConfig ExeLocation = new DBConfig("ExeLocation","eduke32-oldmp.exe","Icon Größe");    
    

    public static void registerDefinitions() {

        BaseRegisterDefinitions();

        addLocal(ExeLocation);        

        GlobalConfigDefinitions.add_help_path("/at/redeye/FindDup/resources/Help/Params/");
        LocalConfigDefinitions.add_help_path("/at/redeye/FindDup/resources/Help/Params/");
    }    
}
