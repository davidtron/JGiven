package com.tngtech.jgiven.junit.test;

import static org.assertj.core.api.Assertions.assertThat;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import com.tngtech.jgiven.annotation.Table;

public class GivenTestStep extends Stage<GivenTestStep> {

    @ProvidedScenarioState
    int value1;

    @ProvidedScenarioState
    int value2;

    public GivenTestStep some_integer_value( int someIntValue ) {
        this.value1 = someIntValue;
        return self();
    }

    public void some_boolean_value( boolean someBooleanValue ) {

    }

    public void $d_and_$d( int value1, int value2 ) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public GivenTestStep another_integer_value( int secondArg ) {
        value2 = secondArg;
        return self();
    }

    public void a_third_integer_value( int thirdArg ) {}

    public void something() {

    }

    public void some_step_fails( boolean fail ) {
        assertThat( fail ).isFalse();
    }

    public static class CoffeePrice {
        String name;
        double price_in_EUR;

        public CoffeePrice( String name, double priceInEur ) {
            this.name = name;
            this.price_in_EUR = priceInEur;
        }
    }

    public GivenTestStep the_following_data( @Table CoffeePrice... data ) {
        return this;
    }
}
