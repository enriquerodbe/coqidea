package com.qq.coqide.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import static com.qq.coqide.lexer.CoqTokenTypes.*;
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
FIRST_IDENT_CHAR=[a-zA-Z_]
IDENT_CHAR=[a-zA-Z0-9_']
COMMENT="(*" [^*] ~"*)" | "(*" "*"+ ")"
NUM=[0-9]+

%%

/****************************** Keywords ****************************************/

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
"Let"         { return LET_UPPER;   }
"Parameter"   { return PARAMETER;   }
"Parameters"  { return PARAMETERS;  }
"Proof"       { return PROOF;       }
"Prop"        { return PROP;        }
"Proposition" { return PROPOSITION; }
"Qed"         { return QED;         }
"Remark"      { return REMARK;      }
"Set"         { return SET;         }
"Theorem"     { return THEOREM;     }
"Type"        { return TYPE;        }
"Variable"    { return VARIABLE;    }
"Variables"   { return VARIABLES;   }

"_"           { return UNDERSCORE;  }
"as"          { return AS;          }
"at"          { return AT;          }
"cofix"       { return COFIX;       }
"else"        { return ELSE;        }
"end"         { return END;         }
"exists"      { return EXISTS;      }
"exists2"     { return EXISTS2;     }
"fix"         { return FIX;         }
"for"         { return FOR;         }
"forall"      { return FORALL;      }
"fun"         { return FUN;         }
"if"          { return IF;          }
"IF"          { return IF_UPPER;    }
"in"          { return IN;          }
"let"         { return LET;         }
"match"       { return MATCH;       }
"mod"         { return MOD;         }
"return"      { return RETURN;      }
"then"        { return THEN;        }
"using"       { return USING;       }
"where"       { return WHERE;       }
"with"        { return WITH;        }


/****************************** Special characters ******************************/

":"  { return COLON;    }
"."  { return DOT;      }
":=" { return COLON_EQ; }


/****************************** Literals ****************************************/

"-"?{NUM}+ { return INTEGER; }
\".*\"     { return STRING_LITERAL; }


/****************************** Composed tokens *********************************/

{BLANK}+                        { return WHITE_SPACE; }
{COMMENT}                       { return COMMENT;     }
{FIRST_IDENT_CHAR}{IDENT_CHAR}* { return IDENT;       }


/****************************** Other *******************************************/

. { return BAD_CHARACTER; }
