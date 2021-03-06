/*
 * Zyonic Software - 2020 - Tobias Rempe
 * This File, its contents and by extention the corresponding project may be used freely in compliance with the Apache 2.0 License.
 *
 * tobiasrempe@zyonicsoftware.com
 */

package com.zyonicsoftware.maddox.core.language;

import com.zyonicsoftware.maddox.core.main.Maddox;

public class LanguageLoader {

    private final Maddox maddox;
    private final LanguageConfigFileManager languageConfigFileManager;

    public LanguageLoader(final Maddox maddox) {
        this.maddox = maddox;
        this.languageConfigFileManager = new LanguageConfigFileManager();
    }

    public void initLanguages() {
        this.languageConfigFileManager.initLanguageConfig(this.maddox);
    }


}
