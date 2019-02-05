package com.progressivecoder.es.eventsourcingcqrsaxonspringboot.events;

import com.progressivecoder.es.eventsourcingcqrsaxonspringboot.aggregates.Status;

public class AccountHeldEvent extends BaseEvent<String> {

    public final Status status;

    public AccountHeldEvent(String id, Status status) {
        super(id);
        this.status = status;
    }
}
