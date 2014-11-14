package com.github.anthonych.demo.health;

import com.codahale.metrics.health.HealthCheck;

public class DemoHealthCheck extends HealthCheck {

    private String testStr;

    public DemoHealthCheck(String testStr) {
        this.testStr = testStr;
    }

    @Override
    protected Result check() throws Exception {
        if (testStr.contains("TEST")) {
            return Result.healthy();
        }

        return Result.unhealthy("Service Unavailable.");
    }
}
