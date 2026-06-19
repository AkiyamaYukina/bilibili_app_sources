package com.bilibili.opd.app.bizcommon.ui.flexbox;

import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/ui/flexbox/a.class */
public interface a {
    int getAlignContent();

    int getAlignItems();

    int getChildHeightMeasureSpec(int i7, int i8, int i9);

    int getChildWidthMeasureSpec(int i7, int i8, int i9);

    int getDecorationLengthCrossAxis(View view);

    int getDecorationLengthMainAxis(View view, int i7, int i8);

    int getFlexDirection();

    View getFlexItemAt(int i7);

    int getFlexItemCount();

    List<b> getFlexLinesInternal();

    int getFlexWrap();

    int getLargestMainSize();

    int getMaxLine();

    int getPaddingBottom();

    int getPaddingEnd();

    int getPaddingLeft();

    int getPaddingRight();

    int getPaddingStart();

    int getPaddingTop();

    View getReorderedFlexItemAt(int i7);

    int getSumOfCrossSize();

    boolean isMainAxisDirectionHorizontal();

    void onNewFlexItemAdded(View view, int i7, int i8, b bVar);

    void onNewFlexLineAdded(b bVar);

    void setFlexLines(List<b> list);

    void updateViewCache(int i7, View view);
}
