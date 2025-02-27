import java.time.LocalDate;

class LowPriorityRequest extends Request {
    @Override
    void setPriority() {
        priority = "Ignore";
    }

    @Override
    void setStatus() {
        status = "Done";
    }

    @Override
    void setExpire() {
        expireDate = LocalDate.now().toString();
    }

    @Override
    void processRequest() {
        System.out.println("Request denied");
    }
}

class MediumPriorityRequest extends Request {
    @Override
    void setPriority() {
        priority = "Medium";
    }

    @Override
    void setStatus() {
        status = "Accepted";
    }

    @Override
    void setExpire() {
        expireDate = LocalDate.now().plusMonths(1).toString();
    }

    @Override
    void processRequest() {
        System.out.println("Request accepted, estimated completion date is " + expireDate);
    }
}

class HighPriorityRequest extends Request {
    @Override
    void setPriority() {
        priority = "Emergency";
    }

    @Override
    void setStatus() {
        status = "Accepted";
    }

    @Override
    void setExpire() {
        expireDate = LocalDate.now().toString();
    }

    @Override
    void processRequest() {
        System.out.println("Emergency request, our Administrator will contact you immediately!");
    }
}
