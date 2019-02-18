
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class TestClasses {

	@Test
	void test1() {
		sc w = new sc();
		assertTrue(0==w.getCount());
	}
	@Test
	void test2() {
		sc w = new sc();
		books B  = new books();
		B.setBookName("java");
		B.setBookprice(170);
		w.addbook(B);
		assertTrue(1==w.getCount());
		assertTrue(170==w.getAmount());
	}
	@Test
	void test3() {
		sc w = new sc();
		books B  = new books();
		books e  = new books();
		B.setBookName("java");
		B.setBookprice(170);
		w.addbook(B);
		assertTrue(1==w.getCount());
		assertTrue(170==w.getAmount());
		e.setBookName("web");
		e.setBookprice(100);
		w.addbook(e);
		assertTrue(2==w.getCount());
		assertTrue(270==w.getAmount());
	}
	@Test
	void test4() {
		sc w = new sc();
		books B  = new books();
		books e  = new books();
		B.setBookName("java");
		B.setBookprice(170);
		w.addbook(B);
		assertTrue(1==w.getCount());
		assertTrue(170==w.getAmount());
		e.setBookName("web");
		e.setBookprice(100);
		w.addbook(e);
		assertTrue(2==w.getCount());
		assertTrue(270==w.getAmount());
		w.deleteBook(0);
		assertTrue(1==w.getCount());
		assertTrue(100==w.getAmount());
	}
}
