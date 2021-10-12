package model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertEquals;

public class AvaliadorTest {

    private Usuario ruither;
    private Usuario joao;
    private Usuario maria;

    private Leilao leilao;

    private Lance lance;
    private Lance lance2;
    private Lance lance3;

    private Avaliador avaliador;

    @BeforeEach
    void initObjects(){
        ruither = new Usuario("Ruither", "ruither.carvalho@gmail.com");
        joao = new Usuario("Joao", "joao@123");
        maria = new Usuario("Maria", "maria@123");

        leilao = new Leilao("Playstation 3 novo");
        lance = new Lance(ruither, 300.00);
        lance2 = new Lance(joao, 350.00);
        lance3 = new Lance(maria, 400.00);

        avaliador = new Avaliador();

    }

    @Test
     public void testaMaiorLanceSemOrdem(){

        leilao.propoe(lance2);
        leilao.propoe(lance);
        leilao.propoe(lance3);

        avaliador.avalia(leilao);

        Double lanceMaior = avaliador.getMaiorLance();

        Double lanceVencedorEsperado = 400.00;

        assertEquals(lanceVencedorEsperado, lanceMaior);

    }

    @Test
    public void testaMaiorLanceEmOrdem(){
        leilao.propoe(lance);
        leilao.propoe(lance2);
        leilao.propoe(lance3);

        Avaliador avaliador = new Avaliador();
        avaliador.avalia(leilao);

        Double lanceMaior = avaliador.getMaiorLance();

        Double lanceVencedorEsperado = 400.00;

        assertEquals(lanceVencedorEsperado, lanceMaior);
    }

    @Test
    public void testaMenorLanceSemOrdem(){
        leilao.propoe(lance2);
        leilao.propoe(lance);
        leilao.propoe(lance3);

        Avaliador avaliador = new Avaliador();
        avaliador.avalia(leilao);

        Double lanceMaior = avaliador.getMenorDeTodos();

        Double lanceVencedorEsperado = 300.00;

        assertEquals(lanceVencedorEsperado, lanceMaior);
    }

    @Test
    public void testaMenorLanceEmOrdem(){
        leilao.propoe(lance);
        leilao.propoe(lance2);
        leilao.propoe(lance3);

        Avaliador avaliador = new Avaliador();
        avaliador.avalia(leilao);

        Double lanceMenor = avaliador.getMenorDeTodos();

        Double lanceMenorEsperado = 300.00;

        assertEquals(lanceMenorEsperado, lanceMenor);
    }

    @Test
    public void testaMenorLanceEmOrdemDecrescente(){
        leilao.propoe(lance3);
        leilao.propoe(lance2);
        leilao.propoe(lance);

        Avaliador avaliador = new Avaliador();
        avaliador.avalia(leilao);

        Double lanceMenor = avaliador.getMenorDeTodos();

        Double lanceMenorEsperado = 300.00;

        assertEquals(lanceMenorEsperado, lanceMenor);
    }

    @Test
    public void testaMaiorLanceEmOrdemDecrescente(){
        leilao.propoe(lance3);
        leilao.propoe(lance2);
        leilao.propoe(lance);

        Avaliador avaliador = new Avaliador();
        avaliador.avalia(leilao);

        Double lanceMaior = avaliador.getMaiorLance();

        Double lanceVencedorEsperado = 400.00;

        assertEquals(lanceVencedorEsperado, lanceMaior);
    }

    @Test
    public void testaApenasComUmLance(){
        leilao.propoe(lance);

        Avaliador avaliador = new Avaliador();
        avaliador.avalia(leilao);

        Double lanceMaior = avaliador.getMaiorLance();

        Double lanceVencedorEsperado = 300.00;

        assertEquals(lanceVencedorEsperado, lanceMaior);
    }

    @Test
    public void testaMaiorSemLances(){
        avaliador.avalia(leilao);

        Double lanceMaior = avaliador.getMaiorLance();

        Double lanceVencedorEsperado = Double.NEGATIVE_INFINITY;

        assertEquals(lanceVencedorEsperado, lanceMaior);
    }

    @Test
    public void testaMenorSemLances(){
        avaliador.avalia(leilao);

        Double lanceMaior = avaliador.getMenorDeTodos();

        Double lanceVencedorEsperado = Double.POSITIVE_INFINITY;

        assertEquals(lanceVencedorEsperado, lanceMaior);
    }

}
