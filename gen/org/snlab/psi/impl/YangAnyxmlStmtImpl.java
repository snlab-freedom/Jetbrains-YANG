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

public class YangAnyxmlStmtImpl extends ASTWrapperPsiElement implements YangAnyxmlStmt {

  public YangAnyxmlStmtImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull YangVisitor visitor) {
    visitor.visitAnyxmlStmt(this);
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
  public List<YangIfFeatureStmt> getIfFeatureStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangIfFeatureStmt.class);
  }

  @Override
  @NotNull
  public List<YangMandatoryStmt> getMandatoryStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangMandatoryStmt.class);
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

  @Override
  @NotNull
  public List<YangStatusStmt> getStatusStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangStatusStmt.class);
  }

  @Override
  @NotNull
  public YangString getString() {
    return findNotNullChildByClass(YangString.class);
  }

  @Override
  @NotNull
  public List<YangWhenStmt> getWhenStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangWhenStmt.class);
  }

}
