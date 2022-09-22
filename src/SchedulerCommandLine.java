import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import picocli.CommandLine.Option;

@Command(
        separator = " ",
        name = "java -jar scheduler.jar",
        version = "Scheduler Solver 1.0",
        mixinStandardHelpOptions = true,
        abbreviateSynopsis = true,
        parameterListHeading = "%nParameters: %n",
        optionListHeading = "%nOptions: %n"
)
public class SchedulerCommandLine implements Runnable{
    @Parameters(index = "0", description = "The file which contains the di-graph for the scheduling problem")
    private String inputFile;

    @Parameters(index = "1", description = "The number of processors used in the scheduling problem.")
    private int schedulerProcessors;

    @Option(names = {"-p"}, description = "The number of processors used for this computation. If not specified, the computation will be sequential")
    private int computingProcessors = 1;    //default is sequential

    @Option(names = {"-v"}, description = "If specified, the computation will be visualized")
    private boolean visualizeSearch = false;

    @Option(names = {"-o"}, description = "The output file name containing the final optimal solution, default output file is INPUT-output.dot")
    private String outputFile;

    @Override
    public void run() {
        System.out.println("Input file: "+inputFile);
        System.out.println("Number of processors used for scheduling: "+schedulerProcessors);
        System.out.println("Number of processors used for computing: "+computingProcessors);
        if(visualizeSearch) System.out.println("This computation will visualize search");
        System.out.println("Output file: " + (outputFile!=null? outputFile: inputFile.replace(".dot", "-output.dot")));
    }
}
