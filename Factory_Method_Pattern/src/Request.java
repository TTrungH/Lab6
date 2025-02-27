public abstract class Request {
    public String priority;
    public String status;
    public String expireDate;

    abstract void setPriority();
    abstract void setStatus();
    abstract void setExpire();
    abstract void processRequest();
}
