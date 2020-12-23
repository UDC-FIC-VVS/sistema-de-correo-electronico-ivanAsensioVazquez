package gal.udc.fic.vvs.email.architecture;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

import org.junit.Test;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.lang.ArchRule;

import gal.udc.fic.vvs.email.archivo.Archivo;
import gal.udc.fic.vvs.email.archivo.Audio;
import gal.udc.fic.vvs.email.correo.DecoradorMensaje;

public class MyArchitectureTest {
    @Test
    public void some_architecture_rule() {
        JavaClasses importedClasses = new ClassFileImporter().importPackages("gal.udc.fic.vvs");
    
        ArchRule rule = classes().that().resideInAPackage("..source..")
        	    .should().dependOnClassesThat().resideInAPackage("..foo..");
        	    
        rule.check(importedClasses);
    }
}