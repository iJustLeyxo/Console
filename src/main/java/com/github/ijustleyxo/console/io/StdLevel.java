package com.github.ijustleyxo.console.io;

/**
 * Default console output detail levels
 */
public enum StdLevel implements Level {
    //= Basic Levels ==
    /**
     * Use this to log anything
     */
    MIN(Byte.MIN_VALUE),
    SILENT((byte) -2),
    QUIET((byte) -1),
    NEUTRAL((byte) 0),
    NOISY((byte) 1),
    LOUD((byte) 2),
    /**
     * Use this as limit to log everything
     */
    MAX(Byte.MAX_VALUE),

    //= Special Levels ==
    DEBUG(LOUD.value()),
    VERBOSE(NOISY.value()),
    NORMAL(NEUTRAL.value()),
    WARN(QUIET.value()),
    ERR(SILENT.value());

    private final byte value;

    StdLevel(byte value) {
        this.value = value;
    }

    @Override
    public byte value() {
        return this.value;
    }
}
