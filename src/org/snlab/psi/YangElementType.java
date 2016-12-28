package org.snlab.psi;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.snlab.YangLanguage;

/**
 * Created by lovingyoung on 12/28/16.
 */
public class YangElementType extends IElementType{
    public YangElementType(@NotNull @NonNls String debugName){
        super(debugName, YangLanguage.INSTANCE);
    }
}
