package pl.entito.designpattern.aroundmethod;

public class Main {
	public static void main(String[] args) {

		Resource.use(resource -> {
			resource.actionA();
			resource.actionB();
		});
	}
}
