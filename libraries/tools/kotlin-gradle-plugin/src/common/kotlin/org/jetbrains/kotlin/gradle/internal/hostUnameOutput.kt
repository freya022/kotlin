/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.gradle.internal

import org.gradle.api.provider.Provider
import org.gradle.api.provider.ProviderFactory
import org.gradle.internal.os.OperatingSystem

internal val ProviderFactory.unameExecResult: Provider<String>
    get() {
        val cmd = exec {
            if (OperatingSystem.current().isWindows){
                it.executable = "powershell"
                it.args = listOf("-NoProfile", "-Command", "(Get-WmiObject Win32_Processor).Architecture")
            } else {
                it.executable = "uname"
                it.args = listOf("-m")
            }
        }

        return cmd.standardOutput.asText.map { it.trim() }
    }