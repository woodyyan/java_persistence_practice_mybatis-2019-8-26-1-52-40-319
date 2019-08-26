package tws.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import tws.model.Employee;

@Mapper
public interface EmployeeMapper {
	@Select("SELECT * FROM employee")
	List<Employee> findEmployees();
	
	@Insert("insert into employee values(#{employee.id}, #{employee.name}, #{employee.age})")
	void insertEmployee(@Param("employee") Employee employee);

	@Select("select * from employee where id = #{employeeId}")
	Employee findEmployeeById(int employeeId);

}
