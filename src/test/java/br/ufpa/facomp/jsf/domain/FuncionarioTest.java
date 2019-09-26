package br.ufpa.facomp.jsf.domain;

import java.util.Set;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author vidal
 */
public class FuncionarioTest {
    
    public FuncionarioTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testNumeroRegistro() {
        System.out.println("numeroRegistro");
        Integer numeroRegistro = 997;
        Funcionario instance = new Funcionario();        
        Funcionario result = instance.numeroRegistro(numeroRegistro);
        assertNotEquals(998, result);
    }

    @Test
    public void testNome() {
        System.out.println("nome");
        String nome = "Douglas";
        Funcionario instance = new Funcionario();
        Funcionario result = instance.nome(nome);
        assertEquals("Douglas", result);
    }

    @Test
    public void testSalario() {
        System.out.println("salario");
        Double salario = 4500.50;
        Funcionario instance = new Funcionario();
        Funcionario result = instance.salario(salario);
        assertEquals(4500.50, result);
    }
   
    @Test
    public void testSetNumeroRegistro() {
        System.out.println("setNumeroRegistro");
        Integer numeroRegistro = 1998;
        Funcionario instance = new Funcionario();
        instance.setNumeroRegistro(numeroRegistro);
    }
    
    @Test
    public void testGetNumeroRegistro() {
        System.out.println("getNumeroRegistro");
        Funcionario instance = new Funcionario();
        Integer expResult = 1998;
        Integer result = instance.getNumeroRegistro();
        assertEquals(expResult, result);
    }

    
 @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "Kennzy";
        Funcionario instance = new Funcionario();
        instance.setNome(nome);
    }

    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Funcionario instance = new Funcionario();
        String expResult = "Kennzy";
        String result = instance.getNome();
        assertEquals(expResult, result);
    }
   
   @Test
    public void testSetSalario() {
        System.out.println("setSalario");
        Double salario = 500.40;
        Funcionario instance = new Funcionario();
        instance.setSalario(salario);
     
    }
    
    @Test
    public void testGetSalario() {
        System.out.println("getSalario");
        Funcionario instance = new Funcionario();
        Double expResult = 500.40;
        Double result = instance.getSalario();
        assertEquals(expResult, result);

    }

 
}
