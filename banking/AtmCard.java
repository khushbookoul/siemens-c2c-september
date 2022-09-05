package banking;

public class AtmCard {
    private String atmCardNumber;
    private String atmCardExpiry;
    private int atmCardCvvNumber;


    public AtmCard(String atmCardNumber, String atmCardExpiry, int atmCardCvvNumber) {
        this.atmCardNumber = atmCardNumber;
        this.atmCardExpiry = atmCardExpiry;
        this.atmCardCvvNumber = atmCardCvvNumber;
    }


    public String getAtmCardNumber() {
        return this.atmCardNumber;
    }

    public void setAtmCardNumber(String atmCardNumber) {
        this.atmCardNumber = atmCardNumber;
    }

    public String getAtmCardExpiry() {
        return this.atmCardExpiry;
    }

    public void setAtmCardExpiry(String atmCardExpiry) {
        this.atmCardExpiry = atmCardExpiry;
    }

    public int getAtmCardCvvNumber() {
        return this.atmCardCvvNumber;
    }

    public void setAtmCardCvvNumber(int atmCardCvvNumber) {
        this.atmCardCvvNumber = atmCardCvvNumber;
    }


    @Override
    public String toString() {
        return "{" +
            " atmCardNumber='" + getAtmCardNumber() + "'" +
            ", atmCardExpiry='" + getAtmCardExpiry() + "'" +
            ", atmCardCvvNumber='" + getAtmCardCvvNumber() + "'" +
            "}";
    }

}
