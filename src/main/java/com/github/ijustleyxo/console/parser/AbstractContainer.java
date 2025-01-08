package com.github.ijustleyxo.console.parser;

import org.jetbrains.annotations.Nullable;

/**
 * Container of an element of a generic type
 * @param <T> The type of the container contents
 */
public abstract class AbstractContainer<T> implements Container<T> {
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
