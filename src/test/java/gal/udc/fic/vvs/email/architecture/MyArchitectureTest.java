package gal.udc.fic.vvs.email.architecture;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

import org.junit.Test;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.core.importer.ImportOptions;
import com.tngtech.archunit.core.importer.Location;
import com.tngtech.archunit.lang.ArchRule;

import gal.udc.fic.vvs.email.archivo.Archivo;
import gal.udc.fic.vvs.email.archivo.Audio;
import gal.udc.fic.vvs.email.correo.DecoradorMensaje;


public class MyArchitectureTest {
	
	 /*
	 * Test de arquitectura
	 * Test para ver si archivo existe dentro de la estructura email
	 * Tipo de prueba: Dinámicas estruturais de caixa branca
	 * Selección de datos: Particiones equivalentes
	 */
    @Test
    public void archivoExisteDentroDeEmailTest() {
        JavaClasses importedClasses = getClasses();
    
        ArchRule rule = classes().that().resideInAPackage("..email.archivo..")
        	    .should().onlyHaveDependentClassesThat().resideInAnyPackage("..email..");
        	    
        rule.check(importedClasses);
    }
    
	 /*
	 * Test de arquitectura
	 * est para ver si archivador existe dentro de la estructura email
	 * Tipo de prueba: Dinámicas estruturais de caixa branca
	 * Selección de datos: Particiones equivalentes
	 */
   @Test
   public void archivadorExisteDentroDeEmailTest() {
       JavaClasses importedClasses = getClasses();
   
       ArchRule rule = classes().that().resideInAPackage("..email.archivador..")
       	    .should().onlyHaveDependentClassesThat().resideInAnyPackage("..email..");
       	    
       rule.check(importedClasses);
   }
   
  
   /*
  	 * Test de arquitectura
  	 * Test para ver si cliente existe dentro de la estructura email
  	 * Tipo de prueba: Dinámicas estruturais de caixa branca
  	 * Selección de datos: Particiones equivalentes
  	 */
      @Test
      public void clienteExisteDentroDeEmailTest() {
          JavaClasses importedClasses = getClasses();
      
          ArchRule rule = classes().that().resideInAPackage("..email.cliente..")
          	    .should().onlyHaveDependentClassesThat().resideInAnyPackage("..email..");
          	    
          rule.check(importedClasses);
      }
      
  	 /*
  	 * Test de arquitectura
  	 * est para ver si archivador existe dentro de la estructura email
  	 * Tipo de prueba: Dinámicas estruturais de caixa branca
  	 * Selección de datos: Particiones equivalentes
  	 */
     @Test
     public void correoExisteDentroDeEmailTest() {
         JavaClasses importedClasses = getClasses();
     
         ArchRule rule = classes().that().resideInAPackage("..email.correo..")
         	    .should().onlyHaveDependentClassesThat().resideInAnyPackage("..email..");
         	    
         rule.check(importedClasses);
     }
     
     /*
   	 * Test de arquitectura
   	 * Test para ver si archivo solo es accedido por ciertos paquetes
   	 * Tipo de prueba: Dinámicas estruturais de caixa branca
   	 * Selección de datos: Particiones equivalentes
   	 */
     @Test
     public void accesoArchivoTest() {
    	 JavaClasses importedClasses = getClasses();
    	 
    	 ArchRule rule =
    			 classes().that().resideInAPackage("..email.archivo..")
    			 .should().onlyBeAccessed().byAnyPackage("..email.archivo..","..email.correo..");
          	    	
         rule.check(importedClasses);
      }
      
	  /*
	 	 * Test de arquitectura
	 	 * Test para ver si archivador solo es accedido por ciertos paquetes
	 	 * Tipo de prueba: Dinámicas estruturais de caixa branca
	 	 * Selección de datos: Particiones equivalentes
	 	 */
	 @Test
	 public void accesoArchivadorTest() {
		 JavaClasses importedClasses = getClasses();
	    
		 ArchRule rule =
				 classes().that().resideInAPackage("..email.archivador..")
				 .should().onlyBeAccessed().byAnyPackage("..email.archivador..", "..email.cliente..");
	        	    
	     rule.check(importedClasses);
	 }
	 
	 /*
   	 * Test de arquitectura
   	 * Test para ver si cliente solo es accedido por ciertos paquetes
   	 * Tipo de prueba: Dinámicas estruturais de caixa branca
   	 * Selección de datos: Particiones equivalentes
   	 */
     @Test
     public void clienteArchivoTest() {
    	 JavaClasses importedClasses = getClasses();
    	 
    	 ArchRule rule =
    			 classes().that().resideInAPackage("..email.cliente..")
    			 .should().onlyBeAccessed().byAnyPackage("..email.cliente..");
          	    	
         rule.check(importedClasses);
      }
      
	  /*
	 	 * Test de arquitectura
	 	 * Test para ver si correo solo es accedido por ciertos paquetes
	 	 * Tipo de prueba: Dinámicas estruturais de caixa branca
	 	 * Selección de datos: Particiones equivalentes
	 	 */
	 @Test
	 public void correoArchivadorTest() {
		 JavaClasses importedClasses = getClasses();
	    
		 ArchRule rule =
				 classes().that().resideInAPackage("..email.correo..")
				 .should().onlyBeAccessed().byAnyPackage("..email.correo..","..email.cliente..");
	        	    
	     rule.check(importedClasses);
	 }
      
     private JavaClasses getClasses() {
    	 return new ClassFileImporter().withImportOption(new ImportOption.DoNotIncludeTests()).importPackages("gal.udc.fic.vvs");
     }
        
}
