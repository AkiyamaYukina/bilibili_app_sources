package com.bilibili.ogv.secondary.part;

import al0.C3231a;
import android.app.Activity;
import android.content.ContextWrapper;
import bl0.C5115a;
import bl0.InterfaceC5118d;
import com.bilibili.base.BiliContext;
import com.bilibili.bililive.infra.log.LiveLog;
import com.bilibili.bililive.infra.log.LiveLogDelegate;
import com.bilibili.ogv.secondary.part.InterfaceC5533c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kntr.common.komponent.KomponentKt;
import kntr.common.komponent.KomponentScope;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import ml0.C8011b;
import org.jetbrains.annotations.NotNull;
import rl0.f;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/part/O.class */
public final class O {
    @NotNull
    public static final List<z> a(@NotNull List<? extends InterfaceC5118d> list, @NotNull C5115a c5115a, @NotNull q qVar, @NotNull final Fl0.c cVar) {
        Object objListOf;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC5118d interfaceC5118d : list) {
            if (interfaceC5118d instanceof C3231a) {
                List<com.bilibili.ogv.operation3.module.operablecard.a> list2 = ((C3231a) interfaceC5118d).f31312a;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator<T> it = list2.iterator();
                while (true) {
                    objListOf = arrayList2;
                    if (it.hasNext()) {
                        arrayList2.add(new z(KomponentKt.Komponent(new com.bilibili.bililive.card.customlayout.f(1, (com.bilibili.ogv.operation3.module.operablecard.a) it.next(), qVar)), InterfaceC5533c.a.f72808a));
                    }
                }
            } else if (interfaceC5118d instanceof rl0.f) {
                List<f.c> list3 = ((rl0.f) interfaceC5118d).f126689a;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                Iterator<T> it2 = list3.iterator();
                while (true) {
                    objListOf = arrayList3;
                    if (it2.hasNext()) {
                        final int i7 = 0;
                        final f.c cVar2 = (f.c) it2.next();
                        arrayList3.add(new z(KomponentKt.Komponent(new Function1(i7, cVar, cVar2) { // from class: Fl0.a

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final int f6232a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final Object f6233b;

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            public final Object f6234c;

                            {
                                this.f6232a = i7;
                                this.f6233b = cVar;
                                this.f6234c = cVar2;
                            }

                            public final Object invoke(Object obj) {
                                String str;
                                Unit unit;
                                int i8;
                                switch (this.f6232a) {
                                    case 0:
                                        KomponentScope komponentScope = (KomponentScope) obj;
                                        C8011b c8011b = ((c) this.f6233b).f6243a;
                                        f.c cVar3 = (f.c) this.f6234c;
                                        return komponentScope.__setContent(new b(Unit.INSTANCE, komponentScope.getContext(), komponentScope, cVar3, c8011b.a(komponentScope, cVar3, null)));
                                    default:
                                        Pm.i iVar = (Pm.i) this.f6233b;
                                        Pm.t tVar = (Pm.t) this.f6234c;
                                        try {
                                            i8 = Integer.parseInt((String) obj);
                                        } catch (Exception e7) {
                                            LiveLog.Companion companion = LiveLog.Companion;
                                            tVar.getClass();
                                            if (companion.matchLevel(1)) {
                                                try {
                                                    str = "showInputPanel completeAction exception " + e7;
                                                } catch (Exception e8) {
                                                    BLog.e("LiveLog", "getLogMessage", e8);
                                                    str = null;
                                                }
                                                String str2 = str;
                                                if (str == null) {
                                                    str2 = "";
                                                }
                                                LiveLogDelegate logDelegate = companion.getLogDelegate();
                                                if (logDelegate != null) {
                                                    logDelegate.onLog(1, "LiveSendGiftBatchView", str2, (Throwable) null);
                                                }
                                                BLog.e("LiveSendGiftBatchView", str2);
                                            }
                                            break;
                                        }
                                        if (i8 <= 0) {
                                            unit = Unit.INSTANCE;
                                            return unit;
                                        }
                                        Activity activity = BiliContext.topActivity();
                                        ContextWrapper contextWrapperApplication = activity;
                                        if (activity == null) {
                                            contextWrapperApplication = BiliContext.application();
                                        }
                                        iVar.b = contextWrapperApplication.getResources().getQuantityString(2131689517, i8, Integer.valueOf(i8));
                                        iVar.a = i8;
                                        iVar.h = true;
                                        com.bilibili.bilibili.giftPanel.biz.batch.a aVar = tVar.u;
                                        aVar.notifyItemChanged(aVar.getItemCount() - 1);
                                        unit = Unit.INSTANCE;
                                        return unit;
                                }
                            }
                        }), InterfaceC5533c.C0460c.f72810a));
                    }
                }
            } else {
                objListOf = CollectionsKt.listOf(new z(c5115a.a(interfaceC5118d), InterfaceC5533c.d.f72811a));
            }
            CollectionsKt.addAll(arrayList, (Iterable) objListOf);
        }
        return arrayList;
    }
}
