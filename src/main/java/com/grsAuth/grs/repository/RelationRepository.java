package com.grsAuth.grs.repository;
import com.grsAuth.grs.entity.Field;
import com.grsAuth.grs.entity.Relation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface RelationRepository extends JpaRepository<Relation, Long> {
    String query = "";
//  @Query(value = "select rmwb.msg_log.message from rmwb.msg_log where id = (select rmwb.msg_relation.msg1 from rmwb.msg_relation where id = 15) or id = (select rmwb.msg_relation.msg2 from rmwb.msg_relation where id = 15)",nativeQuery = true)
    @Query(value = "select * from rmwb.msg_relation where id = 26",nativeQuery = true)
    List<Relation> customQuery();

    @Query(value = "SELECT * FROM rmwb.msg_relation WHERE id = :id", nativeQuery = true)
    List<Relation> customQueryById(@Param("id") Long id);

    //Here I am searching only msg2 inside relation table
    @Query(value = "SELECT * FROM rmwb.msg_relation WHERE MSG1 = :id or MSG2 = :id", nativeQuery = true)
    List<Relation> customQueryByMessage(@Param("id") Long id);
}
