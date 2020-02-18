package edu.rit.mitappinventor.roswrapperlibrary;

import org.ros.address.InetAddressFactory;
import org.ros.node.NodeConfiguration;

import java.net.URI;
import java.net.URISyntaxException;

public class ROSNodeConfiguration {
    private URI masterURI;
    ROSNodeConfiguration(String url) throws URISyntaxException {
        masterURI = new URI(url);
    }

    private String getDefaultHostAddress() {
        return InetAddressFactory.newNonLoopback().getHostAddress();
    }

    NodeConfiguration getConfig() {
       return NodeConfiguration.newPublic(this.getDefaultHostAddress(), masterURI);
    }
}
