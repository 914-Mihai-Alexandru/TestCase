import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ssvv.example.console.*;
import ssvv.example.domain.*;
import ssvv.example.repository.*;
import ssvv.example.service.*;
import ssvv.example.validation.NotaValidator;
import ssvv.example.validation.StudentValidator;
import ssvv.example.validation.TemaValidator;


public class TestCase {
    public static Service service;

    @BeforeAll
    public static void setup() {
        StudentValidator studentValidator = new StudentValidator();
        TemaValidator temaValidator = new TemaValidator();
        String filenameStudent = "fisiere/Studenti.xml";
        String filenameTema = "fisiere/Teme.xml";
        String filenameNota = "fisiere/Note.xml";

    }

    @Test
    public static void testAddStudent() {
        StudentValidator studentValidator = new StudentValidator();
        String filenameStudent = "fisiere/Studenti.xml";
        StudentXMLRepository fileRepository1 = new StudentXMLRepository(studentValidator, filenameStudent);
        service = new Service(fileRepository1, null, null);
        assert (service.saveStudent("7", "Andrei", 936) == 1);
    }
}
