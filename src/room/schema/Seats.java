package room.schema;

public class Seats {

	private String seatNumber;
	private boolean isComputer;
	private boolean isMouse;
	private boolean isMonitor;
	private boolean isChair;
	private boolean isDesk;
	private boolean isKeyboard;

	public String getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}

	public boolean isComputer() {
		return isComputer;
	}

	public void setComputer(boolean isComputer) {
		this.isComputer = isComputer;
	}

	public boolean isMouse() {
		return isMouse;
	}

	public void setMouse(boolean isMouse) {
		this.isMouse = isMouse;
	}

	public boolean isMonitor() {
		return isMonitor;
	}

	public void setMonitor(boolean isMonitor) {
		this.isMonitor = isMonitor;
	}

	public boolean isChair() {
		return isChair;
	}

	public void setChair(boolean isChair) {
		this.isChair = isChair;
	}

	public boolean isDesk() {
		return isDesk;
	}

	public void setDesk(boolean isDesk) {
		this.isDesk = isDesk;
	}

	public boolean isKeyboard() {
		return isKeyboard;
	}

	public void setKeyboard(boolean isKeyboard) {
		this.isKeyboard = isKeyboard;
	}

}
