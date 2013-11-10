package com.qq.coqide.syntax.highlighting;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.editor.markup.TextAttributes;
import com.intellij.psi.tree.IElementType;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;
import static com.intellij.ui.JBColor.*;
import static java.awt.Font.BOLD;
import static java.awt.Font.ITALIC;

import static com.qq.coqide.syntax.parser.CoqTokenTypes.*;

public interface DefaultTextAttributes {

    TextAttributes GALLINA_KEYWORD    = new TextAttributes(RED, null, null, null, 0);
    TextAttributes VERNACULAR_KEYWORD = new TextAttributes(BLUE, null, null, null, 0);
    TextAttributes SPECIAL_TOKEN      = new TextAttributes(null, null, null, null, BOLD);
    TextAttributes INTEGER            = new TextAttributes(CYAN, null, null, null, 0);
    TextAttributes COMMENT            = new TextAttributes(GRAY, null, null, null, ITALIC);

    TextAttributesKey[] GALLINA_KEYWORD_KEY    = new TextAttributesKey[]{createTextAttributesKey("Gallina.Keyword", GALLINA_KEYWORD)};
    TextAttributesKey[] VERNACULAR_KEYWORD_KEY = new TextAttributesKey[]{createTextAttributesKey("Vernacular.Keyword", VERNACULAR_KEYWORD)};
    TextAttributesKey[] SPECIAL_TOKEN_KEY      = new TextAttributesKey[]{createTextAttributesKey("SpecialToken", SPECIAL_TOKEN)};
    TextAttributesKey[] INTEGER_KEY            = new TextAttributesKey[]{createTextAttributesKey("Integer", INTEGER)};
    TextAttributesKey[] COMMENT_KEY            = new TextAttributesKey[]{createTextAttributesKey("Comment", COMMENT)};

    Set<IElementType> GALLINA_KEYWORDS_SET = new HashSet<IElementType>(Arrays.<IElementType>asList(
            UNDERSCORE, AS, COFIX, ELSE, END, FIX, FOR, FORALL, FUN,
            IF, IN, LET, MATCH, PROP, RETURN, SET, THEN, TYPE, WITH
    ));

    Set<IElementType> VERNACULAR_KEYWORDS_SET = new HashSet<IElementType>(Arrays.<IElementType>asList(
            ADMITTED, AXIOM, COFIXPOINT, COINDUCTIVE, CONJECTURE, COROLLARY,
            DEFINED, DEFINITION, EXAMPLE, FACT, FIXPOINT, HYPOTHESES, HYPOTHESIS, 
            INDUCTIVE, LEMMA, PARAMETER, PARAMETERS, PROOF, PROPOSITION, QED, 
            REMARK, THEOREM, VARIABLE, VARIABLES
    ));

    Set<IElementType> SPECIAL_TOKENS_SET = new HashSet<IElementType>(Arrays.<IElementType>asList(
            PERCENT, LEFT_PAREN, RIGHT_PAREN, COMMA, RIGHT_SIMPLE_ARROW,
            DOT, COLON, COLON_EQUAL, LESS_COLON, RIGHT_DOUBLE_ARROW,
            AT_SIGN, LEFT_BRACE, PIPE, RIGHT_BRACE
    ));
}
