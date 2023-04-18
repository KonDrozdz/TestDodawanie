package dodawanie.dodawanie;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DodawanieApplicationTests {

	@Test
	public void added() {
		DodawanieApplication dodawanieApplication= new DodawanieApplication();
		assertEquals(10,dodawanieApplication.added(5,5));
	}

}
