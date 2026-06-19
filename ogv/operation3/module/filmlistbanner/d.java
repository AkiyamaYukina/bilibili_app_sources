package com.bilibili.ogv.operation3.module.filmlistbanner;

import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.foundation.text.contextmenu.internal.J;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import bl0.InterfaceC5118d;
import com.bilibili.ogv.operation3.module.filmlistbanner.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kntr.base.log.KLog_androidKt;
import kntr.common.komponent.Komponent;
import kntr.common.komponent.KomponentKt;
import kntr.common.komponent.KomponentScope;
import kntr.common.komponent.SetContentResult;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import ml0.C8011b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/filmlistbanner/d.class */
public final class d implements bl0.f<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KClass<c> f71276a = Reflection.getOrCreateKotlinClass(c.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C8011b f71277b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/filmlistbanner/d$a.class */
    public static final class a implements Function1<KomponentScope<? super Object>, SetContentResult> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC5118d f71278a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C8011b f71279b;

        public a(InterfaceC5118d interfaceC5118d, C8011b c8011b) {
            this.f71278a = interfaceC5118d;
            this.f71279b = c8011b;
        }

        public final Object invoke(Object obj) {
            SetContentResult setContentResult__setContent;
            KomponentScope komponentScope = (KomponentScope) obj;
            List<c.C0444c> list = ((c) this.f71278a).f71267a.f28921a;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new f((c.C0444c) it.next(), this.f71279b, komponentScope));
            }
            int size = arrayList.size();
            if (size == 0) {
                KLog_androidKt.getKLog().e("FilmListHubBannerModuleSupport", "Data size is 0?");
                setContentResult__setContent = komponentScope.__setContent(new h(Unit.INSTANCE, komponentScope.getContext(), komponentScope));
            } else {
                float f7 = 12;
                Modifier modifierA = J.a(AspectRatioKt.aspectRatio$default(PaddingKt.m1345paddingqDBjuR0(Modifier.Companion, Dp.m3880constructorimpl(f7), Dp.m3880constructorimpl(f7), Dp.m3880constructorimpl(f7), Dp.m3880constructorimpl(2)), 3.0f, false, 2, null), 8);
                if (size == 1) {
                    setContentResult__setContent = komponentScope.__setContent(new i(Unit.INSTANCE, komponentScope.getContext(), komponentScope, (f) CollectionsKt.single(arrayList), modifierA));
                } else {
                    setContentResult__setContent = komponentScope.__setContent(new j(Unit.INSTANCE, komponentScope.getContext(), komponentScope, modifierA, PagerStateKt.PagerState$default(size * 5, 0.0f, new g(size), 2, null), size, arrayList));
                }
            }
            return setContentResult__setContent;
        }
    }

    public d(C8011b c8011b) {
        this.f71277b = c8011b;
    }

    @Override // bl0.f
    public final Komponent<Object> a(c cVar) {
        return KomponentKt.Komponent(new a(cVar, this.f71277b));
    }

    @Override // bl0.f
    public final KClass<c> getModuleType() {
        return this.f71276a;
    }
}
