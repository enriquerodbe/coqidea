package com.qq.coqide;

import com.intellij.lang.Language;

/**
 * User: enrique
 * Created: 8/14/13 10:39 PM
 */
public class CoqLanguage extends Language {

    public static final CoqLanguage INSTANCE = new CoqLanguage();

    private CoqLanguage() {
        super("Coq");
    }
}
