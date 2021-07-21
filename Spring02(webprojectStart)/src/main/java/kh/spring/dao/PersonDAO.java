package kh.spring.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kh.string.dto.PersonDTO;

@Component
public class PersonDAO {

	@Autowired 
	private DataSource ds; //데이터 소스는 Autowired가 알아서 처리해줌

	public int insert(PersonDTO dto)throws Exception {
		String sql = "insert into person_spring values(person_spring_seq.nextval,?,?)";
		try(Connection con = ds.getConnection();
				PreparedStatement pstat = con.prepareStatement(sql)){
			pstat.setString(1, dto.getName());
			pstat.setString(2, dto.getContact());
			return pstat.executeUpdate();
		}

	}

	public List<PersonDTO> selectAll() throws Exception {
		String sql = "select * from person_spring";
		try(Connection con = ds.getConnection();
				PreparedStatement pstat = con.prepareStatement(sql);
				ResultSet rs = pstat.executeQuery();){

			List<PersonDTO> list = new ArrayList<>();
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String contact = rs.getString("contact");
				list.add(new PersonDTO(id,name,contact));

			}
			return list;
		}

	}
	public int modify(PersonDTO dto)throws Exception{
		String sql ="update person_spring set name=?,contact=? where id=?";
		try(Connection con = ds.getConnection();
				PreparedStatement pstat = con.prepareStatement(sql);
				){
			pstat.setString(1, dto.getName());
			pstat.setString(2, dto.getContact());
			pstat.setInt(3, dto.getId());
			return pstat.executeUpdate();

		}
	}
	public int delete(int id)throws Exception{
		String sql ="delete from person_spring where id=?";
		try(Connection con = ds.getConnection();
			PreparedStatement pstat = con.prepareStatement(sql);
				){
			pstat.setInt(1, id);
			return pstat.executeUpdate();
		}
	}

}
