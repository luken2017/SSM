package com.luken.test;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDataSource {
	private static ApplicationContext context;

	public static void main(String args[]) throws SQLException {
		context = new ClassPathXmlApplicationContext("conf/spring/spring-context.xml",
				"conf/spring/spring-datasource.xml");
		DataSource ds = context.getBean("dataSource", DataSource.class);

		java.sql.Connection conn = ds.getConnection();

		String sql = "select * From user_data";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getString(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
		}
		if (ps != null) {
			ps.close();
		}
		if (conn != null) {
			conn.close();
		}
	}
}
