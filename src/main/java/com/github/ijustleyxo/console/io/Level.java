package com.github.ijustleyxo.console.io;

/**
 * Default console output detail levels
 */
public enum Level implements OutputLevel {
    /**
     * Use this to log anything
     */
    MIN(Byte.MIN_VALUE),
    SILENT((byte) -2),
    QUIET((byte) -1),
    NORMAL((byte) 0),
    NOISY((byte) 1),
    LOUD((byte) 2),
    /**
     * Use this as limit to log everything
     */
    MAX(Byte.MAX_VALUE);

    private final byte value;

    Level(byte value) {
        this.value = value;
    }

    @Override
    public byte value() {
        return this.value;
    }
}
