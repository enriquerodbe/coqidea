package com.qq.coqide.lexer;

import com.intellij.psi.tree.IElementType;

public interface CoqTokenTypes {

    /****************************** Keywords ****************************************/

    IElementType ADMITTED    = new CoqKeyword("ADMITTED");
    IElementType AXIOM       = new CoqKeyword("AXIOM");
    IElementType COFIXPOINT  = new CoqKeyword("COFIXPOINT");
    IElementType COINDUCTIVE = new CoqKeyword("COINDUCTIVE");
    IElementType CONJECTURE  = new CoqKeyword("CONJECTURE");
    IElementType COROLLARY   = new CoqKeyword("COROLLARY");
    IElementType DEFINED     = new CoqKeyword("DEFINED");
    IElementType DEFINITION  = new CoqKeyword("HYPOTHESES");
    IElementType EXAMPLE     = new CoqKeyword("EXAMPLE");
    IElementType FACT        = new CoqKeyword("FACT");
    IElementType FIXPOINT    = new CoqKeyword("FIXPOINT");
    IElementType HYPOTHESES  = new CoqKeyword("HYPOTHESES");
    IElementType HYPOTHESIS  = new CoqKeyword("HYPOTHESIS");
    IElementType INDUCTIVE   = new CoqKeyword("INDUCTIVE");
    IElementType LEMMA       = new CoqKeyword("LEMMA");
    IElementType LET_UPPER   = new CoqKeyword("LET_UPPER");
    IElementType PARAMETER   = new CoqKeyword("PARAMETER");
    IElementType PARAMETERS  = new CoqKeyword("PARAMETERS");
    IElementType PROOF       = new CoqKeyword("PROOF");
    IElementType PROP        = new CoqKeyword("PROP");
    IElementType PROPOSITION = new CoqKeyword("PROPOSITION");
    IElementType QED         = new CoqKeyword("QED");
    IElementType REMARK      = new CoqKeyword("REMARK");
    IElementType SET         = new CoqKeyword("SET");
    IElementType THEOREM     = new CoqKeyword("THEOREM");
    IElementType TYPE        = new CoqKeyword("TYPE");
    IElementType VARIABLE    = new CoqKeyword("VARIABLE");
    IElementType VARIABLES   = new CoqKeyword("VARIABLES");

    IElementType UNDERSCORE = new CoqKeyword("UNDERSCORE");
    IElementType AS         = new CoqKeyword("AS");
    IElementType AT         = new CoqKeyword("AT");
    IElementType COFIX      = new CoqKeyword("COFIX");
    IElementType ELSE       = new CoqKeyword("ELSE");
    IElementType END        = new CoqKeyword("END");
    IElementType EXISTS     = new CoqKeyword("EXISTS");
    IElementType EXISTS2    = new CoqKeyword("EXISTS2");
    IElementType FIX        = new CoqKeyword("FIX");
    IElementType FOR        = new CoqKeyword("FOR");
    IElementType FORALL     = new CoqKeyword("FORALL");
    IElementType FUN        = new CoqKeyword("FUN");
    IElementType IF         = new CoqKeyword("IF");
    IElementType IF_UPPER   = new CoqKeyword("IF_UPPER");
    IElementType IN         = new CoqKeyword("IN");
    IElementType LET        = new CoqKeyword("LET");
    IElementType MATCH      = new CoqKeyword("MATCH");
    IElementType MOD        = new CoqKeyword("MOD");
    IElementType RETURN     = new CoqKeyword("RETURN");
    IElementType THEN       = new CoqKeyword("THEN");
    IElementType USING      = new CoqKeyword("USING");
    IElementType WHERE      = new CoqKeyword("WHERE");
    IElementType WITH       = new CoqKeyword("WITH");


    /****************************** Special characters ******************************/

    IElementType COLON    = new CoqElementType("COLON");
    IElementType DOT      = new CoqElementType("DOT");
    IElementType COLON_EQ = new CoqElementType("COLON_EQ");


    /****************************** Literals ****************************************/

    IElementType INTEGER = new CoqElementType("INTEGER");
    IElementType STRING  = new CoqElementType("STRING");

    /****************************** Composed tokens *********************************/

    IElementType COMMENT        = new CoqElementType("COMMENT");
    IElementType STRING_LITERAL = new CoqElementType("STRING_LITERAL");
    IElementType IDENT          = new CoqElementType("IDENT");
}
