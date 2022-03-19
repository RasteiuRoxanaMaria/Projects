package rasteiu.roxana.lab8.ex4;

public class NoEvent extends Event {
    NoEvent() {
        super(EventType.NONE);
    }

    @Override
    public String toString() {
        return "NoEvent{}";
    }
}
