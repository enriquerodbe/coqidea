package com.qq.coqide.lexer;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

public class CoqHighlightingLexer extends FlexAdapter {

    public CoqHighlightingLexer() {
        super(new CoqLexer((Reader) null));
    }
}
