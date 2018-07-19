package com.akalin.projectManagement;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.jupiter.api.*;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.jupiter.api.AfterEach;


import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProjectManagementApplicationTests {

    @BeforeAll
    public static void aciklamaAll() {
        System.out.println("Testlerin baslangic kismi All");
    }
    @BeforeEach
    public void aciklamaEach() {
        System.out.println("Testlerin baslangic kismi Each");
    }

    @Test
    public void contextLoads() {
    }

    @Test
    public void gokcetest() {
        String gokce = "Hello World";
        assertEquals(gokce, "Hello World");
    }

    @Test
    public void diller() {
        String a ="java";
        String b ="c";
        String dil = "python";
        assertEquals("python", dil);
    }

    @Test
    public void sayilar() {
        int x = 5;
        int y = 7;
        int z = 9;
        int k = 2;
        int l = 4;
        int m = 6;
        assertFalse(x > y);
    }


    @Test
    public void carpim() {
        int sayi1 = 5;
        int sayi2 = 7;
        int sonuc = sayi1 * sayi2;
        assertTrue(sonuc == 35);
    }

    @Ignore
    @Test
    public void benzerlik() {
        String il1 = "izmir";
        String il2 = "aydin";
        assertNotSame(il1, il2);
    }

    @Test
    public void bolme() {
        int bolen = 4;
        int bolunen = 12;
        int bolme = bolunen / bolen;
        assertFalse(bolme > 53);
    }

    @Test
    public void enbuyuksayi() {
        int birinci = 1;
        int ikinci = 2;
        int ucuncu = 3;
        int ebs = birinci;
        if (ikinci > ebs) {
            ebs = ikinci;
        }
        if (ucuncu > ebs) {
            ebs = ucuncu;
        }
        assertSame(ebs,ucuncu);
    }


    @Test
    public void nulldurum() {
        String kelime1 = "elma";
        String Kelime2 = "kivi";
        String kelime3 = "armut";
        String kelime4 = null;
        assertNull(kelime4);
        assertNotNull(kelime3);

    }


    @Test
    public void dizi() {
        int[] dizi1 = {1, 3, 5, 7};
        int[] dizi2 = {1, 3, 5, 7};
        assertArrayEquals(dizi1, dizi2);
    }

    @Test
    public void toplam() {
        int sayi1=4;
        int sayi2=5;
        int toplam=sayi1+sayi2;
        assertTrue(toplam == 9);
    }
    @AfterAll
    public static void bitisAll(){
        System.out.println("testlerin sonu all");

        }

    @AfterEach
    public void bitisEach(){
        System.out.println("testlerin sonu each");
    }
}


























