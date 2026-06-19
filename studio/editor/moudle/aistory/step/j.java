package com.bilibili.studio.editor.moudle.aistory.step;

import java.util.Comparator;
import java.util.Map;
import kotlin.comparisons.ComparisonsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/aistory/step/j.class */
public final class j<T> implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f105764a;

    public j(Map map) {
        this.f105764a = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t8) {
        String str = (String) t7;
        Integer num = (Integer) this.f105764a.get(str);
        int iIntValue = 0;
        int iIntValue2 = num != null ? num.intValue() : 0;
        int length = str.length();
        String str2 = (String) t8;
        Integer num2 = (Integer) this.f105764a.get(str2);
        if (num2 != null) {
            iIntValue = num2.intValue();
        }
        return ComparisonsKt.compareValues(Integer.valueOf((iIntValue2 * 1000) - length), Integer.valueOf((iIntValue * 1000) - str2.length()));
    }
}
