package com.bilibili.playerbizcommonv2.danmaku.widget;

import android.content.Context;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import com.bilibili.droid.thread.HandlerThreads;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.danmaku.widget.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/widget/c.class */
public final /* synthetic */ class RunnableC5799c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f81626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f81627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f81628c;

    public /* synthetic */ RunnableC5799c(int i7, Object obj, Object obj2) {
        this.f81626a = i7;
        this.f81627b = obj;
        this.f81628c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list;
        switch (this.f81626a) {
            case 0:
                Context context = (Context) this.f81627b;
                e eVar = (e) this.f81628c;
                tv.danmaku.biliplayerv2.widget.function.danmaku.filter.f fVarG = tv.danmaku.biliplayerv2.widget.function.danmaku.filter.e.g(context);
                ArrayList arrayList = new ArrayList();
                if (fVarG != null && (list = fVarG.mKeywordItems) != null && (!list.isEmpty())) {
                    arrayList.addAll(fVarG.mKeywordItems);
                }
                eVar.i(arrayList);
                HandlerThreads.getHandler(0).post(new androidx.media3.exoplayer.video.o(eVar, 1));
                break;
            default:
                MutableIntState mutableIntState = (MutableIntState) this.f81627b;
                MutableState mutableState = (MutableState) this.f81628c;
                mutableIntState.setValue(mutableIntState.getValue().intValue() == 0 ? 1 : 0);
                mutableState.setValue(Boolean.TRUE);
                break;
        }
    }
}
