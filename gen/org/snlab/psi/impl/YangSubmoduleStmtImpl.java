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

public class YangSubmoduleStmtImpl extends ASTWrapperPsiElement implements YangSubmoduleStmt {

  public YangSubmoduleStmtImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull YangVisitor visitor) {
    visitor.visitSubmoduleStmt(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YangVisitor) accept((YangVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public YangBodyStmts getBodyStmts() {
    return findNotNullChildByClass(YangBodyStmts.class);
  }

  @Override
  @NotNull
  public YangLinkageStmts getLinkageStmts() {
    return findNotNullChildByClass(YangLinkageStmts.class);
  }

  @Override
  @NotNull
  public YangMetaStmts getMetaStmts() {
    return findNotNullChildByClass(YangMetaStmts.class);
  }

  @Override
  @NotNull
  public YangRevisionStmts getRevisionStmts() {
    return findNotNullChildByClass(YangRevisionStmts.class);
  }

  @Override
  @NotNull
  public YangString getString() {
    return findNotNullChildByClass(YangString.class);
  }

  @Override
  @NotNull
  public YangSubmoduleHeaderStmts getSubmoduleHeaderStmts() {
    return findNotNullChildByClass(YangSubmoduleHeaderStmts.class);
  }

}
