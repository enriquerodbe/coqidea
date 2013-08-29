package com.qq.coqide.lexer;

import com.intellij.psi.tree.IElementType;
import com.qq.coqide.CoqLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class CoqTokenType extends IElementType {

    public CoqTokenType(@NotNull @NonNls String debugName) {
        super(debugName, CoqLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "CoqSimpleType." + super.toString();
    }
}
