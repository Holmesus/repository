package paxos.basic.pojo;

import java.io.Serializable;

public class TransferData implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5554041774351789166L;
	
	/**传输类型，0=prepare，1=prepareResponse，2=accept，3=acceptResponse*/
	private int type;
	
	/**proposal的id*/
	private int proposalNumber;
	
	/**proposal的value*/
	private int value;
	
	/**acceptor保存的最小的proposal id*/
	private int minProposal;
	
	private int acceptedProposal;
	
	private int acceptedValue;

	private boolean success;
	
	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getProposalNumber() {
		return proposalNumber;
	}

	public void setProposalNumber(int proposalNumber) {
		this.proposalNumber = proposalNumber;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getMinProposal() {
		return minProposal;
	}

	public void setMinProposal(int minProposal) {
		this.minProposal = minProposal;
	}

	public int getAcceptedProposal() {
		return acceptedProposal;
	}

	public void setAcceptedProposal(int acceptedProposal) {
		this.acceptedProposal = acceptedProposal;
	}

	public int getAcceptedValue() {
		return acceptedValue;
	}

	public void setAcceptedValue(int acceptedValue) {
		this.acceptedValue = acceptedValue;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}


}
