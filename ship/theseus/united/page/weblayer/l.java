package com.bilibili.ship.theseus.united.page.weblayer;

import android.content.Context;
import androidx.appcompat.widget.C3259x;
import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentManager;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.weblayer.TheseusV3WebRepository;
import com.google.common.collect.ImmutableSet;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/l.class */
@StabilityInferred(parameters = 0)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f104269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Context f104270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final FragmentManager f104271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.h f104272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final TheseusFloatLayerService f104273e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.activitywindow.l f104274f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screensize.a f104275g;

    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final BackActionRepository f104276i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final TheseusV3WebRepository f104277j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final ImmutableSet f104278k;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/l$a.class */
    public interface a {

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.weblayer.l$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/l$a$a.class */
        @StabilityInferred(parameters = 1)
        public static final class C1159a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C1159a f104279a = new Object();

            public final boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof C1159a);
            }

            public final int hashCode() {
                return 1647422373;
            }

            @NotNull
            public final String toString() {
                return "AutoHeight";
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/l$a$b.class */
        @StabilityInferred(parameters = 1)
        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f104280a;

            public b(int i7) {
                this.f104280a = i7;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f104280a == ((b) obj).f104280a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f104280a);
            }

            @NotNull
            public final String toString() {
                return C4277b.a(this.f104280a, ")", new StringBuilder("FixedHeight(requestedHeightDp="));
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/l$b.class */
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f104281a;

        static {
            int[] iArr = new int[TheseusV3WebRepository.DisplayMode.values().length];
            try {
                iArr[TheseusV3WebRepository.DisplayMode.AUTO_HEIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[TheseusV3WebRepository.DisplayMode.FIXED_HEIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            f104281a = iArr;
        }
    }

    @Inject
    public l(@NotNull CoroutineScope coroutineScope, @NotNull Context context, @NotNull FragmentManager fragmentManager, @NotNull com.bilibili.ship.theseus.keel.player.h hVar, @NotNull TheseusFloatLayerService theseusFloatLayerService, @NotNull com.bilibili.ship.theseus.united.page.activitywindow.l lVar, @NotNull com.bilibili.ship.theseus.united.page.screensize.a aVar, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar, @NotNull BackActionRepository backActionRepository, @NotNull TheseusV3WebRepository theseusV3WebRepository, @NotNull ImmutableSet immutableSet) {
        this.f104269a = coroutineScope;
        this.f104270b = context;
        this.f104271c = fragmentManager;
        this.f104272d = hVar;
        this.f104273e = theseusFloatLayerService;
        this.f104274f = lVar;
        this.f104275g = aVar;
        this.h = cVar;
        this.f104276i = backActionRepository;
        this.f104277j = theseusV3WebRepository;
        this.f104278k = immutableSet;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new TheseusV3WebService$1(this, null), 3, (Object) null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.bilibili.ship.theseus.united.page.weblayer.l r6, com.bilibili.playerbizcommonv2.web.PlayerV3WebGeneralUIComponent r7, com.bilibili.ship.theseus.united.page.weblayer.l.a r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.weblayer.l.a(com.bilibili.ship.theseus.united.page.weblayer.l, com.bilibili.playerbizcommonv2.web.PlayerV3WebGeneralUIComponent, com.bilibili.ship.theseus.united.page.weblayer.l$a, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(final com.bilibili.ship.theseus.united.page.weblayer.l r26, final com.bilibili.ship.theseus.united.page.weblayer.TheseusV3WebRepository.b r27, kotlin.coroutines.jvm.internal.ContinuationImpl r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1952
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.weblayer.l.b(com.bilibili.ship.theseus.united.page.weblayer.l, com.bilibili.ship.theseus.united.page.weblayer.TheseusV3WebRepository$b, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static String c(a aVar) throws NoWhenBranchMatchedException {
        String strA;
        if (Intrinsics.areEqual(aVar, a.C1159a.f104279a)) {
            strA = "auto_height";
        } else {
            if (!(aVar instanceof a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            strA = C3259x.a(((a.b) aVar).f104280a, "fixed_height requestedHeightDp=");
        }
        return strA;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final int d(a aVar, WindowSizeClass windowSizeClass) throws NoWhenBranchMatchedException {
        int iCoerceIn;
        int minHeightDp = windowSizeClass.getMinHeightDp();
        if (Intrinsics.areEqual(aVar, a.C1159a.f104279a)) {
            iCoerceIn = RangesKt.coerceIn(com.bilibili.ship.theseus.united.page.screensize.b.d(windowSizeClass) ? MathKt.roundToInt(windowSizeClass.getMinWidthDp() / 1.7777778f) : this.f104275g.a(windowSizeClass), 0, minHeightDp);
        } else {
            if (!(aVar instanceof a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            iCoerceIn = 0;
        }
        return DimenUtilsKt.dpToPx(RangesKt.coerceIn(iCoerceIn, 0, minHeightDp));
    }
}
