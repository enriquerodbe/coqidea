package com.qq.coqide;

import com.intellij.lang.Language;

public class CoqLanguage extends Language {

    public static final CoqLanguage INSTANCE = new CoqLanguage();

    private CoqLanguage() {
        super("Coq");
    }
}
