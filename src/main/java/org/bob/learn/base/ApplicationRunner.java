package org.bob.learn.base;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ApplicationRunner implements CommandLineRunner {

    static {
        System.setProperty("jboss.threads.eqe.statistics.active-count","true");
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
