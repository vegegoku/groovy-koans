#!/usr/bin/env groovy

package i_introduction

import java.nio.file.Files
import java.nio.file.Paths

def workingDirectory = System.getenv("PWD")
Files.list(Paths.get(workingDirectory)).each {
    println it
}