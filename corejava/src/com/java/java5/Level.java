package com.java.java5;
public enum Level {
    HIGH(1),
    MEDIUM(2),
    LOW(3);
	
    final int levelCode;

    private Level(int levelCode) {
        this.levelCode = levelCode;
    }
    
    public int getLevelCode() {
        return this.levelCode;
    }
    
}

