package org.snlab;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Map;

/**
 * Created by lovingyoung on 12/28/16.
 */
public class YangColorSettingsPage implements ColorSettingsPage {
    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            new AttributesDescriptor("Illegal", YangSyntaxHighlighter.ILLEGAL),
            new AttributesDescriptor("Comment", YangSyntaxHighlighter.COMMENT),
            new AttributesDescriptor("String", YangSyntaxHighlighter.STRING),
            new AttributesDescriptor("Keyword", YangSyntaxHighlighter.KEYWORD),
            new AttributesDescriptor("Braces", YangSyntaxHighlighter.BRACES),
            new AttributesDescriptor("Operator & Sign", YangSyntaxHighlighter.OP_SIGN),
            new AttributesDescriptor("Semicolon", YangSyntaxHighlighter.SEMICOLON),
            new AttributesDescriptor("Unknown", YangSyntaxHighlighter.UNKNOWN)
    };


    @Nullable
    @Override
    public Icon getIcon() {
        return YangIcons.FILE;
    }

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new YangSyntaxHighlighter();
    }

    @NotNull
    @Override
    public String getDemoText() {
        return "";
    }

    @Nullable
    @Override
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @NotNull
    @Override
    public AttributesDescriptor[] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @NotNull
    @Override
    public ColorDescriptor[] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "Yang";
    }
}
