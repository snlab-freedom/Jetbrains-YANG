package org.snlab.psi;

import com.intellij.lang.Language;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.snlab.YangLanguage;

/**
 * Created by lovingyoung on 12/28/16.
 */
public class YangTokenType extends IElementType{
    public YangTokenType(@NotNull @NonNls String debugName){
        super(debugName, YangLanguage.INSTANCE);
    }

    @Override
    public String toString(){
        return "YangTokenType" + super.toString();
    }
}
