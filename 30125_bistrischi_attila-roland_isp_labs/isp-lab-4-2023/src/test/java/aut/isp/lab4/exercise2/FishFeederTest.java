package aut.isp.lab4.exercise2;

import org.junit.Test;

import static org.junit.Assert.*;

public class FishFeederTest {

    @Test
    public void FishTest() {
        FishFeeder fishFeeder = new FishFeeder("Eu.SRL", "78ERHEY7U7DEH");
        fishFeeder.setMeals(-19);
        assertEquals("Fish no more feed! Fish is hungary!\n", fishFeeder.veriffeed());

        fishFeeder.setMeals(387465);
        assertEquals("Fish is feeding", fishFeeder.veriffeed());
    }

    @Test
    public void FishTestToString() {
        FishFeeder fishFeeder = new FishFeeder("Eu.SRL", "78ERHEY7U7DEH");
        assertEquals("FishFeeder{manufacturer='Eu.SRL', model='78ERHEY7U7DEH', meals=14}", fishFeeder.toString());
    }
}
