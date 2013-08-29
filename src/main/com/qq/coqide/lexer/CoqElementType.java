package com.qq.coqide.lexer;

import com.intellij.psi.tree.IElementType;
import com.qq.coqide.CoqLanguage;
import org.jetbrains.annotations.NonNls;

/**
 * User: enrique
 * Created: 8/15/13 7:49 PM
 */
public class CoqElementType extends IElementType {

    public CoqElementType(@NonNls String debugName) {
        super(debugName, CoqLanguage.INSTANCE);
    }

    public String toString() {
        return "Coq: " + super.toString();
    }
}
