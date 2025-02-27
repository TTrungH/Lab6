import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        RequestCreator lowPriorityFactory = new LowPriorityRequestCreator();
        RequestCreator mediumPriorityFactory = new MediumPriorityRequestCreator();
        RequestCreator highPriorityFactory = new HighPriorityRequestCreator();
        String s = sc.next();
        if (s.equals("low")) {
            Request lowRequest = lowPriorityFactory.createRequest();
            lowRequest.setPriority();
            lowRequest.setStatus();
            lowRequest.setExpire();
            lowRequest.processRequest();
        } else if (s.equals("mid")) {
            Request mediumRequest = mediumPriorityFactory.createRequest();
            mediumRequest.setPriority();
            mediumRequest.setStatus();
            mediumRequest.setExpire();
            mediumRequest.processRequest();
        } else {
            Request highRequest = highPriorityFactory.createRequest();
            highRequest.setPriority();
            highRequest.setStatus();
            highRequest.setExpire();
            highRequest.processRequest();
        }
    }

}
