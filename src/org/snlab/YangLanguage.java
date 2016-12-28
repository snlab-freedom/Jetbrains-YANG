package org.snlab;

import com.intellij.lang.Language;

public class YangLanguage extends Language {
  public static final YangLanguage INSTANCE = new YangLanguage();

  private YangLanguage() {
    super("Yang");
  }
}
