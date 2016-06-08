package org.costaricajug.kotlin_springboot_rest_api.repositories

import org.costaricajug.kotlin_springboot_rest_api.domain.Department
import org.springframework.data.repository.CrudRepository

/**
 * Created by credondo on 6/8/16.
 */
interface DepartmentRepository : CrudRepository<Department, Long> {
}