package com.bilibili.playset.playlist.edit;

import androidx.compose.ui.text.style.TextMotion;
import com.bilibili.playset.playlist.entity.SortRecord;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/edit/g.class */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f85307a;

    public final Object invoke(Object obj) {
        switch (this.f85307a) {
            case 0:
                return ((SortRecord) obj).toString();
            default:
                return new TextMotion.b(((Integer) obj).intValue());
        }
    }
}
