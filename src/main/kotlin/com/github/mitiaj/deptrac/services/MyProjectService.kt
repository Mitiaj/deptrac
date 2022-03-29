package com.github.mitiaj.deptrac.services

import com.intellij.openapi.project.Project
import com.github.mitiaj.deptrac.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
