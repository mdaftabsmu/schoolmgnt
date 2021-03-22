package com.easyapper.schoolmgnt.repository;

import com.easyapper.schoolmgnt.model.*;
import org.springframework.data.repository.*;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository  extends CrudRepository<Customers, Long> {

}
