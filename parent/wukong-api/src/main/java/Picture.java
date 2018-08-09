public class Picture {

    private int clue_sumbit_id;
    private int clue_id;
    private String clue_submit_card1;
    private String clue_submit_card2;
    private String clue_submit_card3;
    private String clue_submit_card4;

    @Override
    public String toString() {
        return "Picture{" +
                "clue_sumbit_id=" + clue_sumbit_id +
                ", clue_id=" + clue_id +
                ", clue_submit_card1='" + clue_submit_card1 + '\'' +
                ", clue_submit_card2='" + clue_submit_card2 + '\'' +
                ", clue_submit_card3='" + clue_submit_card3 + '\'' +
                ", clue_submit_card4='" + clue_submit_card4 + '\'' +
                '}';
    }

    public Picture() {
    }

    public Picture(int clue_sumbit_id, int clue_id, String clue_submit_card1, String clue_submit_card2, String clue_submit_card3, String clue_submit_card4) {
        this.clue_sumbit_id = clue_sumbit_id;
        this.clue_id = clue_id;
        this.clue_submit_card1 = clue_submit_card1;
        this.clue_submit_card2 = clue_submit_card2;
        this.clue_submit_card3 = clue_submit_card3;
        this.clue_submit_card4 = clue_submit_card4;
    }

    public int getClue_sumbit_id() {
        return clue_sumbit_id;
    }

    public void setClue_sumbit_id(int clue_sumbit_id) {
        this.clue_sumbit_id = clue_sumbit_id;
    }

    public int getClue_id() {
        return clue_id;
    }

    public void setClue_id(int clue_id) {
        this.clue_id = clue_id;
    }

    public String getClue_submit_card1() {
        return clue_submit_card1;
    }

    public void setClue_submit_card1(String clue_submit_card1) {
        this.clue_submit_card1 = clue_submit_card1;
    }

    public String getClue_submit_card2() {
        return clue_submit_card2;
    }

    public void setClue_submit_card2(String clue_submit_card2) {
        this.clue_submit_card2 = clue_submit_card2;
    }

    public String getClue_submit_card3() {
        return clue_submit_card3;
    }

    public void setClue_submit_card3(String clue_submit_card3) {
        this.clue_submit_card3 = clue_submit_card3;
    }

    public String getClue_submit_card4() {
        return clue_submit_card4;
    }

    public void setClue_submit_card4(String clue_submit_card4) {
        this.clue_submit_card4 = clue_submit_card4;
    }
}
