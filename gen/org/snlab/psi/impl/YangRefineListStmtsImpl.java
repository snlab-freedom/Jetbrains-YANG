// This is a generated file. Not intended for manual editing.
package org.snlab.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.snlab.psi.YangTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.snlab.psi.*;

public class YangRefineListStmtsImpl extends ASTWrapperPsiElement implements YangRefineListStmts {

  public YangRefineListStmtsImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull YangVisitor visitor) {
    visitor.visitRefineListStmts(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YangVisitor) accept((YangVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<YangConfigStmt> getConfigStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangConfigStmt.class);
  }

  @Override
  @NotNull
  public List<YangDescriptionStmt> getDescriptionStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangDescriptionStmt.class);
  }

  @Override
  @NotNull
  public List<YangIdentifierStmt> getIdentifierStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangIdentifierStmt.class);
  }

  @Override
  @NotNull
  public List<YangMaxElementsStmt> getMaxElementsStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangMaxElementsStmt.class);
  }

  @Override
  @NotNull
  public List<YangMinElementsStmt> getMinElementsStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangMinElementsStmt.class);
  }

  @Override
  @NotNull
  public List<YangMustStmt> getMustStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangMustStmt.class);
  }

  @Override
  @NotNull
  public List<YangReferenceStmt> getReferenceStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangReferenceStmt.class);
  }

}
