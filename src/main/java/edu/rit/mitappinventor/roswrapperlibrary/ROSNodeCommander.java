package edu.rit.mitappinventor.roswrapperlibrary;

import org.ros.node.DefaultNodeMainExecutor;
import org.ros.node.NodeMainExecutor;

public class ROSNodeCommander {
    NodeMainExecutor nodeMainExecutor;
    ROSNodeConfiguration nodeConfiguration;
    public ROSNodeCommander() {
        this.nodeMainExecutor = DefaultNodeMainExecutor.newDefault();
    }

    public void addConfiguration(ROSNodeConfiguration nodeConfiguration) {
        this.nodeConfiguration = nodeConfiguration;
    }

    public void executeNode(ROSNodeMain thing) {
        this.nodeMainExecutor.execute(thing, nodeConfiguration.getConfig());
    }

}
