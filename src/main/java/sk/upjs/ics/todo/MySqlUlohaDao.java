/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.upjs.ics.todo;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author student
 */
public class MySqlUlohaDao implements UlohaDao{

    private JdbcTemplate jdbcTemplate;
    public MySqlUlohaDao() {
     
          MysqlDataSource dataSource = new MysqlDataSource();
          dataSource.setURL("jdbc:mysql://localhost/todo");
          dataSource.setUser("todo");
          dataSource.setPassword("todo");
          
         jdbcTemplate = new JdbcTemplate(dataSource);
    
    }  
    
    @Override
    public void pridat(Uloha uloha) {
        String sql = "Insert into uloha values(?,?,?)";
        jdbcTemplate.update(sql,null,uloha.getNazov(),uloha.getDate());
     //   jdbcTemplate.query(sql, null);
      }

    @Override
    public List<Uloha> dajVsetky() {
        
        BeanPropertyRowMapper<Uloha> mapper = BeanPropertyRowMapper.newInstance(Uloha.class);
        return jdbcTemplate.query("select * from uloha order by date",mapper);
        
    }

    @Override
    public void odstranit(Uloha uloha) {
        
        String sql = "DELETE FROM uloha WHERE id = ?";
        jdbcTemplate.update(sql,uloha.getId());
    }
    
    
}
