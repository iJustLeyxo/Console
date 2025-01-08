package com.github.ijustleyxo.console.io;

/**
 * Interface for logging detail level management classes
 */
public interface Level {
    /**
     * Returns the reference value of the detail level, used to compare detail levels. Larger numbers correspond to more detail whilst small numbers correspond to less detail. Default reference value is {@code 0}.
     * @return The reference value of the detail level
     */
    byte value();
}
