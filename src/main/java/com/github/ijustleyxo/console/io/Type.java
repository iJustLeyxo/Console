package com.github.ijustleyxo.console.io;

import org.jetbrains.annotations.NotNull;

/**
 * Console output type, used to combine commonly used combinations of a style and detail level
 */
public enum Type implements OutputType { // TODO: Verify all, new logging level
    //= Standard ==
    DEBUG(Level.LOUD, Style.DEBUG),
    EXTRA(Level.NOISY, Style.DEBUG),
    INFO(Level.NORMAL, Style.INFO),
    WARN(Level.QUIET, Style.WARN),
    ERR(Level.SILENT, Style.ERR),

    // = Special ==
    PROMPT(Level.MIN, Style.PROMPT),
    REQUESTED(Level.MIN, Style.INFO);

    private final @NotNull OutputLevel detail;
    private final @NotNull OutputStyle style;

    Type(@NotNull OutputLevel detail, @NotNull OutputStyle style) {
        this.detail = detail;
        this.style = style;
    }

    @Override
    public @NotNull OutputLevel detail() {
        return this.detail;
    }

    @Override
    public @NotNull OutputStyle style() {
        return this.style;
    }
}
