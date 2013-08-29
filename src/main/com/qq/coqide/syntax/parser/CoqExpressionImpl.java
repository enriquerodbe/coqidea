// This is a generated file. Not intended for manual editing.
package com.qq.coqide.syntax.parser;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.qq.coqide.syntax.parser.CoqTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;

public class CoqExpressionImpl extends ASTWrapperPsiElement implements CoqExpression {

  public CoqExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CoqVisitor) ((CoqVisitor)visitor).visitExpression(this);
    else super.accept(visitor);
  }

}
