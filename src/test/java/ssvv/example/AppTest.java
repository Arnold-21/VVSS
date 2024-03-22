package ssvv.example;

import domain.Nota;
import domain.Student;
import domain.Tema;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.jupiter.api.Test;
import repository.NotaXMLRepository;
import repository.StudentXMLRepository;
import repository.TemaXMLRepository;
import service.Service;
import validation.NotaValidator;
import validation.StudentValidator;
import validation.TemaValidator;
import validation.Validator;

import java.util.Collection;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
    @Test
    public void testaddId1() throws  Exception{
        Validator<Student> studentValidator = new StudentValidator();
        Validator<Tema> temaValidator = new TemaValidator();
        Validator<Nota> notaValidator = new NotaValidator();

        StudentXMLRepository fileRepository1 = new StudentXMLRepository(studentValidator, "studentitest.xml");
        TemaXMLRepository fileRepository2 = new TemaXMLRepository(temaValidator, "teme.xml");
        NotaXMLRepository fileRepository3 = new NotaXMLRepository(notaValidator, "note.xml");

        Service service = new Service(fileRepository1, fileRepository2, fileRepository3);

        service.saveStudent("1", "Test", 936);
        Iterable<Student> students = service.findAllStudents();
        int size = 0;
        if (students instanceof Collection){
            size = ((Collection<Student>) students).size();
        }
        assertEquals(size, 1);
    }

    @Test
    public void testaddId1Again() throws  Exception{
        Validator<Student> studentValidator = new StudentValidator();
        Validator<Tema> temaValidator = new TemaValidator();
        Validator<Nota> notaValidator = new NotaValidator();

        StudentXMLRepository fileRepository1 = new StudentXMLRepository(studentValidator, "studentitest.xml");
        TemaXMLRepository fileRepository2 = new TemaXMLRepository(temaValidator, "teme.xml");
        NotaXMLRepository fileRepository3 = new NotaXMLRepository(notaValidator, "note.xml");

        Service service = new Service(fileRepository1, fileRepository2, fileRepository3);

        service.saveStudent("1", "Test", 936);
        Iterable<Student> students = service.findAllStudents();
        int size = 0;
        if (students instanceof Collection){
            size = ((Collection<Student>) students).size();
        }
        service.deleteStudent("1");
        assertEquals(size, 1);
    }
}
