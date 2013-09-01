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
FIRST_LETTER=[a-zA-Z_]
SUBSEQUENT_LETTER=[a-zA-Z0-9_']
COMMENT="(*" [^*] ~"*)" | "(*" "*"+ ")"
NUM=[0-9]+

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
"Let"         { return LET_UPPER;   }
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
"Prop"        { return PROP;        }
"return"      { return RETURN;      }
"Set"         { return SET;         }
"then"        { return THEN;        }
"Type"        { return TYPE;        }
"using"       { return USING;       }
"where"       { return WHERE;       }
"with"        { return WITH;        }


/****************************** Special tokens **********************************/

"!"     { return EXCLAMATION; }
"%"     { return PERCENT; }
"&"     { return AMPERSAND; }
"&&"    { return DOUBLE_AMPERSAND; }
"("     { return LEFT_PAREN; }
"()"    { return EMPTY_PAREN; }
")"     { return RIGHT_PAREN; }
"*"     { return ASTERISK; }
"+"     { return PLUS; }
"++"    { return DOUBLE_PLUS; }
","     { return COMMA; }
"-"     { return HYPHEN; }
"->"    { return RIGHT_SIMPLE_ARROW; }
"."     { return DOT;      }
".("    { return DOT_PAREN; }
".."    { return DOUBLE_DOT; }
"/"     { return SLASH; }
"/\"    { return AND; }
":"     { return COLON; }
"::"    { return DOUBLE_COLON; }
":<"    { return INCLUDED; } // TODO: Check this symbol meaning
":="    { return COLON_EQUAL; }
":>"    { return INCLUDES; } // TODO: Check this symbol meaning
";"     { return SEMICOLON; }
"<"     { return LESS; }
"<-"    { return LEFT_SIMPLE_ARROW; }
"<->"   { return IF_AND_ONLY_IF; }
"<:"    { return LESS_COLON; } // TODO: Check this symbol meaning
"<="    { return LESS_EQUAL; }
"<>"    { return DISTINCT; }
"="     { return EQUAL; }
"=>"    { return RIGHT_DOUBLE_ARROW; }
"=_D"   { return HAPPINESS; }
">"     { return GREATER; }
">->"   { return PATH; } // TODO: Check this symbol meaning
">="    { return GREATER_EQUAL; }
"?"     { return QUESTION; }
"?="    { return QUESTION_EQUAL; }
"@"     { return AT_SIGN; }
"["     { return LEFT_BRACKET; }
"\/"    { return OR; }
"]"     { return RIGHT_BRACKET; }
"^"     { return CARET; }
"{"     { return LEFT_BRACE; }
"|"     { return PIPE; }
"|-"    { return PIPE_HYPHEN; } // TODO: Check this symbol meaning
"||"    { return DOUBLE_PIPE; }
"}"     { return RIGHT_BRACE; }
"~"     { return EQUIVALENCY; }


/****************************** Literals ****************************************/

"-"?{NUM}+ { return INTEGER; }
\".*\"     { return STRING_LITERAL; }


/****************************** Composed tokens *********************************/

{BLANK}+                           { return WHITE_SPACE; }
{COMMENT}                          { return COMMENT;     }
{FIRST_LETTER}{SUBSEQUENT_LETTER}* { return IDENT;       }


/****************************** Other *******************************************/

. { return BAD_CHARACTER; }
