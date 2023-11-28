package lang.print.gaps.task6;

public class FloatTypeCasting {
    public void roundNumber(float numberToBeRounded) {
        float fract = numberToBeRounded - (int)numberToBeRounded;
        int rounded = (int)numberToBeRounded + (fract < 0.5 ? 0 : 1);

        System.out.println(rounded);
    }
}
