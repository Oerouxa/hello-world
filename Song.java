//Georgia Bjarstal
public class Song {
	public static void main(String[] args) {
		thereWas("fly");
		thereWas("spider");
		thereWas("bird");
		thereWas("cat");
		thereWas("dog");
		thereWas("werewolf");
		thereWas("horse");
	}

	// ************************* First line ************************************

	public static void thereWas(String animal) {
		System.out.println("There was an old woman who swallowed a " + animal + ",");
		if (animal == "fly") {
			fly();
		}
		if (animal == "spider") {
			System.out.println("That wriggled and iggled and jiggled inside her.");
			spider();
		}
		if (animal == "bird") {
			System.out.println("How absurd to swallow a bird.");
			bird();
		}
		if (animal == "cat") {
			System.out.println("Imagine that to swallow a cat.");
			cat();
		}
		if (animal == "dog") {
			System.out.println("What a hog to swallow a dog.");
			dog();
		}
		if (animal == "werewolf") {
			System.out.println("What an appetite to swallow a werewolf.");
			werewolf();
		}
		if (animal == "horse") {
			System.out.println("She died of course");
		}
	}

	// ************************* Other ************************************

	public static void die() {
		System.out.println("Perhaps she'll die.");
	}

	public static void sheSwallowed(String a, String b) {
		System.out.println("She swallowed the " + a + " to catch the " + b + ",");

	}

	// ************************* Verses ************************************

	public static void fly() {
		System.out.println("I don't know why she swallowed that fly,");
		die();
		System.out.println();
	}

	public static void spider() {
		sheSwallowed("spider", "fly");
		fly();
	}

	public static void bird() {
		sheSwallowed("bird", "spider");
		spider();
	}

	public static void cat() {
		sheSwallowed("cat", "bird");
		bird();
	}

	public static void dog() {
		sheSwallowed("dog", "cat");
		cat();
	}

	public static void werewolf() {
		sheSwallowed("werewolf", "dog");
		dog();
	}

	// ************************* End ************************************

}
