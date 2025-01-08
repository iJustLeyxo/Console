package com.github.ijustleyxo.console.io;

import org.jetbrains.annotations.NotNull;

/**
 * Console output type, used to combine commonly used combinations of a style and detail level
 */
public enum StdType implements Type { // TODO: Verify all, new logging level
    //= Standard ==
    DEBUG(StdLevel.DEBUG, StdStyle.DEBUG),
    VERBOSE(StdLevel.VERBOSE, StdStyle.DEBUG),
    INFO(StdLevel.NORMAL, StdStyle.INFO),
    WARN(StdLevel.WARN, StdStyle.WARN),
    ERR(StdLevel.ERR, StdStyle.ERR),

    //= Special ==
    PROMPT(StdLevel.MIN, StdStyle.PROMPT),
    REQUESTED(StdLevel.MIN, StdStyle.INFO);

    private final @NotNull Level detail;
    private final @NotNull Style style;

    StdType(@NotNull Level detail, @NotNull Style style) {
        this.detail = detail;
        this.style = style;
    }

    @Override
    public @NotNull Level detail() {
        return this.detail;
    }

    @Override
    public @NotNull Style style() {
        return this.style;
    }
}
