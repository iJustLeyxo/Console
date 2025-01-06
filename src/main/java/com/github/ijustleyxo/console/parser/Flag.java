package com.github.ijustleyxo.console.parser;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Interface for option flags
 */
public interface Flag { // TODO: Default flags
    /**
     * Returns the reference character of the flag
     * @return The reference character of the flag
     */
    char ref();

    /**
     * Returns the raw name of the flag
     * @return The raw name of the flag
     */
    @NotNull String name();

    /**
     * Returns the display name of the flag
     * @return The display name of the flag
     */
    @NotNull String displayName();

    /**
     * Returns an iterable over all names and aliases of the flag
     * @return An iterable over all names and aliases of the flag
     */
    @NotNull Iterable<String> names();

    /**
     * Returns the description of the command
     * @return The description of the command
     */
    @NotNull String info();

    /**
     * Returns the usage help of the command
     * @return The usage help of the command
     */
    @Nullable String usage();

    /**
     * Sets the flag selection status
     * @param selected Whether the flag is selected or not
     */
    void setSelected(boolean selected);

    /**
     * Returns the flag selection status
     * @return {@code true} if the flag is selected
     */
    boolean isSelected();

    /**
     * Returns the flag container
     * @return The flag container, {@code null} if the flag does not accept arguments
     */
    @Nullable Container<?> get();
}
