package org.snlab;

import com.intellij.lexer.FlexAdapter;
import com.intellij.lexer.FlexLexer;
import org.jetbrains.annotations.NotNull;

import java.io.Reader;

/**
 * Created by lovingyoung on 12/28/16.
 */

public class YangLexerAdapter extends FlexAdapter{

    public YangLexerAdapter() {
        super(new YangLexer((Reader) null));
    }
}
