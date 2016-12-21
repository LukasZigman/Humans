package com.myapp.service;

import com.myapp.DomainTest;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import javax.inject.Inject;

import static org.junit.Assert.*;

public class HumanServiceTest {

    private HumanService humanService = new HumanService(null);

    @Test
    public void name() throws Exception {
        boolean b = humanService.checkIfSiblings(null, null);
        Assertions.assertThat(b).isFalse();

    }
}
