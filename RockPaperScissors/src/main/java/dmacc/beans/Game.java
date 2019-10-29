package dmacc.beans;

import java.util.Random;

public class Game {

	private String player1;
	private String computerPlayer;
	private String winner;
		
	public Game() {
		super();}
	
	public Game(String player1) {
		super();
		this.player1 = player1;
		this.setComputerPlayer();
		this.determineWinner();
		}

	public String getPlayer1() {
		return player1;
	}

	public void setPlayer1(String player1) {
		this.player1 = player1;
	}

	public String getComputerPlayer() {
		return computerPlayer;
	}

	public void setComputerPlayer(String computerPlayer) {
		this.computerPlayer = computerPlayer;
	}

	public String getWinner() {
		return winner;
	}

	public void setWinner(String winner) {
		this.winner = winner;
	}
	
	
	//helper
	private void setComputerPlayer() {
		String choices[] = {"rock", "paper", "scissors", "lizard", "spock"};
		
		Random rand = new Random();
		int number = 0 + rand.nextInt((4 - 0) + 1);
		
		this.setComputerPlayer(choices[number]);
	}
	
	private void determineWinner() {
		if (this.getPlayer1().equals("rock")) {
			if(this.getComputerPlayer().equals("rock")) {
				this.setWinner("Tie");
			}else if (this.getComputerPlayer().equals("paper")) {
				this.setWinner("Computer");
			}else if (this.getComputerPlayer().equals("scissors") ) {
				this.setWinner("You!");
			}else if (this.getComputerPlayer().equals("spock")) {
				this.setWinner("Computer");
			} else if (this.getComputerPlayer().equals("lizard")) {
				this.setWinner("You!");
			} else {
				this.setWinner("Error");
			}
		}else if (this.getPlayer1().equals("scissors")) {
			if(this.getComputerPlayer().equals("scissors")) {
				this.setWinner("Tie");
			} else if (this.getComputerPlayer().equals("rock")) {
				this.setWinner("Computer");
			} else if (this.getComputerPlayer().equals("paper")) {
				this.setWinner("You!");
			} else if (this.getComputerPlayer().equals("spock")) {
				this.setWinner("Computer");
			} else if (this.getComputerPlayer().equals("lizard")) {
				this.setWinner("You!");
			} else {
				this.setWinner("Error");
			}
		}else if (this.getPlayer1().equals("paper") ) {
			if (this.getComputerPlayer().equals("paper")) {
				this.setWinner("Tie");
			} else if (this.getComputerPlayer().equals("rock")) {
				this.setWinner("You!");
			} else if (this.getComputerPlayer().equals("scissors")) {
				this.setWinner("Computer");
			} else if (this.getComputerPlayer().equals("spock")) {
				this.setWinner("You!");
			} else if (this.getComputerPlayer().equals("lizard")) {
				this.setWinner("Computer");
			} else {
				this.setWinner("Error");
			}
		}else if (this.getPlayer1().equals("lizard")) {
			if (this.getComputerPlayer().equals("paper")) {
				this.setWinner("You!");
			} else if (this.getComputerPlayer().equals("rock")) {
				this.setWinner("Computer");
			} else if (this.getComputerPlayer().equals("scissors")) {
				this.setWinner("Computer");
			} else if (this.getComputerPlayer().equals("spock")) {
				this.setWinner("You!");
			} else if (this.getComputerPlayer().equals("lizard")) {
				this.setWinner("Tie");
			} else {
				this.setWinner("Error");
			}
			
		} else if (this.getPlayer1().equals("spock")) {
			if (this.getComputerPlayer().equals("paper")) {
				this.setWinner("Computer");
			} else if (this.getComputerPlayer().equals("rock")) {
				this.setWinner("You!");
			} else if (this.getComputerPlayer().equals("scissors")) {
				this.setWinner("You!");
			} else if (this.getComputerPlayer().equals("spock")) {
				this.setWinner("Tie");
			} else if (this.getComputerPlayer().equals("lizard")) {
				this.setWinner("Computer");
			} else {
				this.setWinner("Error");
			}
			
		} else {
			this.setWinner("Error");
		}
		
	}
}
