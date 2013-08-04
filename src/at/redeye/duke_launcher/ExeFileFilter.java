/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package at.redeye.duke_launcher;

import at.redeye.FrameWork.base.Root;
import java.io.File;



/**
 *
 * @author martin
 */
public class ExeFileFilter extends javax.swing.filechooser.FileFilter
{
    Root root;

    public ExeFileFilter( Root root )
    {
        this.root = root;
    }

    @Override
    public boolean accept(File pathname)
    {
        if( pathname.isDirectory() )
            return true;
        
        if( pathname.toString().toLowerCase().endsWith(".exe") )
            return true;
       
        return false;            
    }

    @Override
    public String getDescription() {
       return root.MlM("*.exe");
    }

}
