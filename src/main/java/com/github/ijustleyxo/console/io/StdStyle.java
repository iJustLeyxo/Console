package com.github.ijustleyxo.console.io;

import org.jetbrains.annotations.NotNull;

/**
 * Console output styles, used to manage color, weight, etc. of console outputs
 */
public enum StdStyle implements Style {
    NONE(),
    DEBUG(EscapeCode.LIGHT_GRAY_FG),
    INFO(EscapeCode.WHITE_FG),
    SUCCESS(EscapeCode.LIGHT_GREEN_FG),
    HELP(EscapeCode.LIGHT_GREEN_FG),
    WARN(EscapeCode.BOLD, EscapeCode.LIGHT_YELLOW_FG),
    ERR(EscapeCode.BOLD, EscapeCode.LIGHT_RED_FG),
    PROMPT(EscapeCode.BOLD, EscapeCode.LIGHT_BLUE_FG),
    INPUT(EscapeCode.BOLD, EscapeCode.WHITE_FG);

    public final @NotNull String codes;

    StdStyle(@NotNull EscapeCode @NotNull ... codes) {
        StringBuilder s = new StringBuilder();
        for (EscapeCode c : codes) {
            s.append(c);
        }
        this.codes = s.toString();
    }

    @Override
    public @NotNull String toString() { return this.codes; }
}
