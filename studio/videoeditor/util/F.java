package com.bilibili.studio.videoeditor.util;

import com.bilibili.lib.fasthybrid.provider.b;
import com.bilibili.studio.videoeditor.editor.editdata.EditTtsInfo;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/util/F.class */
public final class F implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f110201a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f110201a) {
            case 0:
                return ComparisonsKt.compareValues(Long.valueOf(((EditTtsInfo) obj).getInPoint()), Long.valueOf(((EditTtsInfo) obj2).getInPoint()));
            default:
                return ComparisonsKt.compareValues(((b.a) obj).d, ((b.a) obj2).d);
        }
    }
}
