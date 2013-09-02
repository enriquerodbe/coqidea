package com.qq.coqide.syntax.highlighting;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.editor.markup.TextAttributes;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;
import static java.awt.Color.*;
import static java.awt.Font.BOLD;
import static java.awt.Font.ITALIC;

public interface DefaultTextAttributes {

    public static final TextAttributes GALLINA_KEYWORD    = new TextAttributes(RED, null, null, null, 0);
    public static final TextAttributes VERNACULAR_KEYWORD = new TextAttributes(BLUE, null, null, null, 0);
    public static final TextAttributes SPECIAL_TOKEN      = new TextAttributes(null, null, null, null, BOLD);
    public static final TextAttributes INTEGER            = new TextAttributes(CYAN, null, null, null, 0);
    public static final TextAttributes STRING             = new TextAttributes(GREEN, null, null, null, BOLD);
    public static final TextAttributes COMMENT            = new TextAttributes(GRAY, null, null, null, ITALIC);
    public static final TextAttributes IDENT              = new TextAttributes(DARK_GRAY, null, null, null, ITALIC);

    public static final TextAttributesKey[] GALLINA_KEYWORD_KEY    = new TextAttributesKey[]{createTextAttributesKey("Gallina.Keyword", GALLINA_KEYWORD)};
    public static final TextAttributesKey[] VERNACULAR_KEYWORD_KEY = new TextAttributesKey[]{createTextAttributesKey("Vernacular.Keyword", VERNACULAR_KEYWORD)};
    public static final TextAttributesKey[] SPECIAL_TOKEN_KEY      = new TextAttributesKey[]{createTextAttributesKey("SpecialToken", SPECIAL_TOKEN)};
    public static final TextAttributesKey[] INTEGER_KEY            = new TextAttributesKey[]{createTextAttributesKey("Integer", INTEGER)};
    public static final TextAttributesKey[] STRING_KEY             = new TextAttributesKey[]{createTextAttributesKey("String", STRING)};
    public static final TextAttributesKey[] COMMENT_KEY            = new TextAttributesKey[]{createTextAttributesKey("Comment", COMMENT)};
    public static final TextAttributesKey[] IDENT_KEY              = new TextAttributesKey[]{createTextAttributesKey("Ident", IDENT)};
}
