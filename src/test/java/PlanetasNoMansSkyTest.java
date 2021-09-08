import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlanetasNoMansSkyTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        PlanetasNoMansSky mainPlanet = new PlanetasNoMansSky(
                "Terra", "Lush", "Infested", 4, "Life Chance"
        );
        PlanetasNoMansSky planetClone = mainPlanet.clone();
        planetClone.setNome("L 98-59");
        planetClone.setTipo("Barren");
        planetClone.setBiomaProbabilidade(2);

        assertEquals("PlanetasNoMansSky{Nome: 'Terra', Tipo: 'Lush', Bioma Subtipo: Infested, Bioma Probabilidade: 4 , Propriedades: 'Life Chance'}", mainPlanet.toString());
        assertEquals("PlanetasNoMansSky{Nome: 'L 98-59', Tipo: 'Barren', Bioma Subtipo: Infested, Bioma Probabilidade: 2 , Propriedades: 'Life Chance'}", planetClone.toString());

    }
}