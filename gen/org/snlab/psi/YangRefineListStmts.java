// This is a generated file. Not intended for manual editing.
package org.snlab.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YangRefineListStmts extends PsiElement {

  @NotNull
  List<YangConfigStmt> getConfigStmtList();

  @NotNull
  List<YangDescriptionStmt> getDescriptionStmtList();

  @NotNull
  List<YangIdentifierStmt> getIdentifierStmtList();

  @NotNull
  List<YangMaxElementsStmt> getMaxElementsStmtList();

  @NotNull
  List<YangMinElementsStmt> getMinElementsStmtList();

  @NotNull
  List<YangMustStmt> getMustStmtList();

  @NotNull
  List<YangReferenceStmt> getReferenceStmtList();

}
