package pl.entito.designpattern.aroundmethod;

import java.util.function.Consumer;

public class Resource {

	private Resource() {
		System.out.println("resource created");
	}

	public static void use(Consumer<Resource> block) {

		Resource resource = new Resource();
		try {
			block.accept(resource);
		} finally {
			resource.close();
		}
	}

	public void actionA() {
		System.out.println("performing action A on the resource");
	}

	public void actionB() {
		System.out.println("performing action B on the resource");
	}

	private void close() {
		System.out.println("resource closed");
	}

}
