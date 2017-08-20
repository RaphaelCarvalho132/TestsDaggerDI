package com.carvalho.raphael.testsdaggerdi.java.service;

import com.carvalho.raphael.testsdaggerdi.java.component.DaggerMyUserComponent;
import com.carvalho.raphael.testsdaggerdi.java.model.User;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by RaphaelCarvalho on 20/08/2017.
 */

public class BackendService {

    @Inject
    public User user;

    private String serverUrl;

    @Inject
    public BackendService(@Named("serverUrl") String serverUrl) {
        this.serverUrl = serverUrl;
        DaggerMyUserComponent.builder().build().inject(this);
    }

    public boolean callServer() {
        if (user != null && serverUrl != null && serverUrl.length() > 0) {
            System.out.println("User: " + user + " ServerUrl: " + serverUrl);
            return true;
        }
        return false;
    }
}
