
public class OldLady {

	public static void main(String[] args) {
		System.out.println("There was an old lady who swallowed a fly.");
		LastTwo();
		Spider();
		Bird();
		SwallowCat();
		Horse();
	}
		
	public static void LastTwo() {
		System.out.println("I don't know why she swallowed a fly,");
		System.out.println("Perhaps she'll die.");
		System.out.println();
	}

	public static void Spider() {
		System.out.println("There was an old lady who swallowed a spider,");
		System.out.println("That wriggled and iggled and jiggled inside her.");
		System.out.println("She swallowed the spider to catch the fly,");
		LastTwo();
	}
	
	public static void Bird() {
		System.out.println("There was an old lady who swallowed a bird,");
		System.out.println("How absurd to swallow a bird.");
		BirdSpider();
	}
	
	public static void BirdSpider() {
		System.out.println("She swallowed the bird to catch the spider,");
		System.out.println("She swallowed the spider to catch the fly,");
		LastTwo();
	}
	
	public static void SwallowCat() {
		System.out.println("There was an old lady who swallowed a cat,");
		System.out.println("Imagine that to swallow a cat.");
		CatBird();
	}
	
	public static void CatBird() {
		System.out.println("She swallowed the cat to catch the bird,");
		BirdSpider();
	}
	
	public static void Horse() {
		System.out.println("There was an old lady that swallowed a horse,");
		System.out.println("She died of course.");
	}
}
