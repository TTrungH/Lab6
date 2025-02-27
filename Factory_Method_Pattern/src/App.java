public class App {
    public static void main(String[] args) throws Exception {
        RequestCreator lowPriorityFactory = new LowPriorityRequestCreator();
        Request lowRequest = lowPriorityFactory.createRequest();
        lowRequest.setPriority();
        lowRequest.setStatus();
        lowRequest.setExpire();
        lowRequest.processRequest();

        RequestCreator mediumPriorityFactory = new MediumPriorityRequestCreator();
        Request mediumRequest = mediumPriorityFactory.createRequest();
        mediumRequest.setPriority();
        mediumRequest.setStatus();
        mediumRequest.setExpire();
        mediumRequest.processRequest();

        RequestCreator highPriorityFactory = new HighPriorityRequestCreator();
        Request highRequest = highPriorityFactory.createRequest();
        highRequest.setPriority();
        highRequest.setStatus();
        highRequest.setExpire();
        highRequest.processRequest();
    }
}
