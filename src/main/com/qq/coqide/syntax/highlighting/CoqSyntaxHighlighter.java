package com.qq.coqide.syntax.highlighting;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import com.qq.coqide.lexer.CoqHighlightingLexer;
import org.jetbrains.annotations.NotNull;

import static com.qq.coqide.syntax.highlighting.DefaultTextAttributes.*;
import static com.qq.coqide.syntax.parser.CoqTokenTypes.COMMENT;
import static com.qq.coqide.syntax.parser.CoqTokenTypes.INTEGER;

public class CoqSyntaxHighlighter extends SyntaxHighlighterBase {

    public static final TextAttributesKey[] EMPTY = new TextAttributesKey[0];

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new CoqHighlightingLexer();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType elementType) {
        if (VERNACULAR_KEYWORDS_SET.contains(elementType)) {
            return VERNACULAR_KEYWORD_KEY;
        }
        if (GALLINA_KEYWORDS_SET.contains(elementType)) {
            return GALLINA_KEYWORD_KEY;
        }
        if (SPECIAL_TOKENS_SET.contains(elementType)) {
            return SPECIAL_TOKEN_KEY;
        }
        if (INTEGER.equals(elementType)) {
            return INTEGER_KEY;
        }
        if (COMMENT.equals(elementType)) {
            return COMMENT_KEY;
        }
        return EMPTY;
    }
}
