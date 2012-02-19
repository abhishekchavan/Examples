package com.bezudar.jooq.test;

import java.sql.Connection;

import org.jooq.util.maven.example.tables.Customer;
import org.jooq.util.mysql.MySQLFactory;

public class Test {

	public static void main(String[] args) {
		Connection conn = null;
		MySQLFactory factory = new MySQLFactory(conn);

	}
}
