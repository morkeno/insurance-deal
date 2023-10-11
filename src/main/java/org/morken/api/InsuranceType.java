package org.morken.api;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import javax.ws.rs.Consumes;

@Consumes("text/plain")
public enum InsuranceType {
    STANDARD("standard");

    private final String name;

    @JsonCreator
    InsuranceType(String name) {
        this.name = name;
    }

    @JsonValue
    public String getName() {
        return name;
    }
}
