package com.codepair.processor;

import com.codepair.domain.Item;
import com.codepair.domain.ProcessingResponse;

public interface ItemProcessor {

    /**
     * This method translate item message to the target message format
     * every implementation has its own target format implementation
     * @param item : Source message format
     * @return ProcessingResponse : from customized implementation class
     */
    public ProcessingResponse process(Item item);
}
