public class WuTangConcatenatorProgram {

    //Begin by creating an input field to use.
    private Integer input;

    public WuTangConcatenatorProgram(Integer input) {
        this.input = input;
    }

    public Boolean isWu() {
        return input % 3 == 0;
    }

    public Boolean isTang() {
        return input % 5 == 0;
    }

    public Boolean isWuTang() {

        return isTang() && isWu();
    }
}

