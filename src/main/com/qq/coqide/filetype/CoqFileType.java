package com.qq.coqide.filetype;

import com.intellij.openapi.fileTypes.LanguageFileType;
import com.qq.coqide.CoqLanguage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * User: enrique
 * Created: 8/14/13 10:48 PM
 */
public class CoqFileType extends LanguageFileType {

    public static final CoqFileType INSTANCE = new CoqFileType();

    private CoqFileType() {
        super(CoqLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Coq file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Coq language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "v";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return CoqIcons.FILE;
    }
}
