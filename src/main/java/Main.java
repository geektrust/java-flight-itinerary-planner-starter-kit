public class Main {

    private static final FlightItineraryPlanner planner = new FlightItineraryPlanner();

    /*
     ***********************************************
     * This is the driver code. Don't change it!!!
     * *********************************************
     */
    public static void main(String[] args){
        for (String cmd : args) {
            handle(cmd);
        }
    }

    /*
     * Edit this to start handling the commands.
     */
    private static void handle(String cmdLine) {
        System.out.println(cmdLine);

        String[] cmd = cmdLine.trim().split(" ");
        String cmdName = cmd[0];
        
        switch (cmdName) {
            case "ADD_FLIGHT":
                planner.addFlight(cmd[1], cmd[2], Double.parseDouble(cmd[3]), Integer.parseInt(cmd[4]));
                break;
            default:
                break;
        }
    }
}
