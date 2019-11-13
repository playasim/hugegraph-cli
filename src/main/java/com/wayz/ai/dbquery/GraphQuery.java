package com.wayz.ai.dbquery;

import com.baidu.hugegraph.structure.gremlin.ResultSet;
import com.wayz.ai.config.HugeGraphClient;

public class GraphQuery {

    public static ResultSet getVerTexOfAOIRelation(HugeGraphClient hugeGraphClient) {
        String script = "g.V().limit(10)";
        return hugeGraphClient.gremlinExecute(script);

    }

    public static ResultSet getEdgeOfAOIRelation(HugeGraphClient hugeGraphClient) {
        String script = "g.E().limit(10)";
        return hugeGraphClient.gremlinExecute(script);

    }

    public static void getSchema(HugeGraphClient hugeGraphClient) {
        hugeGraphClient.showSchema();
    }
}
