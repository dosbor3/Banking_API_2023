package com.sg.banking_api.models;

import java.util.Objects;

public class Valid_State {
    private String state_code;
    private String state_name;

    public Valid_State(String state_name) {
        this.state_name = state_name;
    }

    public String getState_code() {
        return state_code;
    }

    public String getState_name() {
        return state_name;
    }

    public void setState_name(String state_name) {
        this.state_name = state_name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Valid_State that = (Valid_State) o;
        return Objects.equals(state_code, that.state_code) && state_name.equals(that.state_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(state_code, state_name);
    }
}
