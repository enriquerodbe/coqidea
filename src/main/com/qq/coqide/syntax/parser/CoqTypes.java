// This is a generated file. Not intended for manual editing.
package com.qq.coqide.syntax.parser;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.qq.coqide.lexer.CoqElementType;
import com.qq.coqide.lexer.CoqTokenType;

public interface CoqTypes {

  IElementType EXPRESSION = new CoqElementType("EXPRESSION");

  IElementType COMMENT = new CoqTokenType("COMMENT");
  IElementType DEFINITION = new CoqTokenType("DEFINITION");
  IElementType DOT = new CoqTokenType("DOT");
  IElementType IDENT = new CoqTokenType("IDENT");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == EXPRESSION) {
        return new CoqExpressionImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
