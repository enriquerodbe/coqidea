package com.qq.coqide.syntax.highlighting;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.SyntaxHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import com.qq.coqide.lexer.CoqHighlightingLexer;
import com.qq.coqide.lexer.CoqTokenTypes;
import org.jetbrains.annotations.NotNull;

public class CoqSyntaxHighlighter extends SyntaxHighlighterBase {

    private static final TextAttributesKey[] DEFINITION =
            new TextAttributesKey[]{TextAttributesKey.createTextAttributesKey("Coq.Definition", SyntaxHighlighterColors.KEYWORD)};
    private static final TextAttributesKey[] EMPTY =
            new TextAttributesKey[0];

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new CoqHighlightingLexer();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType iElementType) {
        if (iElementType.equals(CoqTokenTypes.DEFINITION)) {
            return DEFINITION;
        }

        return EMPTY;
    }


}
