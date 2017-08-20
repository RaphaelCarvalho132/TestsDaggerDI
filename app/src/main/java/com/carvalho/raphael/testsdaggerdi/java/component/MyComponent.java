package com.carvalho.raphael.testsdaggerdi.java.component;

import com.carvalho.raphael.testsdaggerdi.java.Main;
import com.carvalho.raphael.testsdaggerdi.java.modules.BackEndServiceModule;
import com.carvalho.raphael.testsdaggerdi.java.modules.UserModule;
import com.carvalho.raphael.testsdaggerdi.java.service.BackendService;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by RaphaelCarvalho on 20/08/2017.
 */
@Singleton
@Component(modules = {UserModule.class, BackEndServiceModule.class})
public interface MyComponent {

    // provide the dependency for dependent components
    // (not needed for single-component setups)
    BackendService provideBackendService();

    // allow to inject into our Main class
    // method name not important
    void inject(Main main);
}