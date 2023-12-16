package com.holyraven.socksaccounting.enums;

import com.holyraven.socksaccounting.exceptions.RequestException;

public enum Operation {

    MORETHAN,

    LESSTHAN,

    EQUAL;

    public static Operation getStateOperation(String stateOperation) {
        try {
            return Operation.valueOf(stateOperation.toUpperCase());
        } catch (Exception e) {
            throw new RequestException("Unknown operation: " + stateOperation);
        }
    }
}
