package org.example;

// Ejercicio realizado en arquitectura POM

// Incorporacion de librerias

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Dejamos la configuracion en main
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Arturo\\Desktop\\geckodriver.exe" );
        WebDriver driver = new FirefoxDriver();

        //Instancia de la clase y mendiante esta clase traemos sus metodos

        TextBoxPage textBoxPage = new TextBoxPage(driver);

        //Referencia a los metodos de TextBoxPage
        try {
            //Codigo con referencia a los metodos
            textBoxPage.navigateTo();
            textBoxPage.takeScreenshot("C:\\Users\\Arturo\\Videos\\Captures\\ejemplo.png");
            System.out.println("Se genero la captura de pantalla");


        } catch (IOException e) {
            System.out.println("Existe un error al capturar la pantalla");
        }
    }
}