package com.github.ijustleyxo.console.io;

import org.jetbrains.annotations.NotNull;

/**
 * Console output styles, used to manage color, weight, etc. of console outputs
 */
public enum Style implements OutputStyle {
    NONE(),
    DEBUG(Code.GRAY),
    INFO(Code.WHITE),
    SUCCESS(Code.GREEN),
    HELP(Code.GREEN),
    WARN(Code.BOLD, Code.YELLOW),
    ERR(Code.BOLD, Code.RED),
    PROMPT(Code.BOLD, Code.BLUE),
    INPUT(Code.BOLD, Code.WHITE);

    public final @NotNull String codes;

    Style(@NotNull Code @NotNull ... codes) {
        StringBuilder s = new StringBuilder();
        for (Code c : codes) {
            s.append(c);
        }
        this.codes = s.toString();
    }

    @Override
    public @NotNull String toString() { return this.codes; }
}
