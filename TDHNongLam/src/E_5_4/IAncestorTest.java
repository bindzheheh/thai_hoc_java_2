package E_5_4;
/**
 * This is a test program about the ancestor family tree
 *@author NguyenVanThai
 *ID:2611130213
 */
import junit.framework.TestCase;

public class IAncestorTest extends TestCase {
	/**
	 * testing for constructor
	 */
	public void testConstructor() {
		/**
		 * test class MTPerson: unknown ancestor (???)
		 */
		IAncestor mt = new MTPerson();
		/**
		 * test class ConsPerson: the tree of the exercise (Peter 1980 and his ancestors)
		 */
		IAncestor bob = new ConsPerson("Bob", 1917, new MTPerson(), new MTPerson());
		IAncestor angela = new ConsPerson("Angela", 1936, new MTPerson(), new MTPerson());
		IAncestor robert = new ConsPerson("Robert", 1935, new MTPerson(), new MTPerson());
		IAncestor annie = new ConsPerson("Annie", 1938, bob, new MTPerson());      // cha là Bob, mẹ chưa biết
		IAncestor paul = new ConsPerson("Paul", 1956, new MTPerson(), annie);      // cha chưa biết, mẹ là Annie
		IAncestor janet = new ConsPerson("Janet", 1958, robert, angela);
		IAncestor peter = new ConsPerson("Peter", 1980, paul, janet);
		/**
		 * test my family tree: bin(thái) 2008, father 1978, mother 1978
		 */
		new ConsPerson("bin", 2008, new ConsPerson("father", 1978, new MTPerson(), new MTPerson()),
				new ConsPerson("mother", 1978, new MTPerson(), new MTPerson()));
	}
	/**
	 * testing for equals method
	 */
	public void testEquals() {
		IAncestor bob = new ConsPerson("Bob", 1917, new MTPerson(), new MTPerson());
		IAncestor angela = new ConsPerson("Angela", 1936, new MTPerson(), new MTPerson());
		IAncestor robert = new ConsPerson("Robert", 1935, new MTPerson(), new MTPerson());
		IAncestor annie = new ConsPerson("Annie", 1938, bob, new MTPerson());
		IAncestor paul = new ConsPerson("Paul", 1956, new MTPerson(), annie);
		IAncestor janet = new ConsPerson("Janet", 1958, robert, angela);
		IAncestor peter = new ConsPerson("Peter", 1980, paul, janet);
		
		IAncestor peter2 = new ConsPerson("Peter", 1980,
				new ConsPerson("Paul", 1956, new MTPerson(),
						new ConsPerson("Annie", 1938,
								new ConsPerson("Bob", 1917, new MTPerson(), new MTPerson()), new MTPerson())),
				new ConsPerson("Janet", 1958,
						new ConsPerson("Robert", 1935, new MTPerson(), new MTPerson()),
						new ConsPerson("Angela", 1936, new MTPerson(), new MTPerson())));
		assertEquals(new MTPerson(), new MTPerson());          
		assertEquals(bob, new ConsPerson("Bob", 1917, new MTPerson(), new MTPerson()));
		assertEquals(peter, peter2);                          
		assertEquals(peter, peter);
		assertFalse(new MTPerson().equals(bob));              
		assertFalse(bob.equals(new MTPerson()));
		assertFalse(bob.equals(angela));                       // khác tên và năm sinh
		assertFalse(bob.equals(new ConsPerson("Bob", 1918, new MTPerson(), new MTPerson())));   // khác năm sinh
		assertFalse(annie.equals(new ConsPerson("Annie", 1938, new MTPerson(), bob)));           // đổi chỗ cha và mẹ
		assertFalse(peter.equals(new ConsPerson("Peter", 1980, janet, paul)));                   
		assertFalse(peter.equals(new ConsPerson("Peter", 1980, paul,
				new ConsPerson("Janet", 1958, robert, new MTPerson()))));                         // khác ở một nhánh sâu bên trong
	}
}