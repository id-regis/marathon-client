package mesosphere.marathon.client.model.v2;

import mesosphere.marathon.client.utils.ModelUtils;

import java.util.*;

public class App {

    private String id;
    private String cmd;
    private Collection<String> args;
    private Collection<PortDefinition> portDefinitions;
    private Integer instances;
    private Double cpus;
    private Double mem;
    private Collection<String> uris;
    private List<List<String>> constraints;
    private Map<String, String> labels;
    private Collection<Fetch> fetch;
    private Boolean requirePorts;
    private Container container;
    private Map<String, String> env;
    private String executor;
    private List<Integer> ports;
    private Collection<Task> tasks;
    private Integer tasksStaged;
    private Integer tasksRunning;
    private Collection<String> dependencies;
    private List<HealthCheck> healthChecks;
    private Integer backoffSeconds;
    private Double backoffFactor;
    private Integer maxLaunchDelaySeconds;
    private UpgradeStrategy upgradeStrategy;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCmd() {
        return cmd;
    }

    public void setCmd(String cmd) {
        this.cmd = cmd;
    }

    public Collection<String> getArgs() {
        return args;
    }

    public void setArgs(Collection<String> args) {
        this.args = args;
    }

    public Collection<PortDefinition> getPortDefinitions() {
        return portDefinitions;
    }

    public void setPortDefinitions(Collection<PortDefinition> portDefinitions) {
        this.portDefinitions = portDefinitions;
    }

    public void addPortDefinition(PortDefinition portDefinition) {
        if (this.portDefinitions == null) {
            this.portDefinitions = new ArrayList<PortDefinition>();
        }
        this.portDefinitions.add(portDefinition);
    }

    public Integer getInstances() {
        return instances;
    }

    public void setInstances(Integer instances) {
        this.instances = instances;
    }

    public Double getCpus() {
        return cpus;
    }

    public void setCpus(Double cpus) {
        this.cpus = cpus;
    }

    public Double getMem() {
        return mem;
    }

    public void setMem(Double mem) {
        this.mem = mem;
    }

    public Collection<String> getUris() {
        return uris;
    }

    public void setUris(Collection<String> uris) {
        this.uris = uris;
    }

    private void addUri(String uri) {
        if (this.uris == null) {
            this.uris = new ArrayList<String>();
        }
        this.uris.add(uri);
    }

    public List<List<String>> getConstraints() {
        return constraints;
    }

    public void setConstraints(List<List<String>> constraints) {
        this.constraints = constraints;
    }

    public void addConstraint(String attribute, String operator, String value) {
        if (this.constraints == null) {
            this.constraints = new ArrayList<List<String>>();
        }
        List<String> constraint = new ArrayList<String>(3);
        constraint.add(attribute == null ? "" : attribute);
        constraint.add(operator == null ? "" : operator);
        constraint.add(value == null ? "" : value);
        this.constraints.add(constraint);
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

    public Collection<Fetch> getFetch() {
        return fetch;
    }

    public void setFetch(Collection<Fetch> fetch) {
        this.fetch = fetch;
    }

    public void addFetch(Fetch fetch) {
        if (this.fetch == null) {
            this.fetch = new ArrayList<Fetch>();
        }
        this.fetch.add(fetch);
    }

    public Boolean getRequirePorts() {
        return requirePorts;
    }

    public void setRequirePorts(Boolean requirePorts) {
        this.requirePorts = requirePorts;
    }

    public Container getContainer() {
        return container;
    }

    public void setContainer(Container container) {
        this.container = container;
    }

    public Map<String, String> getEnv() {
        return env;
    }

    public void setEnv(Map<String, String> env) {
        this.env = env;
    }

    public String getExecutor() {
        return executor;
    }

    public void setExecutor(String executor) {
        this.executor = executor;
    }

    public List<Integer> getPorts() {
        return ports;
    }

    public void setPorts(List<Integer> ports) {
        this.ports = ports;
    }

    public void addPort(int port) {
        if (this.ports == null) {
            this.ports = new ArrayList<Integer>();
        }
        this.ports.add(port);
    }

    public Collection<Task> getTasks() {
        return tasks;
    }

    public void setTasks(Collection<Task> tasks) {
        this.tasks = tasks;
    }

    public Integer getTasksStaged() {
        return tasksStaged;
    }

    public void setTasksStaged(Integer tasksStaged) {
        this.tasksStaged = tasksStaged;
    }

    public Integer getTasksRunning() {
        return tasksRunning;
    }

    public void setTasksRunning(Integer tasksRunning) {
        this.tasksRunning = tasksRunning;
    }

    public Collection<String> getDependencies() {
        return dependencies;
    }

    public void setDependencies(Collection<String> dependencies) {
        this.dependencies = dependencies;
    }

    private void addDependencies(String dependency) {
        if (this.dependencies == null) {
            this.dependencies = new ArrayList<String>();
        }
        this.dependencies.add(dependency);
    }

    public List<HealthCheck> getHealthChecks() {
        return healthChecks;
    }

    public void setHealthChecks(List<HealthCheck> healthChecks) {
        this.healthChecks = healthChecks;
    }

    public Double getBackoffFactor() {
        return backoffFactor;
    }

    public void setBackoffFactor(Double backoffFactor) {
        this.backoffFactor = backoffFactor;
    }

    public Integer getBackoffSeconds() {
        return backoffSeconds;
    }

    public void setBackoffSeconds(Integer backoffSeconds) {
        this.backoffSeconds = backoffSeconds;
    }

    public Integer getMaxLaunchDelaySeconds() {
        return maxLaunchDelaySeconds;
    }

    public void setMaxLaunchDelaySeconds(Integer maxLaunchDelaySeconds) {
        this.maxLaunchDelaySeconds = maxLaunchDelaySeconds;
    }

    public UpgradeStrategy getUpgradeStrategy() {
        return upgradeStrategy;
    }

    public void setUpgradeStrategy(UpgradeStrategy upgradeStrategy) {
        this.upgradeStrategy = upgradeStrategy;
    }

    @Override
    public String toString() {
        return ModelUtils.toString(this);
    }

}
