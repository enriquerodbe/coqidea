package com.qq.coqide.syntax.highlighting;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import com.qq.coqide.lexer.*;
import org.jetbrains.annotations.NotNull;

import static com.qq.coqide.syntax.highlighting.DefaultTextAttributes.*;

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
        if (elementType instanceof GallinaKeyword) {
            return GALLINA_KEYWORD_KEY;
        }
        if (elementType instanceof VernacularKeyword) {
            return VERNACULAR_KEYWORD_KEY;
        }
        if (elementType instanceof CoqSpecialToken) {
            return SPECIAL_TOKEN_KEY;
        }
        if (elementType instanceof CoqInteger) {
            return INTEGER_KEY;
        }
        if (elementType instanceof CoqString) {
            return STRING_KEY;
        }
        if (elementType instanceof CoqComment) {
            return COMMENT_KEY;
        }
        if (elementType instanceof CoqIdent) {
            return IDENT_KEY;
        }

        return EMPTY;
    }
}
