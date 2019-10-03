package gamelevel;

public class Player {
	
	PlayerLevel level;
	
	public Player() {
		level = new BeginnerLevel();
	}
	
	public void play(int count) {
		level.showLevelMessage();
		level.go(count);
	}
	
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
	}
	
}
