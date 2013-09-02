package com.qq.coqide.settings;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import com.qq.coqide.filetype.CoqIcons;
import com.qq.coqide.syntax.highlighting.CoqSyntaxHighlighter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Map;

import static com.qq.coqide.syntax.highlighting.DefaultTextAttributes.*;

public class CoqColorSettingsPage implements ColorSettingsPage {

    private static final AttributesDescriptor[] DESCRIPTORS =
            new AttributesDescriptor[] {
                    new AttributesDescriptor("Gallina keyword", GALLINA_KEYWORD_KEY[0]),
                    new AttributesDescriptor("Vernacular keyword", VERNACULAR_KEYWORD_KEY[0]),
                    new AttributesDescriptor("Special token", SPECIAL_TOKEN_KEY[0]),
                    new AttributesDescriptor("Integer", INTEGER_KEY[0]),
                    new AttributesDescriptor("String", STRING_KEY[0]),
                    new AttributesDescriptor("Comment", COMMENT_KEY[0]),
                    new AttributesDescriptor("Ident", IDENT_KEY[0])
            };

    @Nullable
    @Override
    public Icon getIcon() {
        return CoqIcons.FILE;
    }

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new CoqSyntaxHighlighter();
    }

    @NotNull
    @Override
    public String getDemoText() {
        return "Definition myDef.";
    }

    @Nullable
    @Override
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @NotNull
    @Override
    public AttributesDescriptor[] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @NotNull
    @Override
    public ColorDescriptor[] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "Coq";
    }
}
