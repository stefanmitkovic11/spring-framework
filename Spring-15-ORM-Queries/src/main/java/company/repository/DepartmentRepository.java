package company.repository;

import company.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department, String> {

    // Display all departments in the toys department

    List<Department> findDepartmentByDepartment(String department);

    // Display all departments in the health division

    List<Department> findDepartmentByDivisionIs(String division);

    List<Department> findDepartmentByDivisionEquals(String division);

    // Display all distinct departments

    List<Department> findDistinctByDivision(String division);

    // Display top 3 departments with division name includes 'Hea' without duplicates

    List<Department> findDistinctTop3ByDivisionContaining(String division);

    @Query("SELECT d FROM Department d WHERE d.division in ?1")
    List<Department> getDepartmentDivision(List<String> division);


    List<Department> retrieveDepartmentByDivision(String division);

    @Query(nativeQuery = true)
    List<Department> retrieveDepartmentByDivisionContain(String pattern);

}
