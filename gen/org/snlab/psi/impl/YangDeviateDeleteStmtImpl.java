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

public class YangDeviateDeleteStmtImpl extends ASTWrapperPsiElement implements YangDeviateDeleteStmt {

  public YangDeviateDeleteStmtImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull YangVisitor visitor) {
    visitor.visitDeviateDeleteStmt(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YangVisitor) accept((YangVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<YangDefaultStmt> getDefaultStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangDefaultStmt.class);
  }

  @Override
  @NotNull
  public List<YangIdentifierStmt> getIdentifierStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangIdentifierStmt.class);
  }

  @Override
  @NotNull
  public List<YangMustStmt> getMustStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangMustStmt.class);
  }

  @Override
  @NotNull
  public YangString getString() {
    return findNotNullChildByClass(YangString.class);
  }

  @Override
  @NotNull
  public List<YangUniqueStmt> getUniqueStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangUniqueStmt.class);
  }

  @Override
  @NotNull
  public List<YangUnitsStmt> getUnitsStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangUnitsStmt.class);
  }

}
