package iot;

import akka.actor.AbstractActor;
import akka.actor.Props;
import akka.event.Logging;
import akka.event.LoggingAdapter;

public class IOTSupervisor extends AbstractActor {

    private final LoggingAdapter log = Logging.getLogger(getContext().getSystem(), this);

    public static Props props() {
        return Props.create(IOTSupervisor.class, IOTSupervisor::new);
    }

    public void preStart() {
        log.info("IoT Application started");
    }

    public void postStop() {
        log.info("IoT Application stopped");
    }

    @Override
    public Receive createReceive() {
        return receiveBuilder().build();
    }
}
