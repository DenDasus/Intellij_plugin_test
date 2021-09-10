package com.github.dendasus.intellijplugintest.services

import com.intellij.openapi.project.Project
import com.github.dendasus.intellijplugintest.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
