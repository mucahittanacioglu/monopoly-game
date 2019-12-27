package main.java.Controller;

import main.java.DAL.DInstruction;

/**
 * <h>CInstruction</h>
 *
 * <p>main.java.Controller for Instruction class which is used during getting data from Data Layer in User Interface.</p>
 *
 * @author Ahmet LEKESİZ
 * @version 1.0
 */
public class CInstruction {

    private static CInstruction instance;

    public static DInstruction getDInstruction(){
        return DInstruction.getInstance();
    }
}
