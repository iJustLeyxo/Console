package com.github.ijustleyxo.console.io;

import org.jetbrains.annotations.NotNull;

/**
 * Interface for logging output style management classes
 */
public interface Style {
    /**
     * Returns the string of all format codes (ANSI escape codes) to output before a message
     * @return The string of all format codes
     */
    @NotNull String toString();
}
