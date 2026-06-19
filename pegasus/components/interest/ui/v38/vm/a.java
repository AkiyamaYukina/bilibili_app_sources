package com.bilibili.pegasus.components.interest.ui.v38.vm;

import com.bilibili.pegasus.data.interestchoose.InterestChooseItem;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v38/vm/a.class */
public final class a<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t8) {
        return ComparisonsKt.compareValues(Integer.valueOf(((InterestChooseItem) t8).getDefaultSelected()), Integer.valueOf(((InterestChooseItem) t7).getDefaultSelected()));
    }
}
