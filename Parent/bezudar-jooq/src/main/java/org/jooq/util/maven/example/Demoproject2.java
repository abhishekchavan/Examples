/**
 * This class is generated by jOOQ
 */
package org.jooq.util.maven.example;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.3"},
                            comments = "This class is generated by jOOQ")
public class Demoproject2 extends org.jooq.impl.SchemaImpl {

	private static final long serialVersionUID = -1972572362;

	/**
	 * The singleton instance of demoproject2
	 */
	public static final Demoproject2 DEMOPROJECT2 = new Demoproject2();

	/**
	 * No further instances allowed
	 */
	private Demoproject2() {
		super("demoproject2");
	}

	@Override
	public final java.util.List<org.jooq.Table<?>> getTables() {
		return java.util.Arrays.<org.jooq.Table<?>>asList(
			org.jooq.util.maven.example.tables.Customer.CUSTOMER,
			org.jooq.util.maven.example.tables.Employee.EMPLOYEE);
	}
}
