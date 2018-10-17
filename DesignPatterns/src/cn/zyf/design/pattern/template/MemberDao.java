package cn.zyf.design.pattern.template;

import java.sql.ResultSet;
import java.util.List;

import javax.sql.DataSource;

public class MemberDao {

	private DataSource dataSource;
	
	private JdbcTemplate JdbcTemplate = new JdbcTemplate(dataSource);
	
	public MemberDao(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public List<?> query() {
		String sql = "select * from member";
		return JdbcTemplate.executeQuery(sql, new RowMapper<Member>() {
			@Override
			public Member mapRow(ResultSet rs, int rowNum) throws Exception {
				Member member = new Member();
				member.setUsername(rs.getString("username"));
				member.setPassword(rs.getString("password"));
				member.setAge(rs.getInt("age"));
				member.setAddr(rs.getString("addr"));
				return member;
			}
		}, null);
	}
}
