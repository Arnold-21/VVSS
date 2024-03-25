package ssvv;

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
import validation.*;

import java.util.Collection;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
    @Test
    public void test_tc1() throws  Exception{
        Validator<Student> studentValidator = new StudentValidator();
        Validator<Tema> temaValidator = new TemaValidator();
        Validator<Nota> notaValidator = new NotaValidator();
        StudentXMLRepository fileRepository1 = new StudentXMLRepository(studentValidator, "studentitest.xml");
        TemaXMLRepository fileRepository2 = new TemaXMLRepository(temaValidator, "teme.xml");
        NotaXMLRepository fileRepository3 = new NotaXMLRepository(notaValidator, "note.xml");
        Service service = new Service(fileRepository1, fileRepository2, fileRepository3);

        service.saveStudent("1", "William", 912);
        Iterable<Student> students = service.findAllStudents();
        int size = 0;
        if (students instanceof Collection){
            size = ((Collection<Student>) students).size();
        }
        assertEquals(size, 1);
        service.deleteStudent("1");
    }

    @Test
    public void test_tc2() throws  Exception{
        Validator<Student> studentValidator = new StudentValidator();
        Validator<Tema> temaValidator = new TemaValidator();
        Validator<Nota> notaValidator = new NotaValidator();
        StudentXMLRepository fileRepository1 = new StudentXMLRepository(studentValidator, "studentitest.xml");
        TemaXMLRepository fileRepository2 = new TemaXMLRepository(temaValidator, "teme.xml");
        NotaXMLRepository fileRepository3 = new NotaXMLRepository(notaValidator, "note.xml");
        Service service = new Service(fileRepository1, fileRepository2, fileRepository3);

        int result = service.saveStudent("", "William", 912);
        assertEquals(result, 1);
    }

    @Test
    public void test_tc3() throws  Exception{
        Validator<Student> studentValidator = new StudentValidator();
        Validator<Tema> temaValidator = new TemaValidator();
        Validator<Nota> notaValidator = new NotaValidator();
        StudentXMLRepository fileRepository1 = new StudentXMLRepository(studentValidator, "studentitest.xml");
        TemaXMLRepository fileRepository2 = new TemaXMLRepository(temaValidator, "teme.xml");
        NotaXMLRepository fileRepository3 = new NotaXMLRepository(notaValidator, "note.xml");
        Service service = new Service(fileRepository1, fileRepository2, fileRepository3);

        service.saveStudent("1", "William", 912);
        int result = service.saveStudent("1", "William", 912);
        service.deleteStudent("1");

        assertEquals(result, 1);
    }

    @Test
    public void test_tc4() throws  Exception{
        Validator<Student> studentValidator = new StudentValidator();
        Validator<Tema> temaValidator = new TemaValidator();
        Validator<Nota> notaValidator = new NotaValidator();
        StudentXMLRepository fileRepository1 = new StudentXMLRepository(studentValidator, "studentitest.xml");
        TemaXMLRepository fileRepository2 = new TemaXMLRepository(temaValidator, "teme.xml");
        NotaXMLRepository fileRepository3 = new NotaXMLRepository(notaValidator, "note.xml");
        Service service = new Service(fileRepository1, fileRepository2, fileRepository3);

        int result = service.saveStudent("2", "", 912);
        assertEquals(result, 1);
    }

    @Test
    public void test_tc5() throws  Exception{
        Validator<Student> studentValidator = new StudentValidator();
        Validator<Tema> temaValidator = new TemaValidator();
        Validator<Nota> notaValidator = new NotaValidator();
        StudentXMLRepository fileRepository1 = new StudentXMLRepository(studentValidator, "studentitest.xml");
        TemaXMLRepository fileRepository2 = new TemaXMLRepository(temaValidator, "teme.xml");
        NotaXMLRepository fileRepository3 = new NotaXMLRepository(notaValidator, "note.xml");
        Service service = new Service(fileRepository1, fileRepository2, fileRepository3);

        int result = service.saveStudent("2", "William", 110);
        assertEquals(result, 1);
    }

    @Test
    public void test_tc6() throws  Exception{
        Validator<Student> studentValidator = new StudentValidator();
        Validator<Tema> temaValidator = new TemaValidator();
        Validator<Nota> notaValidator = new NotaValidator();
        StudentXMLRepository fileRepository1 = new StudentXMLRepository(studentValidator, "studentitest.xml");
        TemaXMLRepository fileRepository2 = new TemaXMLRepository(temaValidator, "teme.xml");
        NotaXMLRepository fileRepository3 = new NotaXMLRepository(notaValidator, "note.xml");
        Service service = new Service(fileRepository1, fileRepository2, fileRepository3);

        service.saveStudent("2", "William", 111);

        Iterable<Student> students = service.findAllStudents();
        int size = 0;
        if (students instanceof Collection){
            size = ((Collection<Student>) students).size();
        }
        assertEquals(size, 1);
        service.deleteStudent("2");
    }

    @Test
    public void test_tc7() throws  Exception{
        Validator<Student> studentValidator = new StudentValidator();
        Validator<Tema> temaValidator = new TemaValidator();
        Validator<Nota> notaValidator = new NotaValidator();
        StudentXMLRepository fileRepository1 = new StudentXMLRepository(studentValidator, "studentitest.xml");
        TemaXMLRepository fileRepository2 = new TemaXMLRepository(temaValidator, "teme.xml");
        NotaXMLRepository fileRepository3 = new NotaXMLRepository(notaValidator, "note.xml");
        Service service = new Service(fileRepository1, fileRepository2, fileRepository3);

        service.saveStudent("3", "William", 936);

        Iterable<Student> students = service.findAllStudents();
        int size = 0;
        if (students instanceof Collection){
            size = ((Collection<Student>) students).size();
        }
        assertEquals(size, 1);
        service.deleteStudent("3");
    }

    @Test
    public void test_tc8() throws  Exception{
        Validator<Student> studentValidator = new StudentValidator();
        Validator<Tema> temaValidator = new TemaValidator();
        Validator<Nota> notaValidator = new NotaValidator();
        StudentXMLRepository fileRepository1 = new StudentXMLRepository(studentValidator, "studentitest.xml");
        TemaXMLRepository fileRepository2 = new TemaXMLRepository(temaValidator, "teme.xml");
        NotaXMLRepository fileRepository3 = new NotaXMLRepository(notaValidator, "note.xml");
        Service service = new Service(fileRepository1, fileRepository2, fileRepository3);

        service.saveStudent("4", "William", 937);

        Iterable<Student> students = service.findAllStudents();
        int size = 0;
        if (students instanceof Collection){
            size = ((Collection<Student>) students).size();
        }
        assertEquals(size, 1);
        service.deleteStudent("4");
    }

    @Test
    public void test_tc9() throws  Exception{
        Validator<Student> studentValidator = new StudentValidator();
        Validator<Tema> temaValidator = new TemaValidator();
        Validator<Nota> notaValidator = new NotaValidator();
        StudentXMLRepository fileRepository1 = new StudentXMLRepository(studentValidator, "studentitest.xml");
        TemaXMLRepository fileRepository2 = new TemaXMLRepository(temaValidator, "teme.xml");
        NotaXMLRepository fileRepository3 = new NotaXMLRepository(notaValidator, "note.xml");
        Service service = new Service(fileRepository1, fileRepository2, fileRepository3);

        int result = service.saveStudent("5", "William", 938);
        assertEquals(result, 1);
    }

    @Test
    public void test_cc1() throws  Exception{
        Validator<Student> studentValidator = new StudentValidator();
        Validator<Tema> temaValidator = new TemaValidator();
        Validator<Nota> notaValidator = new NotaValidator();
        StudentXMLRepository fileRepository1 = new StudentXMLRepository(studentValidator, "studentitest.xml");
        TemaXMLRepository fileRepository2 = new TemaXMLRepository(temaValidator, "temeic.xml");
        NotaXMLRepository fileRepository3 = new NotaXMLRepository(notaValidator, "note.xml");
        Service service = new Service(fileRepository1, fileRepository2, fileRepository3);

        int result = service.saveTema("", "Testing", 6, 5);
        assertEquals(result, 1);
    }
    @Test
    public void test_cc2() throws  Exception{
        Validator<Student> studentValidator = new StudentValidator();
        Validator<Tema> temaValidator = new TemaValidator();
        Validator<Nota> notaValidator = new NotaValidator();
        StudentXMLRepository fileRepository1 = new StudentXMLRepository(studentValidator, "studentitest.xml");
        TemaXMLRepository fileRepository2 = new TemaXMLRepository(temaValidator, "temeic.xml");
        NotaXMLRepository fileRepository3 = new NotaXMLRepository(notaValidator, "note.xml");
        Service service = new Service(fileRepository1, fileRepository2, fileRepository3);

        int result = service.saveTema("1", "Testing", 6, 5);
        service.deleteTema("1");
        assertEquals(result, 1);
    }
}
