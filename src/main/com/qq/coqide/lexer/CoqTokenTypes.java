package com.qq.coqide.lexer;

import com.intellij.psi.tree.IElementType;

public interface CoqTokenTypes {

    /****************************** Keywords ****************************************/

    // Vernacular

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
    IElementType PROPOSITION = new CoqKeyword("PROPOSITION");
    IElementType QED         = new CoqKeyword("QED");
    IElementType REMARK      = new CoqKeyword("REMARK");
    IElementType THEOREM     = new CoqKeyword("THEOREM");
    IElementType VARIABLE    = new CoqKeyword("VARIABLE");
    IElementType VARIABLES   = new CoqKeyword("VARIABLES");

    
    // Gallina

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
    IElementType PROP       = new CoqKeyword("PROP");
    IElementType RETURN     = new CoqKeyword("RETURN");
    IElementType SET        = new CoqKeyword("SET");
    IElementType THEN       = new CoqKeyword("THEN");
    IElementType TYPE       = new CoqKeyword("TYPE");
    IElementType USING      = new CoqKeyword("USING");
    IElementType WHERE      = new CoqKeyword("WHERE");
    IElementType WITH       = new CoqKeyword("WITH");


    /****************************** Special tokens **********************************/

    IElementType EXCLAMATION        = new CoqSpecialToken("EXCLAMATION");
    IElementType PERCENT            = new CoqSpecialToken("PERCENT");
    IElementType AMPERSAND          = new CoqSpecialToken("AMPERSAND");
    IElementType DOUBLE_AMPERSAND   = new CoqSpecialToken("DOUBLE_AMPERSAND");
    IElementType LEFT_PAREN         = new CoqSpecialToken("LEFT_PAREN");
    IElementType EMPTY_PAREN        = new CoqSpecialToken("EMPTY_PAREN");
    IElementType RIGHT_PAREN        = new CoqSpecialToken("RIGHT_PAREN");
    IElementType ASTERISK           = new CoqSpecialToken("ASTERISK");
    IElementType PLUS               = new CoqSpecialToken("PLUS");
    IElementType DOUBLE_PLUS        = new CoqSpecialToken("DOUBLE_PLUS");
    IElementType COMMA              = new CoqSpecialToken("COMMA");
    IElementType HYPHEN             = new CoqSpecialToken("HYPHEN");
    IElementType RIGHT_SIMPLE_ARROW = new CoqSpecialToken("RIGHT_SIMPLE_ARROW");
    IElementType DOT                = new CoqSpecialToken("DOT");
    IElementType DOT_PAREN          = new CoqSpecialToken("DOT_PAREN");
    IElementType DOUBLE_DOT         = new CoqSpecialToken("DOUBLE_DOT");
    IElementType SLASH              = new CoqSpecialToken("SLASH");
    IElementType AND                = new CoqSpecialToken("AND");
    IElementType COLON              = new CoqSpecialToken("COLON");
    IElementType DOUBLE_COLON       = new CoqSpecialToken("DOUBLE_COLON");
    IElementType INCLUDED           = new CoqSpecialToken("INCLUDED");
    IElementType COLON_EQUAL        = new CoqSpecialToken("COLON_EQUAL");
    IElementType INCLUDES           = new CoqSpecialToken("INCLUDES");
    IElementType SEMICOLON          = new CoqSpecialToken("SEMICOLON");
    IElementType LESS               = new CoqSpecialToken("LESS");
    IElementType LEFT_SIMPLE_ARROW  = new CoqSpecialToken("LEFT_SIMPLE_ARROW");
    IElementType IF_AND_ONLY_IF     = new CoqSpecialToken("IF_AND_ONLY_IF");
    IElementType LESS_COLON         = new CoqSpecialToken("LESS_COLON");
    IElementType LESS_EQUAL         = new CoqSpecialToken("LESS_EQUAL");
    IElementType DISTINCT           = new CoqSpecialToken("DISTINCT");
    IElementType EQUAL              = new CoqSpecialToken("EQUAL");
    IElementType RIGHT_DOUBLE_ARROW = new CoqSpecialToken("RIGHT_DOUBLE_ARROW");
    IElementType HAPPINESS          = new CoqSpecialToken("HAPPINESS");
    IElementType GREATER            = new CoqSpecialToken("GREATER");
    IElementType PATH               = new CoqSpecialToken("PATH");
    IElementType GREATER_EQUAL      = new CoqSpecialToken("GREATER_EQUAL");
    IElementType QUESTION           = new CoqSpecialToken("QUESTION");
    IElementType QUESTION_EQUAL     = new CoqSpecialToken("QUESTION_EQUAL");
    IElementType AT_SIGN            = new CoqSpecialToken("AT_SIGN");
    IElementType LEFT_BRACKET       = new CoqSpecialToken("LEFT_BRACKET");
    IElementType OR                 = new CoqSpecialToken("OR");
    IElementType RIGHT_BRACKET      = new CoqSpecialToken("RIGHT_BRACKET");
    IElementType CARET              = new CoqSpecialToken("CARET");
    IElementType LEFT_BRACE         = new CoqSpecialToken("LEFT_BRACE");
    IElementType PIPE               = new CoqSpecialToken("PIPE");
    IElementType PIPE_HYPHEN        = new CoqSpecialToken("PIPE_HYPHEN");
    IElementType DOUBLE_PIPE        = new CoqSpecialToken("DOUBLE_PIPE");
    IElementType RIGHT_BRACE        = new CoqSpecialToken("RIGHT_BRACE");
    IElementType EQUIVALENCY        = new CoqSpecialToken("EQUIVALENCY");
        

    /****************************** Literals ****************************************/

    IElementType INTEGER = new CoqElementType("INTEGER");
    IElementType STRING  = new CoqElementType("STRING");

    
    /****************************** Composed tokens *********************************/

    IElementType COMMENT        = new CoqElementType("COMMENT");
    IElementType STRING_LITERAL = new CoqElementType("STRING_LITERAL");
    IElementType IDENT          = new CoqElementType("IDENT");
}
