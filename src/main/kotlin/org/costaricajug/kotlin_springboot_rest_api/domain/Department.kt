package org.costaricajug.kotlin_springboot_rest_api.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

/**
 * Created by credondo on 6/8/16.
 */
@Entity
class Department(
        var name: String = "",
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Long = 0
)