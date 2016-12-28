package org.snlab;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.*;

import javax.swing.*;

public class YangFileType extends LanguageFileType {
  public static final YangFileType INSTANCE = new YangFileType();

  private YangFileType() {
    super(YangLanguage.INSTANCE);
  }

  @NotNull
  @Override
  public String getName() {
    return "Yang modeling file";
  }

  @NotNull
  @Override
  public String getDescription() {
    return "Yang modeling language. Please check RFC 6020";
  }

  @NotNull
  @Override
  public String getDefaultExtension() {
    return "yang";
  }

  @Nullable
  @Override
  public Icon getIcon() {
    return YangIcons.FILE;
  }
}
