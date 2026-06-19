package com.bilibili.ship.theseus.united.page.intro.module.owner;

import Pb.F;
import Pb.G;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.viewbinding.ViewBinding;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blconfig.Contract;
import com.bilibili.lib.ghost.api.Invocation;
import com.bilibili.lib.ghost.api.InvocationCategory;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.playerbizcommonv2.guideBubble.BiliGuideBubble;
import com.bilibili.ship.theseus.united.page.intro.module.owner.OwnerService;
import dv0.Z;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/owner/OwnerComponent.class */
@StabilityInferred(parameters = 0)
public final class OwnerComponent extends com.bilibili.app.gemini.ui.m<Z> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final OwnerService.b f100597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final StateFlow<Integer> f100598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screensize.a f100599c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public PopupWindow f100602f;

    @Nullable
    public BiliGuideBubble h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Unit> f100600d = SharedFlowKt.MutableSharedFlow$default(0, 1, BufferOverflow.DROP_LATEST, 1, (Object) null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ExposureEntry f100601e = new ExposureEntry(com.bilibili.ship.theseus.united.page.report.a.f102493a, new EL.b(this, 2));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final b f100603g = new Runnable(this) { // from class: com.bilibili.ship.theseus.united.page.intro.module.owner.b

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OwnerComponent f100645a;

        {
            this.f100645a = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            PopupWindow popupWindow = this.f100645a.f100602f;
            if (popupWindow == null) {
                return;
            }
            try {
                if (popupWindow.isShowing()) {
                    OwnerComponent.d(popupWindow);
                }
            } catch (Exception e7) {
            }
        }
    };

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/owner/OwnerComponent$ChargeLayoutSlot.class */
    public static final class ChargeLayoutSlot {
        private static final EnumEntries $ENTRIES;
        private static final ChargeLayoutSlot[] $VALUES;
        public static final ChargeLayoutSlot Icon = new ChargeLayoutSlot("Icon", 0);
        public static final ChargeLayoutSlot Text = new ChargeLayoutSlot("Text", 1);

        private static final /* synthetic */ ChargeLayoutSlot[] $values() {
            return new ChargeLayoutSlot[]{Icon, Text};
        }

        static {
            ChargeLayoutSlot[] chargeLayoutSlotArr$values = $values();
            $VALUES = chargeLayoutSlotArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(chargeLayoutSlotArr$values);
        }

        private ChargeLayoutSlot(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<ChargeLayoutSlot> getEntries() {
            return $ENTRIES;
        }

        public static ChargeLayoutSlot valueOf(String str) {
            return (ChargeLayoutSlot) Enum.valueOf(ChargeLayoutSlot.class, str);
        }

        public static ChargeLayoutSlot[] values() {
            return (ChargeLayoutSlot[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [com.bilibili.ship.theseus.united.page.intro.module.owner.b] */
    public OwnerComponent(@NotNull OwnerService.b bVar, @NotNull StateFlow stateFlow, @NotNull com.bilibili.ship.theseus.united.page.screensize.a aVar) {
        this.f100597a = bVar;
        this.f100598b = stateFlow;
        this.f100599c = aVar;
    }

    @Invocation(category = InvocationCategory.INVOKE_NONE_STATIC, name = "dismiss", owner = {"android.widget.PopupWindow"}, scope = {})
    public static void d(@NotNull Object obj) {
        Contract contractAb = ConfigManager.Companion.ab();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.areEqual(contractAb.get("bgthread_ui_access_detect_enable", bool), bool)) {
            Thread threadCurrentThread = Thread.currentThread();
            if (!androidx.appcompat.app.n.a(threadCurrentThread)) {
                IllegalStateException illegalStateException = new IllegalStateException(F.b("PopupWindow.dismiss() called from non-UI thread: ", threadCurrentThread, ", 请联系 Jackin"));
                Neurons.trackT(false, "app.bgthread.ui.access", MapsKt.mapOf(new Pair[]{TuplesKt.to("stacktrace", G.b("PopupWindow.dismiss() called from non-UI thread: ", threadCurrentThread, "BgThreadUIAccess", illegalStateException, illegalStateException)), TuplesKt.to("threadName", threadCurrentThread.getName())}), 1, new AT0.c(8));
            }
        }
        ((PopupWindow) obj).dismiss();
    }

    public static final int e(OwnerComponent ownerComponent, View view) {
        int i7;
        ownerComponent.getClass();
        int iIntValue = 0;
        if (view.getVisibility() == 8) {
            i7 = 0;
        } else {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            int marginEnd = marginLayoutParams != null ? MarginLayoutParamsCompat.getMarginEnd(marginLayoutParams) + MarginLayoutParamsCompat.getMarginStart(marginLayoutParams) : 0;
            int measuredWidth = view.getMeasuredWidth();
            Integer numValueOf = Integer.valueOf(measuredWidth);
            if (measuredWidth <= 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            } else {
                int i8 = view.getLayoutParams().width;
                Integer numValueOf2 = null;
                if (i8 > 0) {
                    numValueOf2 = Integer.valueOf(i8);
                }
                if (numValueOf2 != null) {
                    iIntValue = numValueOf2.intValue();
                }
            }
            i7 = iIntValue + marginEnd;
        }
        return i7;
    }

    public static final void f(Z z6, OwnerComponent ownerComponent) {
        com.bilibili.ship.theseus.united.page.screensize.a aVar = ownerComponent.f100599c;
        if (aVar.i() || aVar.f()) {
            z6.f116877g.setMaxWidth(Integer.MAX_VALUE);
            return;
        }
        ConstraintLayout constraintLayout = z6.f116871a;
        if (!constraintLayout.isLaidOut() || constraintLayout.isLayoutRequested()) {
            constraintLayout.addOnLayoutChangeListener(new q(z6, ownerComponent));
            return;
        }
        ConstraintLayout constraintLayout2 = z6.f116871a;
        int width = constraintLayout2.getWidth();
        int paddingRight = constraintLayout2.getPaddingRight();
        int iE = e(ownerComponent, z6.f116878i);
        int iE2 = e(ownerComponent, z6.f116880k);
        int iE3 = e(ownerComponent, z6.f116875e);
        z6.f116877g.setMaxWidth(RangesKt.coerceAtLeast(((width - paddingRight) - z6.f116876f.getLeft()) - (iE3 + (iE2 + iE)), 0));
    }

    public static final void g(OwnerComponent ownerComponent, BiliImageView biliImageView, boolean z6, com.bilibili.ship.theseus.united.page.view.j jVar) {
        ownerComponent.getClass();
        if (jVar == null || z6) {
            biliImageView.setVisibility(8);
            return;
        }
        if (jVar.f104093a) {
            String str = jVar.f104094b;
            if (!StringsKt.isBlank(str) && !jVar.f104095c) {
                BiliImageLoader.INSTANCE.with(biliImageView.getContext()).url(str).into(biliImageView);
                biliImageView.setVisibility(0);
                return;
            }
        }
        biliImageView.setVisibility(8);
    }

    public final ViewBinding b(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return Z.inflate(layoutInflater, viewGroup, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x014c  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(final java.lang.String r11, final java.lang.String r12, final androidx.compose.runtime.internal.ComposableLambda r13, final androidx.compose.ui.Modifier r14, androidx.compose.runtime.Composer r15, final int r16) {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.module.owner.OwnerComponent.c(java.lang.String, java.lang.String, androidx.compose.runtime.internal.ComposableLambda, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull dv0.Z r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r8) throws kotlin.KotlinNothingValueException {
        /*
            r6 = this;
            r0 = r8
            boolean r0 = r0 instanceof com.bilibili.ship.theseus.united.page.intro.module.owner.OwnerComponent$bind$1
            if (r0 == 0) goto L2b
            r0 = r8
            com.bilibili.ship.theseus.united.page.intro.module.owner.OwnerComponent$bind$1 r0 = (com.bilibili.ship.theseus.united.page.intro.module.owner.OwnerComponent$bind$1) r0
            r10 = r0
            r0 = r10
            int r0 = r0.label
            r9 = r0
            r0 = r9
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2b
            r0 = r10
            r1 = r9
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r10
            r8 = r0
            goto L35
        L2b:
            com.bilibili.ship.theseus.united.page.intro.module.owner.OwnerComponent$bind$1 r0 = new com.bilibili.ship.theseus.united.page.intro.module.owner.OwnerComponent$bind$1
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            r8 = r0
        L35:
            r0 = r8
            java.lang.Object r0 = r0.result
            r11 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r10 = r0
            r0 = r8
            int r0 = r0.label
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L61
            r0 = r9
            r1 = 1
            if (r0 == r1) goto L59
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L59:
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)
            goto L83
        L61:
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)
            com.bilibili.ship.theseus.united.page.intro.module.owner.OwnerComponent$bind$2 r0 = new com.bilibili.ship.theseus.united.page.intro.module.owner.OwnerComponent$bind$2
            r1 = r0
            r2 = r7
            r3 = r6
            r4 = 0
            r1.<init>(r2, r3, r4)
            r7 = r0
            r0 = r8
            r1 = 1
            r0.label = r1
            r0 = r7
            r1 = r8
            java.lang.Object r0 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r0, r1)
            r1 = r10
            if (r0 != r1) goto L83
            r0 = r10
            return r0
        L83:
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r1 = r0
            r1.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.module.owner.OwnerComponent.a(dv0.Z, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
