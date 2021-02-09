package ee.taltech.theme2.part6;

import java.util.List;

public class CalculationResult {
    private boolean success1; //TRUE||FALSE
    private Boolean success2; //TRUE||FALSE||NULL
    private CalculationStatus status; //few more values
    private List<Integer> input;
    private List<Integer> output;
    private Long duration;

    public CalculationResult(CalculationStatus status, List<Integer> input, List<Integer> output, Long duration) {
        this.status = status;
        this.input = input;
        this.output = output;
        this.duration = duration;
    }

    public CalculationStatus getStatus() {
        return status;
    }

    public List<Integer> getInput() {
        return input;
    }

    public List<Integer> getOutput() {
        return output;
    }

    public Long getDuration() {
        return duration;
    }
}
