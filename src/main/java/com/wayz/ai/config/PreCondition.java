package com.wayz.ai.config;

import com.beust.jcommander.JCommander;
import com.wayz.ai.cmd.HGCommand;

public final class PreCondition {

    public static void checkArgs(HGCommand hgCommand) {
        if (hgCommand.help) {
            JCommander.newBuilder().addObject(hgCommand).build().usage();
            System.exit(-1);
        }
        checkArguments(hgCommand.database != null, "-d can not be missed");
        System.out.println(hgCommand.toString());
    }

    public static void checkArguments(boolean condition, String errorMessage) {
        if (!condition) {
            throw new IllegalArgumentException(errorMessage);
        }
    }
}
