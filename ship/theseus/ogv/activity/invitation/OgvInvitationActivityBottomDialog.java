package com.bilibili.ship.theseus.ogv.activity.invitation;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.common.C4628q;
import com.bilibili.ad.adview.pegasus.holders.card41.k;
import com.bilibili.biligame.web2.m;
import com.bilibili.search2.api.SearchBangumiItem;
import com.bilibili.ship.theseus.ogv.activity.OgvActivityApiService;
import com.bilibili.ship.theseus.ogv.activity.OgvActivityService;
import com.bilibili.ship.theseus.ogv.activity.OgvActivityTextVo;
import com.bilibili.ship.theseus.ogv.activity.OgvInvitationActivityBackgroundVo;
import com.bilibili.ship.theseus.ogv.activity.OgvInvitationActivityForegroundVo;
import com.bilibili.ship.theseus.ogv.activity.OgvInvitationActivityHostVo;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import mv0.C8044b;
import org.jetbrains.annotations.NotNull;
import zu0.AbstractC9225e;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/invitation/OgvInvitationActivityBottomDialog.class */
@StabilityInferred(parameters = 0)
public final class OgvInvitationActivityBottomDialog extends Wj0.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final OgvInvitationActivityHostVo f91560k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f91561l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final OgvActivityService f91562m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final C8044b f91563n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f91564o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public e f91565p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f91566q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f91567r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ValueAnimator f91568s;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.activity.invitation.OgvInvitationActivityBottomDialog$dismiss$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/invitation/OgvInvitationActivityBottomDialog$dismiss$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final String $componentId;
        int label;
        final OgvInvitationActivityBottomDialog this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OgvInvitationActivityBottomDialog ogvInvitationActivityBottomDialog, String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ogvInvitationActivityBottomDialog;
            this.$componentId = str;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$componentId, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                OgvInvitationActivityBottomDialog ogvInvitationActivityBottomDialog = this.this$0;
                OgvActivityService ogvActivityService = ogvInvitationActivityBottomDialog.f91562m;
                OgvActivityApiService.Action action = OgvActivityApiService.Action.CLOSE;
                int i8 = ogvInvitationActivityBottomDialog.f91561l;
                String str = this.$componentId;
                this.label = 1;
                if (ogvActivityService.e(action, i8, str, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.activity.invitation.OgvInvitationActivityBottomDialog$setUiBeforeShow$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/invitation/OgvInvitationActivityBottomDialog$setUiBeforeShow$1.class */
    public static final class C61491 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OgvInvitationActivityBottomDialog this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C61491(OgvInvitationActivityBottomDialog ogvInvitationActivityBottomDialog, Continuation<? super C61491> continuation) {
            super(2, continuation);
            this.this$0 = ogvInvitationActivityBottomDialog;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C61491(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                OgvInvitationActivityBottomDialog ogvInvitationActivityBottomDialog = this.this$0;
                this.label = 1;
                if (OgvInvitationActivityBottomDialog.b(ogvInvitationActivityBottomDialog, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.activity.invitation.OgvInvitationActivityBottomDialog$show$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/invitation/OgvInvitationActivityBottomDialog$show$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OgvInvitationActivityBottomDialog this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(OgvInvitationActivityBottomDialog ogvInvitationActivityBottomDialog, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = ogvInvitationActivityBottomDialog;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                OgvInvitationActivityBottomDialog ogvInvitationActivityBottomDialog = this.this$0;
                OgvActivityService ogvActivityService = ogvInvitationActivityBottomDialog.f91562m;
                OgvActivityApiService.Action action = OgvActivityApiService.Action.EXPOSURE;
                int i8 = ogvInvitationActivityBottomDialog.f91561l;
                String str = ogvInvitationActivityBottomDialog.f91560k.b().f91456a;
                this.label = 1;
                if (ogvActivityService.e(action, i8, str, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public OgvInvitationActivityBottomDialog(@NotNull Context context, @NotNull OgvInvitationActivityHostVo ogvInvitationActivityHostVo, int i7, @NotNull OgvActivityService ogvActivityService, @NotNull C8044b c8044b, @NotNull CoroutineScope coroutineScope) {
        super(context);
        this.f91560k = ogvInvitationActivityHostVo;
        this.f91561l = i7;
        this.f91562m = ogvActivityService;
        this.f91563n = c8044b;
        this.f91564o = coroutineScope;
        boolean z6 = true;
        setCanceledOnTouchOutside(true);
        this.f91566q = CoroutineScopeKt.MainScope();
        this.f91567r = ogvInvitationActivityHostVo.b() != null ? false : z6;
        final ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this, valueAnimatorOfFloat) { // from class: com.bilibili.ship.theseus.ogv.activity.invitation.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final OgvInvitationActivityBottomDialog f91579a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final ValueAnimator f91580b;

            {
                this.f91579a = this;
                this.f91580b = valueAnimatorOfFloat;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                OgvInvitationActivityBottomDialog ogvInvitationActivityBottomDialog = this.f91579a;
                ValueAnimator valueAnimator2 = this.f91580b;
                e eVar = ogvInvitationActivityBottomDialog.f91565p;
                e eVar2 = eVar;
                if (eVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("vm");
                    eVar2 = null;
                }
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (fFloatValue != eVar2.f91596q) {
                    eVar2.f91596q = fFloatValue;
                    eVar2.notifyPropertyChanged(239);
                }
                valueAnimator2.setDuration(500L);
                valueAnimator2.setRepeatCount(0);
                e eVar3 = ogvInvitationActivityBottomDialog.f91565p;
                e eVar4 = eVar3;
                if (eVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("vm");
                    eVar4 = null;
                }
                if (eVar4.f91596q == 0.0f) {
                    e eVar5 = ogvInvitationActivityBottomDialog.f91565p;
                    if (eVar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("vm");
                        eVar5 = null;
                    }
                    if (eVar5.f91597r) {
                        eVar5.f91597r = false;
                        eVar5.notifyPropertyChanged(240);
                    }
                    ogvInvitationActivityBottomDialog.f91567r = true;
                }
            }
        });
        this.f91568s = valueAnimatorOfFloat;
    }

    public static void a(OgvInvitationActivityBottomDialog ogvInvitationActivityBottomDialog) {
        super.show();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x007e -> B:20:0x0084). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(com.bilibili.ship.theseus.ogv.activity.invitation.OgvInvitationActivityBottomDialog r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            Method dump skipped, instruction units count: 351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.activity.invitation.OgvInvitationActivityBottomDialog.b(com.bilibili.ship.theseus.ogv.activity.invitation.OgvInvitationActivityBottomDialog, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0030  */
    @Override // Wj0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void dismiss() {
        /*
            r9 = this;
            r0 = r9
            super.dismiss()
            r0 = r9
            android.animation.ValueAnimator r0 = r0.f91568s
            r0.cancel()
            r0 = r9
            kotlinx.coroutines.CoroutineScope r0 = r0.f91566q
            r1 = 0
            r2 = 1
            r3 = 0
            kotlinx.coroutines.CoroutineScopeKt.cancel$default(r0, r1, r2, r3)
            r0 = r9
            boolean r0 = r0.f91567r
            if (r0 == 0) goto L35
            r0 = r9
            com.bilibili.ship.theseus.ogv.activity.OgvInvitationActivityHostVo r0 = r0.f91560k
            com.bilibili.ship.theseus.ogv.activity.OgvInvitationActivityBackgroundVo r0 = r0.a()
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L30
            r0 = r10
            java.lang.String r0 = r0.c()
            r10 = r0
            goto L46
        L30:
            r0 = 0
            r10 = r0
            goto L46
        L35:
            r0 = r9
            com.bilibili.ship.theseus.ogv.activity.OgvInvitationActivityHostVo r0 = r0.f91560k
            com.bilibili.ship.theseus.ogv.activity.OgvInvitationActivityForegroundVo r0 = r0.b()
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L30
            r0 = r10
            java.lang.String r0 = r0.f91456a
            r10 = r0
        L46:
            r0 = r9
            kotlinx.coroutines.CoroutineScope r0 = r0.f91564o
            r1 = 0
            r2 = 0
            com.bilibili.ship.theseus.ogv.activity.invitation.OgvInvitationActivityBottomDialog$dismiss$1 r3 = new com.bilibili.ship.theseus.ogv.activity.invitation.OgvInvitationActivityBottomDialog$dismiss$1
            r4 = r3
            r5 = r9
            r6 = r10
            r7 = 0
            r4.<init>(r5, r6, r7)
            r4 = 3
            r5 = 0
            kotlinx.coroutines.Job r0 = kotlinx.coroutines.BuildersKt.launch$default(r0, r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.activity.invitation.OgvInvitationActivityBottomDialog.dismiss():void");
    }

    @Override // Wj0.d
    public final void onBackPressed() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final View onCreateView() {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        boolean z6 = false;
        AbstractC9225e abstractC9225eInflate = AbstractC9225e.inflate(LayoutInflater.from(getContext()), null, false);
        Context context = getContext();
        OgvInvitationActivityHostVo ogvInvitationActivityHostVo = this.f91560k;
        e eVar = new e(ogvInvitationActivityHostVo, this.f91563n);
        if (ogvInvitationActivityHostVo.b() != null) {
            z6 = true;
        }
        if (z6 != eVar.f91597r) {
            eVar.f91597r = z6;
            eVar.notifyPropertyChanged(240);
        }
        OgvInvitationActivityForegroundVo ogvInvitationActivityForegroundVoB = ogvInvitationActivityHostVo.b();
        if (ogvInvitationActivityForegroundVoB != null) {
            OgvActivityTextVo ogvActivityTextVo = ogvInvitationActivityForegroundVoB.f91458c;
            String str = ogvActivityTextVo.f91414a;
            if (!Intrinsics.areEqual(str, eVar.f91586f)) {
                eVar.f91586f = str;
                eVar.notifyPropertyChanged(237);
            }
            Integer num = ogvActivityTextVo.f91415b;
            if (num != null && (iIntValue3 = num.intValue()) != eVar.f91587g) {
                eVar.f91587g = iIntValue3;
                eVar.notifyPropertyChanged(238);
            }
            OgvActivityTextVo ogvActivityTextVo2 = ogvInvitationActivityForegroundVoB.f91459d;
            String str2 = ogvActivityTextVo2.f91414a;
            if (!Intrinsics.areEqual(str2, eVar.f91584d)) {
                eVar.f91584d = str2;
                eVar.notifyPropertyChanged(234);
            }
            Integer num2 = ogvActivityTextVo2.f91415b;
            if (num2 != null && (iIntValue2 = num2.intValue()) != eVar.f91585e) {
                eVar.f91585e = iIntValue2;
                eVar.notifyPropertyChanged(235);
            }
            String strA = ogvInvitationActivityForegroundVoB.a();
            if (!Intrinsics.areEqual(strA, eVar.f91583c)) {
                eVar.f91583c = strA;
                eVar.notifyPropertyChanged(236);
            }
        }
        OgvInvitationActivityBackgroundVo ogvInvitationActivityBackgroundVoA = ogvInvitationActivityHostVo.a();
        if (ogvInvitationActivityBackgroundVoA != null) {
            String strB = ogvInvitationActivityBackgroundVoA.b();
            if (!Intrinsics.areEqual(strB, eVar.h)) {
                eVar.h = strB;
                eVar.notifyPropertyChanged(35);
            }
            OgvActivityTextVo ogvActivityTextVo3 = ogvInvitationActivityBackgroundVoA.f91444e;
            String str3 = ogvActivityTextVo3.f91414a;
            if (!Intrinsics.areEqual(str3, eVar.f91593n)) {
                eVar.f91593n = str3;
                eVar.notifyPropertyChanged(37);
            }
            Integer num3 = ogvActivityTextVo3.f91415b;
            if (num3 != null && (iIntValue = num3.intValue()) != eVar.f91594o) {
                eVar.f91594o = iIntValue;
                eVar.notifyPropertyChanged(38);
            }
            int i7 = ogvInvitationActivityBackgroundVoA.f91445f;
            int i8 = ogvInvitationActivityBackgroundVoA.f91446g;
            String string = context.getString(2131848980, C4628q.a(i8 - i7, i8, "/"));
            if (!Intrinsics.areEqual(string, eVar.f91588i)) {
                eVar.f91588i = string;
                eVar.notifyPropertyChanged(33);
            }
            int i9 = ogvInvitationActivityBackgroundVoA.h;
            int i10 = ogvInvitationActivityBackgroundVoA.f91447i;
            int i11 = i10 - i9;
            if (i11 != eVar.f91591l) {
                eVar.f91591l = i11;
                eVar.notifyPropertyChanged(SearchBangumiItem.TYPE_FULLNET_VARIETY);
            }
            if (i10 != eVar.f91592m) {
                eVar.f91592m = i10;
                eVar.notifyPropertyChanged(SearchBangumiItem.TYPE_FULLNET_MOVIE);
            }
            String strA2 = ogvInvitationActivityBackgroundVoA.a();
            if (!Intrinsics.areEqual(strA2, eVar.f91595p)) {
                eVar.f91595p = strA2;
                eVar.notifyPropertyChanged(22);
            }
            Resources resources = context.getResources();
            int i12 = ogvInvitationActivityBackgroundVoA.f91452n;
            String quantityString = resources.getQuantityString(2131689759, i12, String.valueOf(i12));
            if (!Intrinsics.areEqual(quantityString, eVar.f91589j)) {
                eVar.f91589j = quantityString;
                eVar.notifyPropertyChanged(522);
            }
        }
        this.f91565p = eVar;
        abstractC9225eInflate.q(eVar);
        abstractC9225eInflate.f130675x.f130774w.setOnClickListener(new k(this, 2));
        abstractC9225eInflate.f130674w.f130754z.setOnClickListener(new m(this, 1));
        return abstractC9225eInflate.getRoot();
    }

    public final void setUiBeforeShow() {
        BuildersKt.launch$default(this.f91566q, (CoroutineContext) null, (CoroutineStart) null, new C61491(this, null), 3, (Object) null);
    }

    public final void show() {
        new Handler(Looper.getMainLooper()).post(new Runnable(this) { // from class: com.bilibili.ship.theseus.ogv.activity.invitation.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final OgvInvitationActivityBottomDialog f91578a;

            {
                this.f91578a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                OgvInvitationActivityBottomDialog.a(this.f91578a);
            }
        });
        if (this.f91560k.b() != null) {
            this.f91568s.setStartDelay(this.f91560k.b().f91460e);
            this.f91568s.start();
            BuildersKt.launch$default(this.f91564o, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        }
    }
}
