package ai;

import game.Block;

public interface OthelloAI {
	public Block choice();
	public int getProbability();
	public void stopThinking();
}
