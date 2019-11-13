package com.wayz.ai.cmd;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.internal.Lists;

import java.util.List;

public class HGCommand {

    @Parameter
    public List<String> params = Lists.newArrayList();

    @Parameter(names = "-d", description = "Database name.Example:aoiRelation")
    public String database;

    @Parameter(names = "-p", description = "port")
    public int port = 8080;

    @Parameter(names = {"-u", "-url"}, description = "host.Example:127.0.0.1")
    public String url = "10.10.4.76";

    @Parameter(names = "-q", description = "germlin query script.")
    public String script;

    @Parameter(names = {"-v", "-vertex"}, description = "get random 10 vertexes.")
    public boolean showTopVertex = false;

    @Parameter(names = {"-e", "-edge"}, description = "get random 10 edges.")
    public boolean showTopEdge = false;

    @Parameter(names = {"-h", "-help"}, description = "helping")
    public boolean help = false;

    @Parameter(names = {"-s", "-schema"}, description = "show schema")
    public boolean showSchema = false;


    @Override
    public String toString() {
        return "HGCommand{" +
                "params=" + params +
                ", database='" + database + '\'' +
                ", port=" + port +
                ", url='" + url + '\'' +
                ", script='" + script + '\'' +
                ", showTopVertex=" + showTopVertex +
                ", showTopEdge=" + showTopEdge +
                ", help=" + help +
                ", schema=" + showSchema +
                '}';
    }
}
