package com.qq.coqide.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import static com.qq.coqide.syntax.parser.CoqTokenTypes.*;
import static com.intellij.psi.TokenType.*;

%%

%class CoqLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

BLANK=[\ \t\n]
FIRST_LETTER=[a-zA-Z_]
SUBSEQUENT_LETTER=[a-zA-Z0-9_']
COMMENT="(*" [^*] ~"*)" | "(*" "*"+ ")"

%%

/****************************** Keywords ****************************************/

// Vernacular

"Admitted"    { return ADMITTED;    }
"Axiom"       { return AXIOM;       }
"CoFixpoint"  { return COFIXPOINT;  }
"CoInductive" { return COINDUCTIVE; }
"Conjecture"  { return CONJECTURE;  }
"Corollary"   { return COROLLARY;   }
"Defined"     { return DEFINED;     }
"Definition"  { return DEFINITION;  }
"Example"     { return EXAMPLE;     }
"Fact"        { return FACT;        }
"Fixpoint"    { return FIXPOINT;    }
"Hypotheses"  { return HYPOTHESES;  }
"Hypothesis"  { return HYPOTHESIS;  }
"Inductive"   { return INDUCTIVE;   }
"Lemma"       { return LEMMA;       }
"Parameter"   { return PARAMETER;   }
"Parameters"  { return PARAMETERS;  }
"Proof"       { return PROOF;       }
"Proposition" { return PROPOSITION; }
"Qed"         { return QED;         }
"Remark"      { return REMARK;      }
"Theorem"     { return THEOREM;     }
"Variable"    { return VARIABLE;    }
"Variables"   { return VARIABLES;   }

// Gallina

"_"           { return UNDERSCORE;  }
"as"          { return AS;          }
"cofix"       { return COFIX;       }
"else"        { return ELSE;        }
"end"         { return END;         }
"fix"         { return FIX;         }
"for"         { return FOR;         }
"forall"      { return FORALL;      }
"fun"         { return FUN;         }
"if"          { return IF;          }
"in"          { return IN;          }
"let"         { return LET;         }
"match"       { return MATCH;       }
"Prop"        { return PROP;        }
"return"      { return RETURN;      }
"Set"         { return SET;         }
"then"        { return THEN;        }
"Type"        { return TYPE;        }
"with"        { return WITH;        }


/****************************** Special tokens **********************************/

"%"     { return PERCENT; }
"("     { return LEFT_PAREN; }
")"     { return RIGHT_PAREN; }
","     { return COMMA; }
"->"    { return RIGHT_SIMPLE_ARROW; }
"."     { return DOT;      }
":"     { return COLON; }
":="    { return COLON_EQUAL; }
"<:"    { return LESS_COLON; } // TODO: Check this symbol meaning
"=>"    { return RIGHT_DOUBLE_ARROW; }
"@"     { return AT_SIGN; }
"{"     { return LEFT_BRACE; }
"|"     { return PIPE; }
"}"     { return RIGHT_BRACE; }


/****************************** Literals ****************************************/

"-"?[0-9]+ { return INTEGER; }


/****************************** Composed tokens *********************************/

{BLANK}+                           { return WHITE_SPACE; }
{COMMENT}                          { return COMMENT;     }
{FIRST_LETTER}{SUBSEQUENT_LETTER}* { return IDENT;       }


/****************************** Other *******************************************/

. { return BAD_CHARACTER; }
