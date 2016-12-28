package org.snlab.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.apache.log4j.SimpleLayout;
import org.jetbrains.annotations.NotNull;
import org.snlab.YangFileType;
import org.snlab.YangLanguage;

import javax.swing.*;

/**
 * Created by lovingyoung on 12/28/16.
 */
public class YangFile extends PsiFileBase{
    public YangFile(@NotNull FileViewProvider viewProvider){
        super(viewProvider, YangLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return YangFileType.INSTANCE;
    }

    @Override
    public String toString(){
        return "Simple File";
    }

    @Override
    public Icon getIcon(int flags){
        return super.getIcon(flags);
    }
}
