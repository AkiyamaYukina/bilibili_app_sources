package com.bilibili.studio.videoeditor.util;

import com.bilibili.lib.fasthybrid.provider.b;
import com.bilibili.studio.videoeditor.editor.editdata.EditTtsInfo;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/util/E.class */
public final class E implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f110200a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f110200a) {
            case 0:
                return ComparisonsKt.compareValues(Long.valueOf(((EditTtsInfo) obj).getInPoint()), Long.valueOf(((EditTtsInfo) obj2).getInPoint()));
            default:
                return ComparisonsKt.compareValues(Long.valueOf(((b.a) obj).b), Long.valueOf(((b.a) obj2).b));
        }
    }
}
