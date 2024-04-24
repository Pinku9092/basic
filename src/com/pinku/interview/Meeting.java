package com.pinku.interview;

public class Meeting {
	int start;
	int end;
	int pos;
	public Meeting(int start, int end, int pos) {
		super();
		this.start = start;
		this.end = end;
		this.pos = pos;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	public int getPos() {
		return pos;
	}
	public void setPos(int pos) {
		this.pos = pos;
	}
	
}
