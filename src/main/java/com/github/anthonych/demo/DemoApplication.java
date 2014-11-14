package com.github.anthonych.demo;

import com.github.anthonych.demo.conf.DemoConfiguration;
import com.github.anthonych.demo.health.DemoHealthCheck;
import com.github.anthonych.demo.resource.UserResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

/**
 * Created by anthonychen on 9/11/14.
 */
public class DemoApplication extends Application<DemoConfiguration> {

    public static void main(String[] args) throws Exception {
        new DemoApplication().run(args);
    }

    @Override
    public void initialize(Bootstrap<DemoConfiguration> bootstrap) {
    }

    @Override
    public void run(DemoConfiguration configuration, Environment environment) throws Exception {
        // Register resources and healthchecks
        environment.jersey().register(new UserResource());
        environment.healthChecks().register("demoHealthcheck", new DemoHealthCheck("TEST DEMO"));
    }
}
