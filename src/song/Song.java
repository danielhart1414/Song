//@author Daniel Hart
//This program will display a cumulative song as output.
//Learning challenge: Keep code DRY

package song;

public class Song {
	public static void main(String[] args) {
		verse1();
		verse2();
		verse3();
		verse4();
		verse5();
		verse6();
		verse7();
	}
	
	public static void verse1() {
		System.out.println("There was an old woman who swallowed a fly.");
		flydie();
	}
	
	public static void verse2() {
		System.out.println("There was an old woman who swallowed a spider,");
		System.out.println("That wriggled and iggled and jiggled inside her.");
		spiderdie();
	}
	
	public static void verse3() {
		System.out.println("There was an old woman who swallowed a bird,");
		System.out.println("How absurd to swallow a bird.");
		birddie();
	}
	
	public static void verse4() {
		System.out.println("There was an old woman who swallowed a cat,");
		System.out.println("Imagine that to swallow a cat.");
		catdie();
	}
	
	public static void verse5() {
		System.out.println("There was an old woman who swallowed a dog,");
		System.out.println("What a hog to swallow a dog.");
		dogdie();
	}
	
	public static void verse6() {
		System.out.println("There was an old woman who swallowed a bear,");
		System.out.println("Who would dare to swallow a bear.");
		System.out.println("She swallowed the bear to catch the dog,");
		dogdie();
	}
	
	public static void verse7() {
		System.out.println("There was an old woman who swallowed a horse,");
		System.out.println("She died of course.");
	}
	
	public static void flydie() {
		System.out.println("I don't know why she swallowed that fly,");
		System.out.println("Perhaps she'll die.");
		System.out.println();
	}
	
	public static void spiderdie() {
		System.out.println("She swallowed the spider to catch the fly,");
		flydie();
	}
	
	public static void birddie() {
		System.out.println("She swallowed the bird to catch the spider,");
		spiderdie();
	}
	
	public static void catdie() {
		System.out.println("She swallowed the cat to catch the bird,");
		birddie();
	}
	
	public static void dogdie() {
		System.out.println("She swallowed the dog to catch the cat,");
		catdie();
	}
}
