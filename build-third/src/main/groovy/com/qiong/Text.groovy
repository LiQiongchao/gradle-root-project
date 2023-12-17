package com.qiong

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * @Author: Qiongchao
 * @Version: 1.0.0
 * @Date: 2023/12/17
 */
class Text implements Plugin<Project>{

    @Override
    void apply(Project project) {
        project.task("qiong"){
            doLast{
                println("自定义 gradle 插件")
            }
        }
    }
}
