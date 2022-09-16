import picocli.CommandLine;

public class Scheduler {
    public static void main(String[] args) {
        new CommandLine(new SchedulerCommandLine()).execute(args);
    }
}