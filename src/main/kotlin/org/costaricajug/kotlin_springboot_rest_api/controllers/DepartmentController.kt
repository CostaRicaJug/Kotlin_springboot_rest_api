package org.costaricajug.kotlin_springboot_rest_api.controllers

import org.costaricajug.kotlin_springboot_rest_api.domain.Department
import org.costaricajug.kotlin_springboot_rest_api.services.DepartmentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.concurrent.atomic.AtomicLong

/**
 * Created by credondo on 6/8/16.
 */
@RestController
@RequestMapping("/department")
class DepartmentController @Autowired constructor(val service: DepartmentService) {


    val counter = AtomicLong()

    @RequestMapping(method = arrayOf(RequestMethod.POST), produces = arrayOf("application/json"))
    fun findAll(@RequestBody department: Department): Department {
        service.create(department)
        return department
    }

    @RequestMapping(method = arrayOf(RequestMethod.GET), produces = arrayOf("application/json"))
    fun createDepartment(): List<Department> {
        return service.findAll() as List<Department>
    }
}