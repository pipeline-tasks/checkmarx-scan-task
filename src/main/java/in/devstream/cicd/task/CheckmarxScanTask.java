package in.devstream.cicd.task;

import in.devstream.cicd.task.core.PipelineTask;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;

@Slf4j
public class CheckmarxScanTask extends PipelineTask {

    private ApplicationArguments input;

    public CheckmarxScanTask(ApplicationArguments args) {
        this.input = args;
    }

    @Override
    public void execute() {

        log.info("Executing checkmarx task");
    }

    @Override
    public void onInit() {
        log.info("Initializing task...");
    }

    @Override
    public void onFinalize() {
        log.info("Cleaning up resources...");
    }
}
