import java.util.*;
public class FilterObject {
    private String filterId;
    private List<String> channels;
    private String blackWhite;
    private String transactionAmount;


    public FilterObject() {}
    public FilterObject(String filterId, List<String> channels, String blackWhite, String transactionAmount) {

        if (channels != null) {
            this.channels = new ArrayList<>(channels);
        }

        this.filterId=filterId;
        this.blackWhite = blackWhite;
        this.transactionAmount = transactionAmount;
    }

    public List<String> getChannels() {
        if (channels != null) {
            return new ArrayList<>(channels);
        } else {
            return null;
        }
    }

    public String getFilterId() {
        return filterId;
    }
    public void setFilterId(String filterId) {
        this.filterId = filterId;
    }
    public void setChannels(List<String> channels) {
        if (channels != null) {
            this.channels = new ArrayList<>(channels);
        } else {
            this.channels = null;
        }
    }
    public String getBlackWhite() {
        return blackWhite;
    }
    public void setBlackWhite(String blackWhite) {
        this.blackWhite = blackWhite;
    }
    public String getTransactionAmount() {
        return transactionAmount;
    }
    public void setTransactionAmount(String transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    @Override
    public String toString() {
        return "FilterObject{" +

                ", filterId='" + filterId + '\'' +
                ", channels=" + channels +
                ", blackWhite='" + blackWhite + '\'' +
                ", transactionAmount='" + transactionAmount + '\'' +
                '}';
    }
}
