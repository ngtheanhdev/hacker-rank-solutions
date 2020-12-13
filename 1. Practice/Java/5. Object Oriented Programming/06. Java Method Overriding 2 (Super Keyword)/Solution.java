class BiCycle {
    String defineMe() {
        return "a vehicle with pedals.";
    }
}

class MotorCycle extends BiCycle {
    MotorCycle() {
        System.out.println("Hello I am a motorcycle, I am " + super.defineMe());
        String temp = "a vehicle with pedals.";
        System.out.println("My ancestor is a cycle who is " + temp);
    }

    @Override
    String defineMe() {
        return "a cycle with an engine.";
    }
}

class Solution {
    public static void main(String[] args) {
        new MotorCycle();
    }
}
