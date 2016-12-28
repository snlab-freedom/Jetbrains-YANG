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

public class YangRefinePomImpl extends ASTWrapperPsiElement implements YangRefinePom {

  public YangRefinePomImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull YangVisitor visitor) {
    visitor.visitRefinePom(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YangVisitor) accept((YangVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public YangRefineAnyxmlStmts getRefineAnyxmlStmts() {
    return findChildByClass(YangRefineAnyxmlStmts.class);
  }

  @Override
  @Nullable
  public YangRefineCaseStmts getRefineCaseStmts() {
    return findChildByClass(YangRefineCaseStmts.class);
  }

  @Override
  @Nullable
  public YangRefineChoiceStmts getRefineChoiceStmts() {
    return findChildByClass(YangRefineChoiceStmts.class);
  }

  @Override
  @Nullable
  public YangRefineContainerStmts getRefineContainerStmts() {
    return findChildByClass(YangRefineContainerStmts.class);
  }

  @Override
  @Nullable
  public YangRefineLeafListStmts getRefineLeafListStmts() {
    return findChildByClass(YangRefineLeafListStmts.class);
  }

  @Override
  @Nullable
  public YangRefineLeafStmts getRefineLeafStmts() {
    return findChildByClass(YangRefineLeafStmts.class);
  }

  @Override
  @Nullable
  public YangRefineListStmts getRefineListStmts() {
    return findChildByClass(YangRefineListStmts.class);
  }

}
