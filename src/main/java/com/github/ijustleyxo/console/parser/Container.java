package com.github.ijustleyxo.console.parser;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Container interface
 * @param <T> The type of the container contents
 */
public interface Container<T> {
    /**
     * Add another argument to the container
     * @param arg The argument to add
     * @return {@code false} if adding arguments is not possible
     */
    boolean add(@NotNull String arg);

    /**
     * Returns the contents of the container
     * @return The container contents
     */
    @Nullable T get();

    /**
     * Returns whether the container is empty
     * @return {@code true} if the container is empty
     */
    default boolean isEmpty() {
        return this.get() != null;
    }

    /**
     * Clears the container and resets it to its initial state
     */
    void clear();
}
