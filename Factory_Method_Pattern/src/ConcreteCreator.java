
class LowPriorityRequestCreator extends RequestCreator {
    @Override
    Request createRequest() {
        return new LowPriorityRequest();
    }
}

class MediumPriorityRequestCreator extends RequestCreator {
    @Override
    Request createRequest() {
        return new MediumPriorityRequest();
    }
}

class HighPriorityRequestCreator extends RequestCreator {
    @Override
    Request createRequest() {
        return new HighPriorityRequest();
    }
}
