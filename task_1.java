import org.junit.Test;
import static org.junit.Assert.*;

public class Program {
    
@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    
    boolean isAdult = program.checkIsAdult(19);
	// Напиши код здесь
    assertEquals(Ожидается, что для возраста больше 18 лет метод вернет true, true, isAdult);
}
}
