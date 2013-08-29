package com.qq.coqide.filetype;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.qq.coqide.CoqLanguage;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class CoqFile extends PsiFileBase {

    public CoqFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, CoqLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return CoqFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Coq File";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}
