package com.progressivecoder.es.eventsourcingcqrsaxonspringboot.services.queries;

import com.progressivecoder.es.eventsourcingcqrsaxonspringboot.entities.AccountQueryEntity;

import java.util.List;

public interface AccountQueryService {
    public List<Object> listEventsForAccount(String accountNumber);
    public AccountQueryEntity getAccount(String accountNumber);
}
