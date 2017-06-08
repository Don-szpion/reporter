package org.mkssu.dao.repository;

import org.mkssu.dao.entity.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sun.util.resources.cldr.gv.LocaleNames_gv;

/**
 * Created by Don-Szpion on 09.06.2017.
 */
@Repository
public interface GroupRepository extends JpaRepository<Group, Long> {
}
