package testNGAnnottions_Flags;

import org.testng.annotations.Test;

public class Flag4 {
	@Test(priority = 0)
	public void z() {
		System.out.println("z");
	}
	@Test (priority = 3)
	public void a() {
		System.out.println("a");
	}

	@Test (priority = 2)
	public void b() {
		System.out.println("b");
	}


	@Test (priority = -1)
	public void c() {
		System.out.println("c");
	}

	@Test (priority = 5)
	public void f() {
		System.out.println("f");
	}

	@Test (priority = 7)
	public void h() {
		System.out.println("h");
	}

	@Test (priority = 3)
	public void d() {
		System.out.println("d");
	}

	@Test (priority = 4)
	public void e() {

		System.out.println("e");
	}

	@Test (priority = 6)
	public void g() {
		System.out.println("g");
	}
}
