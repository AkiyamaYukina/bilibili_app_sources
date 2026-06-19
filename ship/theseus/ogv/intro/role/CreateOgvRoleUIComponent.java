package com.bilibili.ship.theseus.ogv.intro.role;

import android.content.Context;
import androidx.collection.ArrayMap;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.lib.accountinfo.model.OfficialVerify;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/role/CreateOgvRoleUIComponent.class */
@StabilityInferred(parameters = 0)
public final class CreateOgvRoleUIComponent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f93416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f93417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final TheseusFloatLayerService f93418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final BiliAccounts f93419d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final PageReportService f93420e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.playingarea.g f93421f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final IntroContentSizeRepository f93422g;

    @Inject
    public CreateOgvRoleUIComponent(@NotNull Context context, @NotNull CoroutineScope coroutineScope, @NotNull TheseusFloatLayerService theseusFloatLayerService, @NotNull BiliAccounts biliAccounts, @NotNull PageReportService pageReportService, @NotNull com.bilibili.ship.theseus.united.page.playingarea.g gVar, @NotNull IntroContentSizeRepository introContentSizeRepository) {
        this.f93416a = context;
        this.f93417b = coroutineScope;
        this.f93418c = theseusFloatLayerService;
        this.f93419d = biliAccounts;
        this.f93420e = pageReportService;
        this.f93421f = gVar;
        this.f93422g = introContentSizeRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.bilibili.ship.theseus.ogv.intro.role.CreateOgvRoleUIComponent r5, com.bilibili.community.follow.j r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.intro.role.CreateOgvRoleUIComponent.a(com.bilibili.ship.theseus.ogv.intro.role.CreateOgvRoleUIComponent, com.bilibili.community.follow.j, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [com.bilibili.ship.theseus.ogv.intro.role.c] */
    public final k b(final Role role, final boolean z6) {
        ExposureEntry exposureEntry = new ExposureEntry(com.bilibili.ship.theseus.united.report.a.f104837a, new Function0(this, role, z6) { // from class: com.bilibili.ship.theseus.ogv.intro.role.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f93449a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Role f93450b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final CreateOgvRoleUIComponent f93451c;

            {
                this.f93449a = z6;
                this.f93450b = role;
                this.f93451c = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invoke() {
                /*
                    r5 = this;
                    r0 = r5
                    boolean r0 = r0.f93449a
                    if (r0 == 0) goto Le
                    java.lang.String r0 = "united.player-video-detail.character_flow.section.show"
                    r11 = r0
                    goto L12
                Le:
                    java.lang.String r0 = "united.player-video-detail.character_lineup.icon.show"
                    r11 = r0
                L12:
                    androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
                    r1 = r0
                    r1.<init>()
                    r14 = r0
                    r0 = r5
                    com.bilibili.ship.theseus.ogv.intro.role.Role r0 = r0.f93450b
                    r13 = r0
                    r0 = r13
                    long r0 = r0.f93429b
                    r8 = r0
                    r0 = 0
                    r7 = r0
                    r0 = r5
                    com.bilibili.ship.theseus.ogv.intro.role.CreateOgvRoleUIComponent r0 = r0.f93451c
                    r12 = r0
                    r0 = r8
                    r1 = 0
                    int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                    if (r0 <= 0) goto L47
                    r0 = r12
                    com.bilibili.lib.accounts.BiliAccounts r0 = r0.f93419d
                    long r0 = r0.mid()
                    r1 = r8
                    int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                    if (r0 == 0) goto L4d
                    r0 = 1
                    r6 = r0
                    goto L4f
                L47:
                    r0 = r12
                    java.lang.Class r0 = r0.getClass()
                L4d:
                    r0 = 0
                    r6 = r0
                L4f:
                    r0 = r6
                    if (r0 != 0) goto L5a
                    java.lang.String r0 = "2"
                    r10 = r0
                    goto L8c
                L5a:
                    com.bilibili.community.follow.f r0 = com.bilibili.community.follow.f.a
                    r10 = r0
                    r0 = r8
                    com.bilibili.community.follow.f$a r0 = com.bilibili.community.follow.f.f(r0)
                    r10 = r0
                    com.bilibili.community.c r0 = com.bilibili.community.follow.f.c
                    r1 = r10
                    java.lang.Object r0 = r0.c(r1)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    r10 = r0
                    r0 = r10
                    if (r0 == 0) goto L7d
                    r0 = r10
                    boolean r0 = r0.booleanValue()
                    r7 = r0
                L7d:
                    r0 = r7
                    if (r0 == 0) goto L88
                    java.lang.String r0 = "1"
                    r10 = r0
                    goto L8c
                L88:
                    java.lang.String r0 = "0"
                    r10 = r0
                L8c:
                    r0 = r14
                    java.lang.String r1 = "follow"
                    r2 = r10
                    java.lang.Object r0 = r0.put(r1, r2)
                    r0 = r14
                    r1 = r13
                    java.util.Map<java.lang.String, java.lang.String> r1 = r1.f93435i
                    r0.putAll(r1)
                    r0 = r12
                    com.bilibili.ship.theseus.united.page.report.PageReportService r0 = r0.f93420e
                    r1 = r11
                    r2 = r14
                    r3 = 4
                    com.bilibili.ship.theseus.united.page.report.PageReportService.i(r0, r1, r2, r3)
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.intro.role.b.invoke():java.lang.Object");
            }
        });
        long j7 = role.f93429b;
        k kVar = new k(exposureEntry, new Function0(role, this) { // from class: com.bilibili.ship.theseus.ogv.intro.role.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Role f93452a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final CreateOgvRoleUIComponent f93453b;

            {
                this.f93452a = role;
                this.f93453b = this;
            }

            public final Object invoke() {
                Role role2 = this.f93452a;
                long j8 = role2.f93429b;
                com.bilibili.community.follow.f fVar = com.bilibili.community.follow.f.a;
                Boolean bool = (Boolean) com.bilibili.community.follow.f.c.c(com.bilibili.community.follow.f.f(j8));
                boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                ArrayMap arrayMap = new ArrayMap();
                arrayMap.put("follow", zBooleanValue ? "0" : "1");
                arrayMap.putAll(role2.f93435i);
                com.bilibili.community.follow.j jVar = new com.bilibili.community.follow.j(!zBooleanValue, j8, 140, "", (String) null, (Map) null, 112);
                CreateOgvRoleUIComponent createOgvRoleUIComponent = this.f93453b;
                BuildersKt.launch$default(createOgvRoleUIComponent.f93417b, (CoroutineContext) null, (CoroutineStart) null, new CreateOgvRoleUIComponent$buildRoleVm$vm$1$1(zBooleanValue, createOgvRoleUIComponent, jVar, arrayMap, null), 3, (Object) null);
                return Unit.INSTANCE;
            }
        }, new d(this, role, z6));
        kVar.f93485f.setValue(role.f93430c);
        kVar.f93484e.setValue(role.a());
        kVar.f93483d.setValue(role.f93431d);
        long j8 = role.f93429b;
        kVar.h.setValue(Boolean.valueOf(j8 > 0 && this.f93419d.mid() != j8));
        OfficialVerify officialVerifyC = role.c();
        Integer numValueOf = officialVerifyC != null ? Integer.valueOf(officialVerifyC.type) : null;
        kVar.f93487i.setValue((numValueOf != null && numValueOf.intValue() == 0) ? 2131234429 : (numValueOf != null && numValueOf.intValue() == 1) ? 2131234423 : null);
        BuildersKt.launch$default(this.f93417b, (CoroutineContext) null, (CoroutineStart) null, new CreateOgvRoleUIComponent$buildRoleVm$1(role, kVar, null), 3, (Object) null);
        return kVar;
    }

    @NotNull
    public final RunningUIComponent c(@NotNull final t tVar) {
        for (Role role : tVar.f93507c) {
            long j7 = role.f93429b;
            if (j7 > 0) {
                boolean zB = role.b();
                com.bilibili.community.follow.f fVar = com.bilibili.community.follow.f.a;
                com.bilibili.community.follow.f.g(j7, zB);
            }
        }
        e eVar = new e(new Function0(tVar, this) { // from class: com.bilibili.ship.theseus.ogv.intro.role.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final t f93447a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final CreateOgvRoleUIComponent f93448b;

            {
                this.f93447a = tVar;
                this.f93448b = this;
            }

            public final Object invoke() {
                t tVar2 = this.f93447a;
                if (tVar2.f93506b.length() > 0) {
                    CreateOgvRoleUIComponent createOgvRoleUIComponent = this.f93448b;
                    PageReportService.g(createOgvRoleUIComponent.f93420e, "united.player-video-detail.character_lineup.more.click", null, 6);
                    BuildersKt.launch$default(createOgvRoleUIComponent.f93417b, (CoroutineContext) null, (CoroutineStart) null, new CreateOgvRoleUIComponent$openRoleLayer$1(tVar2, createOgvRoleUIComponent, null), 3, (Object) null);
                }
                return Unit.INSTANCE;
            }
        });
        List<Role> list = tVar.f93507c;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(b((Role) it.next(), false));
        }
        eVar.f93460d.setValue(arrayList);
        eVar.f93459c.setValue(tVar.f93506b);
        eVar.f93458b.setValue(tVar.f93505a);
        return new RunningUIComponent(new j(eVar, new ExposureEntry(com.bilibili.ship.theseus.united.report.a.f104837a, new Zj0.h(this, 5))), 0, new CreateOgvRoleUIComponent$invoke$3(this, eVar, null), 2);
    }
}
