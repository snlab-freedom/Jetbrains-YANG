// This is a generated file. Not intended for manual editing.
package org.snlab.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YangRangeStmt extends PsiElement {

  @NotNull
  List<YangDescriptionStmt> getDescriptionStmtList();

  @NotNull
  List<YangErrorAppTagStmt> getErrorAppTagStmtList();

  @NotNull
  List<YangErrorMessageStmt> getErrorMessageStmtList();

  @NotNull
  List<YangIdentifierStmt> getIdentifierStmtList();

  @NotNull
  List<YangReferenceStmt> getReferenceStmtList();

  @NotNull
  YangString getString();

}
