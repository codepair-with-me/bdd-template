package com.codepair.processor.impl;

import com.codepair.domain.Item;
import com.codepair.domain.ProcessingResponse;
import com.codepair.processor.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class NormalItemProcessor implements ItemProcessor {
    @Override
    public ProcessingResponse process(Item item) {
        return null;
    }
}
