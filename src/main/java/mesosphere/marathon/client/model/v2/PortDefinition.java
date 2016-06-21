package mesosphere.marathon.client.model.v2;

import java.util.*;

public class PortDefinition {

    private int port;
    private String protocol;
    private String name;
    private Map<String, String> labels;

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, String> getLabels() {
        return labels;
    }

    public void setLabels(Map<String, String> labels) {
        this.labels = labels;
    }

    public void addLabel(String labelKey, String labelValue) {
        if (this.labels == null) {
            this.labels = new HashMap<String, String>();
        }
        this.labels.put(labelKey, labelValue);
    }

}
