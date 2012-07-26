import net.sf.akismet.Akismet;

/**
 * 
 */

/**
 * @author Abhishek Chavan
 * 
 */
public class AkismetTest {

	public static void main(String[] args) {
		Akismet akismet = new Akismet("a58850dc12c7", "www.bezudar.com");
		System.out.println(akismet.commentCheck("121.12.12.3", null, null, null, null, null, null, null, "Himanshu is an asshole", null));
		akismet.submitSpam("121.12.12.3", null, null, null, null, null, null, null, "This this hits htis", null);
		System.out.println(akismet.commentCheck("121.12.12.3", null, null, null, null, null, null, null, "This this hits htis", null));
	}
}
