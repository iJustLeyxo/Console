package com.github.ijustleyxo.console.parser;

import com.github.ijustleyxo.console.io.Console;
import com.github.ijustleyxo.console.io.StdStyle;
import com.github.ijustleyxo.console.io.StdType;
import org.jetbrains.annotations.NotNull;

/**
 * Interface for executable commands
 */
public interface Command { // TODO: Default commands
    /**
     * Returns the raw name of the command
     * @return The raw name of the command
     */
    @NotNull String name();

    /**
     * Returns the display name of the command
     * @return The display name of the command
     */
    @NotNull String displayName();

    /**
     * Returns an iterable over all names and aliases of the command
     * @return An iterable over all names and aliases of the command
     */
    @NotNull Iterable<String> names();

    /**
     * Returns the description of the command
     * @return The description of the command
     */
    @NotNull String info();

    /**
     * Runs the command
     */
    void run(); // TODO: What to run on?

    /**
     * Prints command help
     */
    default void help() { // TODO: What to run on?
        Console.log(StdType.REQUESTED, StdStyle.HELP, this.displayName() + ": " + this.info() + "\n");
    }

    /**
     * Sets the command selection status
     * @param selected Whether the command is selected or not
     */
    void setSelected(boolean selected);

    /**
     * Returns the command selection status
     * @return {@code true} if the command is selected
     */
    boolean isSelected();
}
