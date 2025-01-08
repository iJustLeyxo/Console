package com.github.ijustleyxo.console.io;

import org.jetbrains.annotations.NotNull;

/**
 * Interface for output type management classes
 */
public interface Type {
    /**
     * Returns the logging detail level
     * @return The logging detail level
     */
    @NotNull Level detail();

    /**
     * Returns the logging output style
     * @return The logging output style
     */
    @NotNull Style style();
}
