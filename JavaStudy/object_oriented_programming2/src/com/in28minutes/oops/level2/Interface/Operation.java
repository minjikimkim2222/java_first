package com.in28minutes.oops.level2.Interface;

public interface Operation {
	int perform(int x, int y);

}

class Add implements Operation {
	public int perform(int x, int y) {
		return (x + y);
	}
}

class Substract implements Operation {
	public int perform(int x, int y) {
		return (x - y);
	}
}

class Divide implements Operation {
	public int perform(int x, int y) {
		if (y == 0)
			return (-1);
		return (x / y);
	}
}