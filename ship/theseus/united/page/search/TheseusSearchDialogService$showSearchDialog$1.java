package com.bilibili.ship.theseus.united.page.search;

import Ns0.b;
import Ns0.d;
import Ns0.f;
import Ns0.g;
import android.content.DialogInterface;
import android.view.View;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.playerbizcommonv2.widget.dialog.PlayerFullScreenDialogFragment;
import com.bilibili.playerbizcommonv2.widget.dialog.a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/search/TheseusSearchDialogService$showSearchDialog$1.class */
public final class TheseusSearchDialogService$showSearchDialog$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final d $provider;
    final String $url;
    private Object L$0;
    Object L$1;
    int label;
    final TheseusSearchDialogService this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/search/TheseusSearchDialogService$showSearchDialog$1$a.class */
    public static final class a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TheseusSearchDialogService f103010a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.bilibili.search2.halfscreen.d f103011b;

        public a(TheseusSearchDialogService theseusSearchDialogService, com.bilibili.search2.halfscreen.d dVar) {
            this.f103010a = theseusSearchDialogService;
            this.f103011b = dVar;
        }

        public final void onSlide(View view, float f7) {
            this.f103011b.a(new b.a(RangesKt.coerceAtLeast(view.getHeight() - view.getTop(), 0), f7));
        }

        public final void onStateChanged(View view, int i7) {
            TheseusSearchDialogService theseusSearchDialogService = this.f103010a;
            int i8 = 3;
            if (i7 == 3) {
                theseusSearchDialogService.f103007d.h("TheseusSearchDialogService");
            } else {
                theseusSearchDialogService.f103007d.i("TheseusSearchDialogService");
            }
            if (i7 == 1) {
                i8 = 4;
            } else if (i7 == 3) {
                i8 = 2;
            } else if (i7 == 4) {
                i8 = 1;
            } else if (i7 != 5) {
                if (i7 != 6) {
                    return;
                }
                i8 = 1;
            }
            this.f103011b.a(new b.d(i8));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/search/TheseusSearchDialogService$showSearchDialog$1$b.class */
    public static final class b<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.bilibili.search2.halfscreen.d f103012a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PlayerFullScreenDialogFragment f103013b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CoroutineScope f103014c;

        public b(com.bilibili.search2.halfscreen.d dVar, PlayerFullScreenDialogFragment playerFullScreenDialogFragment, CoroutineScope coroutineScope) {
            this.f103012a = dVar;
            this.f103013b = playerFullScreenDialogFragment;
            this.f103014c = coroutineScope;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        /* JADX WARN: Type inference failed for: r0v5, types: [androidx.fragment.app.Fragment, com.bilibili.playerbizcommonv2.widget.dialog.PlayerFullScreenDialogFragment] */
        public final Object emit(Object obj, Continuation continuation) throws NoWhenBranchMatchedException {
            f fVar = (f) obj;
            boolean z6 = fVar instanceof f.a;
            ?? r02 = this.f103013b;
            if (z6) {
                this.f103012a.a(b.C0099b.f17433a);
                r02.of(null);
                if (r02.isAdded() && !r02.isRemoving()) {
                    r02.dismissAllowingStateLoss();
                }
                CoroutineScopeKt.cancel$default(this.f103014c, (CancellationException) null, 1, (Object) null);
            } else {
                if (!(fVar instanceof f.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                r02.mf();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusSearchDialogService$showSearchDialog$1(d dVar, String str, TheseusSearchDialogService theseusSearchDialogService, Continuation<? super TheseusSearchDialogService$showSearchDialog$1> continuation) {
        super(2, continuation);
        this.$provider = dVar;
        this.$url = str;
        this.this$0 = theseusSearchDialogService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(TheseusSearchDialogService theseusSearchDialogService, DialogInterface dialogInterface) {
        Job job = theseusSearchDialogService.f103009f;
        if (job != null) {
            if (!job.isActive()) {
                job = null;
            }
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
        }
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TheseusSearchDialogService$showSearchDialog$1 theseusSearchDialogService$showSearchDialog$1 = new TheseusSearchDialogService$showSearchDialog$1(this.$provider, this.$url, this.this$0, continuation);
        theseusSearchDialogService$showSearchDialog$1.L$0 = obj;
        return theseusSearchDialogService$showSearchDialog$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v56, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v59, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v63 */
    /* JADX WARN: Type inference failed for: r0v71 */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th;
        com.bilibili.search2.halfscreen.d dVar;
        PlayerFullScreenDialogFragment playerFullScreenDialogFragment;
        PlayerFullScreenDialogFragment playerFullScreenDialogFragment2;
        PlayerFullScreenDialogFragment playerFullScreenDialogFragment3;
        Ns0.a aVar;
        Ns0.a aVar2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            g gVarA = this.$provider.a(this.$url);
            PlayerFullScreenDialogFragment playerFullScreenDialogFragmentA = PlayerFullScreenDialogFragment.a.a(this.this$0.f103006c, new a.C0541a(gVarA.f17443a), new Pr0.b(gVarA.f17444b.f17439a == 1 ? 0 : DimenUtilsKt.dpToPx(40), 0.5f, 0, (Integer) null, 28));
            if (playerFullScreenDialogFragmentA == null) {
                return Unit.INSTANCE;
            }
            final TheseusSearchDialogService theseusSearchDialogService = this.this$0;
            playerFullScreenDialogFragmentA.of(new DialogInterface.OnDismissListener(theseusSearchDialogService) { // from class: com.bilibili.ship.theseus.united.page.search.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final TheseusSearchDialogService f103015a;

                {
                    this.f103015a = theseusSearchDialogService;
                }

                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    TheseusSearchDialogService$showSearchDialog$1.invokeSuspend$lambda$0(this.f103015a, dialogInterface);
                }
            });
            TheseusSearchDialogService theseusSearchDialogService2 = this.this$0;
            com.bilibili.search2.halfscreen.d dVar2 = gVarA.f17447e;
            playerFullScreenDialogFragmentA.nf(new a(theseusSearchDialogService2, dVar2));
            try {
                SharedFlow<f> sharedFlow = gVarA.f17445c;
                b bVar = new b(dVar2, playerFullScreenDialogFragmentA, coroutineScope);
                this.L$0 = dVar2;
                this.L$1 = playerFullScreenDialogFragmentA;
                this.label = 1;
                if (sharedFlow.collect(bVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                playerFullScreenDialogFragment2 = playerFullScreenDialogFragmentA;
                aVar2 = dVar2;
            } catch (Throwable th2) {
                th = th2;
                dVar = dVar2;
                playerFullScreenDialogFragment = playerFullScreenDialogFragmentA;
                dVar.a(b.C0099b.f17433a);
                dVar.a(b.c.f17434a);
                playerFullScreenDialogFragment.of(null);
                playerFullScreenDialogFragment.nf(null);
                this.this$0.f103007d.i("TheseusSearchDialogService");
                if (playerFullScreenDialogFragment.isAdded()) {
                    playerFullScreenDialogFragment.dismissAllowingStateLoss();
                }
                throw th;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            playerFullScreenDialogFragment2 = (PlayerFullScreenDialogFragment) this.L$1;
            Ns0.a aVar3 = (Ns0.a) this.L$0;
            playerFullScreenDialogFragment3 = playerFullScreenDialogFragment2;
            aVar = aVar3;
            try {
                ResultKt.throwOnFailure(obj);
                aVar2 = aVar3;
            } catch (Throwable th3) {
                th = th3;
                playerFullScreenDialogFragment = playerFullScreenDialogFragment3;
                dVar = aVar == true ? 1 : 0;
                dVar.a(b.C0099b.f17433a);
                dVar.a(b.c.f17434a);
                playerFullScreenDialogFragment.of(null);
                playerFullScreenDialogFragment.nf(null);
                this.this$0.f103007d.i("TheseusSearchDialogService");
                if (playerFullScreenDialogFragment.isAdded() && !playerFullScreenDialogFragment.isRemoving()) {
                    playerFullScreenDialogFragment.dismissAllowingStateLoss();
                }
                throw th;
            }
        }
        KotlinNothingValueException kotlinNothingValueException = new KotlinNothingValueException();
        playerFullScreenDialogFragment3 = playerFullScreenDialogFragment2;
        aVar = aVar2 == true ? 1 : 0;
        throw kotlinNothingValueException;
    }
}
