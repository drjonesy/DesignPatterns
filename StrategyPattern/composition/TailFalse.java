package StrategyPattern.composition;

public class TailFalse implements TailBehavior{
    @Override
    public boolean Tail() {
        return false;
    }
}
