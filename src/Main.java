import picocli.CommandLine;

public class Main {
    public static void main(String[] args) {
        SchedulerParams command = CommandLine.populateCommand(new SchedulerParams(), args);
        command.displayParams();
    }
}