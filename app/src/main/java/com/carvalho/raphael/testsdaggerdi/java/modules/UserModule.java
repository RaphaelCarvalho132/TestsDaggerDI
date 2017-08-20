package com.carvalho.raphael.testsdaggerdi.java.modules;

import com.carvalho.raphael.testsdaggerdi.java.model.User;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by RaphaelCarvalho on 20/08/2017.
 */

@Module
public class UserModule {

    @Provides
    @Singleton
    User providesUser() {
        return new User("Lars", "Vogel");
    }
}
