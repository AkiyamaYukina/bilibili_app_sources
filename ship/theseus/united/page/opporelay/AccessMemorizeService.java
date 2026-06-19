package com.bilibili.ship.theseus.united.page.opporelay;

import androidx.activity.ComponentActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Lifecycle;
import com.bapis.bilibili.app.viewunite.v1.IntroductionTab;
import com.bilibili.lib.accessbridge.c;
import com.bilibili.ship.theseus.keel.player.h;
import com.bilibili.ship.theseus.united.di.BusinessType;
import com.bilibili.ship.theseus.united.page.toolbar.j;
import com.bilibili.ship.theseus.united.page.view.RelationRepository;
import com.bilibili.ship.theseus.united.page.view.d;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.inject.Inject;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import lv0.C7893a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/opporelay/AccessMemorizeService.class */
@StabilityInferred(parameters = 0)
public final class AccessMemorizeService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f102118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ComponentActivity f102119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final BusinessType f102120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.a f102121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final d f102122e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final h f102123f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final C7893a f102124g;

    @NotNull
    public final RelationRepository h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final IntroductionTab f102125i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final j f102126j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final b f102127k;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/opporelay/AccessMemorizeService$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f102128a;

        static {
            int[] iArr = new int[BusinessType.values().length];
            try {
                iArr[BusinessType.UGC.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[BusinessType.OGV.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[BusinessType.CHEESE.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f102128a = iArr;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/opporelay/AccessMemorizeService$b.class */
    public static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Lifecycle f102129a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AccessMemorizeService f102130b;

        public b(AccessMemorizeService accessMemorizeService) {
            this.f102130b = accessMemorizeService;
            this.f102129a = accessMemorizeService.f102119b.getLifecycle();
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        /* JADX WARN: Removed duplicated region for block: B:76:0x021d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final android.os.Bundle a() throws kotlin.NoWhenBranchMatchedException {
            /*
                Method dump skipped, instruction units count: 720
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.opporelay.AccessMemorizeService.b.a():android.os.Bundle");
        }

        public final Lifecycle getLifecycle() {
            return this.f102129a;
        }
    }

    @Inject
    public AccessMemorizeService(@NotNull CoroutineScope coroutineScope, @NotNull ComponentActivity componentActivity, @NotNull BusinessType businessType, @NotNull com.bilibili.ship.theseus.united.page.view.a aVar, @NotNull d dVar, @NotNull h hVar, @NotNull C7893a c7893a, @NotNull RelationRepository relationRepository, @Nullable IntroductionTab introductionTab, @NotNull j jVar) {
        this.f102118a = coroutineScope;
        this.f102119b = componentActivity;
        this.f102120c = businessType;
        this.f102121d = aVar;
        this.f102122e = dVar;
        this.f102123f = hVar;
        this.f102124g = c7893a;
        this.h = relationRepository;
        this.f102125i = introductionTab;
        this.f102126j = jVar;
        b bVar = new b(this);
        this.f102127k = bVar;
        ((CopyOnWriteArrayList) com.bilibili.lib.accessbridge.d.a).add(bVar);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AccessMemorizeService$special$$inlined$awaitCancel$1(null, this), 3, (Object) null);
    }
}
