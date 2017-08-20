package com.carvalho.raphael.testsdaggerdi.java;

import com.carvalho.raphael.testsdaggerdi.java.component.DaggerMyComponent;
import com.carvalho.raphael.testsdaggerdi.java.component.MyComponent;
import com.carvalho.raphael.testsdaggerdi.java.service.BackendService;

import javax.inject.Inject;

/**
 * Created by RaphaelCarvalho on 20/08/2017.
 */

public class Main {

    @Inject
    BackendService backendService; //

    private MyComponent component;

    private Main() {
        component = DaggerMyComponent.builder().build();
        component.inject(this);
    }

    private void callServer() {
        boolean callServer = this.backendService.callServer();
        if (callServer) {
            System.out.println("Server call was successful. ");
        } else {
            System.out.println("Server call failed. ");
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.callServer();
    }
}
