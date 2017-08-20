package com.carvalho.raphael.testsdaggerdi.java.modules;

import com.carvalho.raphael.testsdaggerdi.java.service.BackendService;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by RaphaelCarvalho on 20/08/2017.
 */

@Module
public class BackEndServiceModule {

    @Provides
    @Singleton
    BackendService provideBackendService(@Named("anotherUrl") String serverUrl) {
        return new BackendService(serverUrl);
    }

    @Provides
    @Named("serverUrl")
    String provideServerUrl() {
        return "http://www.vogella.com";
    }

    @Provides
    @Named("anotherUrl")
    String provideAnotherUrl() {
        return "http://www.google.com";
    }

}
