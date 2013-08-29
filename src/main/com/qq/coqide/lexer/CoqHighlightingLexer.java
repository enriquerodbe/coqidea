package com.qq.coqide.lexer;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

/**
 * User: enrique
 * Created: 8/28/13 10:35 AM
 */
public class CoqHighlightingLexer extends FlexAdapter {

    public CoqHighlightingLexer() {
        super(new CoqLexer((Reader) null));
    }
}
