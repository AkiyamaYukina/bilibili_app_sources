package com.bilibili.ogv.story;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bilibili.community.follow.FollowSeasonStatus;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.neuron.api.Neurons;
import com.google.android.material.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import java.util.HashMap;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function5;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/story/OgvStorySeasonListDialog.class */
@StabilityInferred(parameters = 0)
public final class OgvStorySeasonListDialog extends BottomSheetDialog {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f73031n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f73032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final StateFlow<Long> f73033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f73034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f73035d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f73036e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f73037f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f73038g;

    @NotNull
    public final yJ0.c h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f73039i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f73040j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final DK.a f73041k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final OgvStoryEpisodeListVm f73042l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final t f73043m;

    /* JADX INFO: renamed from: com.bilibili.ogv.story.OgvStorySeasonListDialog$onStart$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/story/OgvStorySeasonListDialog$onStart$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OgvStorySeasonListDialog this$0;

        /* JADX INFO: renamed from: com.bilibili.ogv.story.OgvStorySeasonListDialog$onStart$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/story/OgvStorySeasonListDialog$onStart$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final OgvStorySeasonListDialog f73044a;

            public a(OgvStorySeasonListDialog ogvStorySeasonListDialog) {
                this.f73044a = ogvStorySeasonListDialog;
            }

            public final Object emit(Object obj, Continuation continuation) {
                this.f73044a.f73042l.o(((Number) obj).longValue());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OgvStorySeasonListDialog ogvStorySeasonListDialog, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ogvStorySeasonListDialog;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
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
                OgvStorySeasonListDialog ogvStorySeasonListDialog = this.this$0;
                StateFlow<Long> stateFlow = ogvStorySeasonListDialog.f73033b;
                a aVar = new a(ogvStorySeasonListDialog);
                this.label = 1;
                if (stateFlow.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public OgvStorySeasonListDialog(@NotNull final Context context, long j7, @NotNull StateFlow stateFlow, int i7, @NotNull String str, @NotNull String str2, @NotNull String str3, int i8, @NotNull Function5 function5, @NotNull yJ0.c cVar, @NotNull Function0 function0, @NotNull Function0 function02, @NotNull DK.a aVar) {
        super(context);
        this.f73032a = j7;
        this.f73033b = stateFlow;
        this.f73034c = i7;
        this.f73035d = str;
        this.f73036e = str2;
        this.f73037f = str3;
        this.f73038g = i8;
        this.h = cVar;
        this.f73039i = function0;
        this.f73040j = function02;
        this.f73041k = aVar;
        this.f73043m = new t(this);
        u uVar = new u(this, function5);
        Window window = getWindow();
        if (window != null) {
            window.clearFlags(2);
        }
        Gl0.k kVarInflate = Gl0.k.inflate(LayoutInflater.from(context));
        OgvStoryEpisodeListVm ogvStoryEpisodeListVm = new OgvStoryEpisodeListVm(context, j7, ((Number) stateFlow.getValue()).longValue(), uVar, str2, str, str3, new Function0(this, context) { // from class: com.bilibili.ogv.story.p

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final OgvStorySeasonListDialog f73107a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Context f73108b;

            {
                this.f73107a = this;
                this.f73108b = context;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.LifecycleOwner, com.bilibili.ogv.story.OgvStorySeasonListDialog] */
            public final Object invoke() {
                Context context2 = this.f73108b;
                ?? r02 = this.f73107a;
                Neurons.reportClick(false, "main.ugc-video-detail-vertical.content-select-panel.bangumi-follow.click", r02.j());
                if (BiliAccounts.get(context2).isLogin()) {
                    long j8 = r02.f73032a;
                    com.bilibili.community.follow.c cVar2 = com.bilibili.community.follow.c.a;
                    com.bilibili.community.follow.b bVar = (com.bilibili.community.follow.b) com.bilibili.community.follow.c.c.c(com.bilibili.community.follow.c.a(j8));
                    com.bilibili.community.follow.b bVar2 = bVar;
                    if (bVar == null) {
                        bVar2 = new com.bilibili.community.follow.b(false, FollowSeasonStatus.UNKNOWN);
                    }
                    BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(r02), (CoroutineContext) null, (CoroutineStart) null, new OgvStorySeasonListDialog$1$1(bVar2.a, r02, null), 3, (Object) null);
                } else {
                    com.bapis.bilibili.account.interfaces.v1.g.a(null, "activity://main/login/", 2, null);
                }
                return Unit.INSTANCE;
            }
        });
        com.bilibili.community.follow.c cVar2 = com.bilibili.community.follow.c.a;
        com.bilibili.community.follow.b bVar = (com.bilibili.community.follow.b) com.bilibili.community.follow.c.c.c(com.bilibili.community.follow.c.a(j7));
        ogvStoryEpisodeListVm.u((bVar == null ? new com.bilibili.community.follow.b(false, FollowSeasonStatus.UNKNOWN) : bVar).a);
        this.f73042l = ogvStoryEpisodeListVm;
        kVarInflate.q(ogvStoryEpisodeListVm);
        if (i8 != ogvStoryEpisodeListVm.f73026x) {
            ogvStoryEpisodeListVm.f73026x = i8;
            ogvStoryEpisodeListVm.notifyPropertyChanged(520);
        }
        getBehavior().setPeekHeight(i8);
        kVarInflate.f7183I.setOnClickListener(new HT0.a(this, 2));
        kVarInflate.f7187y.setOnClickListener(new View.OnClickListener(this) { // from class: com.bilibili.ogv.story.q

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final OgvStorySeasonListDialog f73109a;

            {
                this.f73109a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f73109a.k();
            }
        });
        setDismissWithAnimation(true);
        setOnShowListener(new DialogInterface.OnShowListener(this) { // from class: com.bilibili.ogv.story.r

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final OgvStorySeasonListDialog f73110a;

            {
                this.f73110a = this;
            }

            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                OgvStorySeasonListDialog ogvStorySeasonListDialog = this.f73110a;
                ogvStorySeasonListDialog.getBehavior().setState(4);
                ogvStorySeasonListDialog.f73039i.invoke();
            }
        });
        setOnDismissListener(new DialogInterface.OnDismissListener(this) { // from class: com.bilibili.ogv.story.s

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final OgvStorySeasonListDialog f73111a;

            {
                this.f73111a = this;
            }

            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f73111a.f73040j.invoke();
            }
        });
        setContentView(kVarInflate.getRoot());
        Window window2 = getWindow();
        FrameLayout frameLayout = window2 != null ? (FrameLayout) window2.findViewById(R.id.design_bottom_sheet) : null;
        if (frameLayout != null) {
            frameLayout.setBackgroundResource(android.R.color.transparent);
        }
        setCanceledOnTouchOutside(true);
        getBehavior().setSkipCollapsed(true);
    }

    public final HashMap<String, String> j() {
        return MapsKt.hashMapOf(new Pair[]{TuplesKt.to("spmid", this.f73036e), TuplesKt.to("from_spmid", this.f73035d), TuplesKt.to("trackid", this.f73037f), TuplesKt.to("goto", "vertical_pgc"), TuplesKt.to("r_id", String.valueOf(((Number) this.f73033b.getValue()).longValue()))});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k() {
        this.f73042l.v(true);
        this.f73042l.s(false);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new OgvStorySeasonListDialog$loadStorySeason$1(this, null), 3, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onStart() {
        super.onStart();
        getBehavior().addBottomSheetCallback(this.f73043m);
        getBehavior().setState(5);
        k();
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onStop() {
        super/*androidx.appcompat.app.AppCompatDialog*/.onStop();
        getBehavior().removeBottomSheetCallback(this.f73043m);
    }
}
