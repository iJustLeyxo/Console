package com.github.ijustleyxo.console.parser;

import org.jetbrains.annotations.Nullable;

/**
 * Container of an element of a generic type
 * @param <T> The type of the container contents
 * @param <E> The type of the throwable that is thrown when adding an argument fails
 */
public abstract class AbstractContainer<T, E extends Throwable> implements Container<T, E> {
    /**
     * The contents of the container
     */
    protected @Nullable T contents;

    public AbstractContainer() {
        this.contents = null;
    }

    public AbstractContainer(@Nullable T contents) {
        this.contents = contents;
    }

    @Override
    public @Nullable T get() {
        return this.contents;
    }

    @Override
    public void clear() {
        this.contents = null;
    }
}
