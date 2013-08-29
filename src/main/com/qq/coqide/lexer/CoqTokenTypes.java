package com.qq.coqide.lexer;

import com.intellij.psi.tree.IElementType;

/**
 * User: enrique
 * Created: 8/15/13 7:52 PM
 */
public interface CoqTokenTypes {

    /****************************** Keywords ****************************************/

    IElementType ADMITTED    = new CoqElementType("ADMITTED");
    IElementType AXIOM       = new CoqElementType("AXIOM");
    IElementType COFIXPOINT  = new CoqElementType("COFIXPOINT");
    IElementType COINDUCTIVE = new CoqElementType("COINDUCTIVE");
    IElementType CONJECTURE  = new CoqElementType("CONJECTURE");
    IElementType COROLLARY   = new CoqElementType("COROLLARY");
    IElementType DEFINED     = new CoqElementType("DEFINED");
    IElementType DEFINITION  = new CoqElementType("HYPOTHESES");
    IElementType EXAMPLE     = new CoqElementType("EXAMPLE");
    IElementType FACT        = new CoqElementType("FACT");
    IElementType FIXPOINT    = new CoqElementType("FIXPOINT");
    IElementType HYPOTHESES  = new CoqElementType("HYPOTHESES");
    IElementType HYPOTHESIS  = new CoqElementType("HYPOTHESIS");
    IElementType INDUCTIVE   = new CoqElementType("INDUCTIVE");
    IElementType LEMMA       = new CoqElementType("LEMMA");
    IElementType LET_UPPER   = new CoqElementType("LET_UPPER");
    IElementType PARAMETER   = new CoqElementType("PARAMETER");
    IElementType PARAMETERS  = new CoqElementType("PARAMETERS");
    IElementType PROOF       = new CoqElementType("PROOF");
    IElementType PROP        = new CoqElementType("PROP");
    IElementType PROPOSITION = new CoqElementType("PROPOSITION");
    IElementType QED         = new CoqElementType("QED");
    IElementType REMARK      = new CoqElementType("REMARK");
    IElementType SET         = new CoqElementType("SET");
    IElementType THEOREM     = new CoqElementType("THEOREM");
    IElementType TYPE        = new CoqElementType("TYPE");
    IElementType VARIABLE    = new CoqElementType("VARIABLE");
    IElementType VARIABLES   = new CoqElementType("VARIABLES");

    IElementType UNDERSCORE = new CoqElementType("UNDERSCORE");
    IElementType AS         = new CoqElementType("AS");
    IElementType AT         = new CoqElementType("AT");
    IElementType COFIX      = new CoqElementType("COFIX");
    IElementType ELSE       = new CoqElementType("ELSE");
    IElementType END        = new CoqElementType("END");
    IElementType EXISTS     = new CoqElementType("EXISTS");
    IElementType EXISTS2    = new CoqElementType("EXISTS2");
    IElementType FIX        = new CoqElementType("FIX");
    IElementType FOR        = new CoqElementType("FOR");
    IElementType FORALL     = new CoqElementType("FORALL");
    IElementType FUN        = new CoqElementType("FUN");
    IElementType IF         = new CoqElementType("IF");
    IElementType IF_UPPER   = new CoqElementType("IF_UPPER");
    IElementType IN         = new CoqElementType("IN");
    IElementType LET        = new CoqElementType("LET");
    IElementType MATCH      = new CoqElementType("MATCH");
    IElementType MOD        = new CoqElementType("MOD");
    IElementType RETURN     = new CoqElementType("RETURN");
    IElementType THEN       = new CoqElementType("THEN");
    IElementType USING      = new CoqElementType("USING");
    IElementType WHERE      = new CoqElementType("WHERE");
    IElementType WITH       = new CoqElementType("WITH");


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
