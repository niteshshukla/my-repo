import java.util.*;
public class MastercardBlockInfo {

    private String type;
    private List<String> channels;
    private List<String> mccs;
    private String blackWhite;
    private Boolean ignoreRecurring;
    //private List<FilterObject> filters;
    private String crossBorder;
    private String filterId;
    private String transactionAmount;

    public MastercardBlockInfo() {
    }

    public MastercardBlockInfo(final String type, final List<String> channels,
                               final List<String> mccs, final String blackWhite, final boolean ignoreRecurring
            ,final String transactionAmount,final String filterId
    ) {
        this.type = type;
        if (channels != null) {
            this.channels = new ArrayList<>(channels);
        }
        if (mccs != null) {
            this.mccs = new ArrayList<>(mccs);
        }
        this.blackWhite = blackWhite;
        this.ignoreRecurring = ignoreRecurring;
        this.transactionAmount=transactionAmount;
        this.filterId=filterId;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public List<String> getChannels() {
        if (channels != null) {
            return new ArrayList<>(channels);
        } else {
            return null;
        }
    }

    public void setChannels(final List<String> channels) {
        if (channels != null) {
            this.channels = new ArrayList<>(channels);
        } else {
            this.channels = null;
        }
    }

    public List<String> getMccs() {
        if (mccs != null) {
            return new ArrayList<>(mccs);
        } else {
            return null;
        }
    }

    public void setMccs(final List<String> mccs) {
        if (mccs != null) {
            this.mccs = new ArrayList<>(mccs);
        } else {
            this.mccs = null;
        }
    }

    public String getBlackWhite() {
        return blackWhite;
    }

    public void setBlackWhite(final String blackWhite) {
        this.blackWhite = blackWhite;
    }

    public Boolean getIgnoreRecurring() {
        return ignoreRecurring;
    }

    public void setIgnoreRecurring(Boolean ignoreRecurring) {
        this.ignoreRecurring = ignoreRecurring;
    }

    /*public List<FilterObject> getFilters() {
    	if (filters != null) {
            return new ArrayList<>(filters);
        } else {
            return null;
        }
	}

	public void setFilters(List<FilterObject> filters) {
		 if (filters != null) {
	            this.filters = new ArrayList<>(filters);
	        } else {
	            this.filters = null;
	        }
	}*/

    public String getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(String transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public String getFilterId() {
        return filterId;
    }

    public void setFilterId(String filterId) {
        this.filterId = filterId;
    }

    public String getCrossBorder() {
        return crossBorder;
    }

    public void setCrossBorder(String crossBorder) {
        this.crossBorder = crossBorder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        MastercardBlockInfo that = (MastercardBlockInfo) o;
        return ignoreRecurring == that.ignoreRecurring && Objects.equals(type, that.type)
                && Objects.equals(channels, that.channels) && Objects.equals(mccs, that.mccs)
                && Objects.equals(blackWhite, that.blackWhite)
                && Objects.equals(crossBorder, that.crossBorder)
                && Objects.equals(transactionAmount, that.transactionAmount)
                && Objects.equals(filterId, that.filterId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, channels, mccs, blackWhite, ignoreRecurring
                ,transactionAmount,filterId,crossBorder
        );
    }

    @Override
    public String toString() {
        return "MastercardBlockInfo { type=" + type + ", channels=" + channels + ", mccs=" + mccs + ", blackWhite="
                + blackWhite + ", ignoreRecurring=" + ignoreRecurring + ", crossBorder=" + crossBorder + ", filterId="
                + filterId + ", transactionAmount=" + transactionAmount + "}";
    }

}
