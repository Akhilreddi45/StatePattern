package com.example.state;

/**
 * 
 * Popping State
 *
 */
public class PoppingState implements BubbleState {

	private Bubble bubble;

	public PoppingState(Bubble bubble) {
		this.bubble = bubble;
	}

	@Override
	public void startBubble() {
		System.out.println("Cannot Start, as bubble is in popping state");

	}

	@Override
	public void pickBubbleStick() {
		System.out.println("Cannot Pick up Stick, as bubble Process is popping state");

	}

	@Override
	public void blowBubble() {
		System.out.println("Cannot Blow, as bubble Process is already in blow state");

	}

	@Override
	public void popBubble() {
		System.out.println("Popping Bubble");
		bubble.setState(bubble.noBubbleState);
	}

}
