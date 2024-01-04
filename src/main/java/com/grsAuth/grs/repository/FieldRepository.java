package com.grsAuth.grs.repository;
import com.grsAuth.grs.entity.Field;
import com.grsAuth.grs.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FieldRepository extends JpaRepository<Field, Long>{
    @Query(value = "select * from rmwb.msg_log where id = 26",nativeQuery = true)
    List<Field> demoMethod();

    @Query(value = "select * from rmwb.msg_log where id = :id",nativeQuery = true)
    List<Field> demoMethod2(@Param("id") Long id);
}
