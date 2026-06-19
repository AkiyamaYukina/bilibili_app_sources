package com.bilibili.ogv.kmm.operation.vippreview;

import bl0.InterfaceC5118d;
import com.bilibili.ogv.kmm.operation.vippreview.VipOfflinePreviewActiveCard;
import com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.C6542t;
import fk0.C7119c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/vippreview/b.class */
public final class b implements bl0.f<VipOfflinePreviewActiveCard> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KClass<VipOfflinePreviewActiveCard> f68919a = Reflection.getOrCreateKotlinClass(VipOfflinePreviewActiveCard.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C8011b f68920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C7119c f68921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.bilibili.ogv.kmm.operation.reservation.b f68922d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/vippreview/b$a.class */
    public static final class a implements Function1<KomponentScope<? super Object>, SetContentResult> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC5118d f68923a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C8011b f68924b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C7119c f68925c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final com.bilibili.ogv.kmm.operation.reservation.b f68926d;

        public a(InterfaceC5118d interfaceC5118d, C8011b c8011b, C7119c c7119c, com.bilibili.ogv.kmm.operation.reservation.b bVar) {
            this.f68923a = interfaceC5118d;
            this.f68924b = c8011b;
            this.f68925c = c7119c;
            this.f68926d = bVar;
        }

        public final Object invoke(Object obj) {
            KomponentScope komponentScope = (KomponentScope) obj;
            VipOfflinePreviewActiveCard vipOfflinePreviewActiveCard = (VipOfflinePreviewActiveCard) this.f68923a;
            C8011b c8011b = this.f68924b;
            C6542t c6542t = new C6542t(this.f68925c, c8011b.a(komponentScope, vipOfflinePreviewActiveCard, null), vipOfflinePreviewActiveCard.f68882a.f68907g, komponentScope, true);
            List<VipOfflinePreviewActiveCard.c> list = vipOfflinePreviewActiveCard.f68882a.f68901a;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new i((VipOfflinePreviewActiveCard.c) it.next(), c8011b, komponentScope, this.f68926d));
            }
            return komponentScope.__setContent(new j(Unit.INSTANCE, komponentScope.getContext(), komponentScope, vipOfflinePreviewActiveCard, c6542t, arrayList));
        }
    }

    public b(C8011b c8011b, C7119c c7119c, com.bilibili.ogv.kmm.operation.reservation.b bVar) {
        this.f68920b = c8011b;
        this.f68921c = c7119c;
        this.f68922d = bVar;
    }

    @Override // bl0.f
    public final Komponent<Object> a(VipOfflinePreviewActiveCard vipOfflinePreviewActiveCard) {
        return KomponentKt.Komponent(new a(vipOfflinePreviewActiveCard, this.f68920b, this.f68921c, this.f68922d));
    }

    @Override // bl0.f
    public final KClass<VipOfflinePreviewActiveCard> getModuleType() {
        return this.f68919a;
    }
}
