package com.wayz.ai;

import com.baidu.hugegraph.structure.gremlin.ResultSet;
import com.beust.jcommander.JCommander;
import com.wayz.ai.cmd.HGCommand;
import com.wayz.ai.config.HugeGraphClient;
import com.wayz.ai.dbquery.GraphQuery;
import static com.wayz.ai.config.PreCondition.checkArgs;

public class MainEntry {

    public static void main(String[] args) {
        HGCommand hgCommand = new HGCommand();
        JCommander.newBuilder()
                .addObject(hgCommand)
                .build()
                .parse(args);
        checkArgs(hgCommand);
        HugeGraphClient hugeGraphClient = new HugeGraphClient(hgCommand.url, hgCommand.port, hgCommand.database);
        hugeGraphClient.init();
        execute(hugeGraphClient, hgCommand);
        hugeGraphClient.close();
        System.exit(-1);
        }

    private static ResultSet execute(HugeGraphClient hugeGraphClient, HGCommand hgCommand) {
        ResultSet resultSet = null;
        if (hgCommand.showTopEdge) {
            resultSet = GraphQuery.getEdgeOfAOIRelation(hugeGraphClient);
        } else if (hgCommand.showTopVertex) {
            resultSet = GraphQuery.getVerTexOfAOIRelation(hugeGraphClient);
        } else if (hgCommand.showSchema) {
            System.out.println("Showing schema...");
            GraphQuery.getSchema(hugeGraphClient);
        } else {
            resultSet = hugeGraphClient.gremlinExecute(hgCommand.script);
        }
        return resultSet;
    }


}

