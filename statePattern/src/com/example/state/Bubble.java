package com.example.state;
/**
 *
 * Bubble
 *
 */
public class Bubble {

	BubbleState noBubbleState;
	BubbleState blownState;
	BubbleState poppingState;
	BubbleState pickupState;

	BubbleState state;

	public Bubble() {

		noBubbleState = new NoBubbleState(this);
		pickupState = new PickupState(this);
		blownState = new BlownState(this);
		poppingState = new PoppingState(this);

		// initial State to noBubbleState
		this.state = noBubbleState;

	}

	public void startBubbling() {
		state.startBubble();
	}

	public void pickupStickForBubbling() {
		state.pickBubbleStick();
	}

	public void blowBubble() {
		state.blowBubble();
	}

	public void popBubble() {
		state.popBubble();
	}

	public BubbleState getState() {
		return state;
	}

	public void setState(BubbleState state) {
		this.state = state;
	}

	public BubbleState getNoBubbleState() {
		return noBubbleState;
	}

	public void setNoBubbleState(BubbleState noBubbleState) {
		this.noBubbleState = noBubbleState;
	}

	public BubbleState getBlownState() {
		return blownState;
	}

	public void setBlownState(BubbleState blownState) {
		this.blownState = blownState;
	}

	public BubbleState getPoppingState() {
		return poppingState;
	}

	public void setPoppingState(BubbleState poppingState) {
		this.poppingState = poppingState;
	}

	public BubbleState getPickupState() {
		return pickupState;
	}

	public void setPickupState(BubbleState pickupState) {
		this.pickupState = pickupState;
	}

}
