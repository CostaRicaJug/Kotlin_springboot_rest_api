package org.costaricajug.kotlin_springboot_rest_api.services

import org.costaricajug.kotlin_springboot_rest_api.domain.Department
import org.costaricajug.kotlin_springboot_rest_api.repositories.DepartmentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * Created by credondo on 6/8/16.
 */
@Service
class DepartmentService  @Autowired constructor(val repository:DepartmentRepository) {

    fun findAll() = repository.findAll()

    fun create(department : Department) = repository.save(department)
}