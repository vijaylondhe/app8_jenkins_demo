pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace("lib/pipelineJob.groovy"))
            sandbox()
        }
    }
}
