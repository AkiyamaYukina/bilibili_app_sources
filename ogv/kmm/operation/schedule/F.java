package com.bilibili.ogv.kmm.operation.schedule;

import A90.W;
import bl0.InterfaceC5118d;
import com.bilibili.biligame.ui.gamelist.m0;
import com.bilibili.ogv.kmm.operation.schedule.UpcomingScheduleCard;
import java.util.ArrayList;
import java.util.List;
import kntr.common.komponent.Komponent;
import kntr.common.komponent.KomponentKt;
import kntr.common.komponent.KomponentScope;
import kntr.common.komponent.SetContentResult;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import ml0.C8011b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/schedule/F.class */
public final class F implements bl0.f<UpcomingScheduleCard> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KClass<UpcomingScheduleCard> f68708a = Reflection.getOrCreateKotlinClass(UpcomingScheduleCard.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f68709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C8011b f68710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f68711d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f68712e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/schedule/F$a.class */
    public static final class a implements Function1<KomponentScope<? super Object>, SetContentResult> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC5118d f68713a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C8011b f68714b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final t f68715c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final l f68716d;

        public a(InterfaceC5118d interfaceC5118d, v vVar, C8011b c8011b, t tVar, l lVar) {
            this.f68713a = interfaceC5118d;
            this.f68714b = c8011b;
            this.f68715c = tVar;
            this.f68716d = lVar;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
            w wVar;
            KomponentScope komponentScope = (KomponentScope) obj;
            List<UpcomingScheduleCard.SubModule> list = ((UpcomingScheduleCard) this.f68713a).f68730a.f68747a;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (UpcomingScheduleCard.SubModule subModule : list) {
                boolean z6 = subModule instanceof UpcomingScheduleCard.SubModule.b;
                C8011b c8011b = this.f68714b;
                if (z6) {
                    wVar = new w(subModule, c8011b.a(komponentScope, subModule, null), komponentScope.embed(KomponentKt.Komponent(new W(1, ((UpcomingScheduleCard.SubModule.b) subModule).f68741g, this.f68715c))));
                } else {
                    if (!(subModule instanceof UpcomingScheduleCard.SubModule.Schedule)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    wVar = new w(subModule, c8011b.a(komponentScope, subModule, null), komponentScope.embed(KomponentKt.Komponent(new m0(1, ((UpcomingScheduleCard.SubModule.Schedule) subModule).f68738g, this.f68716d))));
                }
                arrayList.add(wVar);
            }
            return arrayList.isEmpty() ? komponentScope.__setContent(new G(Unit.INSTANCE, komponentScope.getContext(), komponentScope)) : komponentScope.__setContent(new H(Unit.INSTANCE, komponentScope.getContext(), komponentScope, arrayList, new u()));
        }
    }

    public F(v vVar, C8011b c8011b, t tVar, l lVar) {
        this.f68709b = vVar;
        this.f68710c = c8011b;
        this.f68711d = tVar;
        this.f68712e = lVar;
    }

    @Override // bl0.f
    public final Komponent<Object> a(UpcomingScheduleCard upcomingScheduleCard) {
        return KomponentKt.Komponent(new a(upcomingScheduleCard, this.f68709b, this.f68710c, this.f68711d, this.f68712e));
    }

    @Override // bl0.f
    public final KClass<UpcomingScheduleCard> getModuleType() {
        return this.f68708a;
    }
}
