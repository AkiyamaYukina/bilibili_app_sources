package com.bilibili.ship.theseus.united.page.videolist;

import com.bilibili.ship.theseus.united.page.videolist.VideoSelectListViewKt$combineSelectListView$2;
import com.bilibili.ship.theseus.united.page.videolist.m;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videolist/n.class */
public final /* synthetic */ class n implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ref.BooleanRef f103634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MutableStateFlow f103635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m.a f103636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Function1 f103637d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f103638e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Function1 f103639f;

    public /* synthetic */ n(Ref.BooleanRef booleanRef, MutableStateFlow mutableStateFlow, m.a aVar, Function1 function1, List list, Function1 function12) {
        this.f103634a = booleanRef;
        this.f103635b = mutableStateFlow;
        this.f103636c = aVar;
        this.f103637d = function1;
        this.f103638e = list;
        this.f103639f = function12;
    }

    public final Object invoke() {
        List list = this.f103638e;
        return VideoSelectListViewKt$combineSelectListView$2.AnonymousClass1.AnonymousClass4.invokeSuspend$lambda$1$0(this.f103634a, this.f103635b, this.f103636c, this.f103637d, list, this.f103639f);
    }
}
