package com.bilibili.tgwt.im.ui;

import DD0.AbstractC1540m;
import HD0.A;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import androidx.lifecycle.ViewModelProvider;
import com.bilibili.ad.core.click.K;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.theme.R$color;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.search2.api.SearchBangumiItem;
import com.bilibili.tgwt.api.ChatRoomOperationService;
import com.bilibili.tgwt.chatroom.ChatRoomManagerService;
import com.bilibili.tgwt.ui.TogetherWatchDetailPageViewModel;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kntr.base.android.legacy.context.ContextUtilKt;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/CinemaSettingsDialog.class */
@StabilityInferred(parameters = 0)
public final class CinemaSettingsDialog extends Wj0.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f111241q = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final ChatRoomOperationService f111242k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final AbstractC1540m f111243l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TogetherWatchDetailPageViewModel f111244m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final A f111245n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f111246o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public Job f111247p;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/CinemaSettingsDialog$a.class */
    public static final class a implements DialogInterface.OnKeyListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CinemaSettingsDialog f111248a;

        public a(CinemaSettingsDialog cinemaSettingsDialog) {
            this.f111248a = cinemaSettingsDialog;
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public final boolean onKey(DialogInterface dialogInterface, int i7, KeyEvent keyEvent) {
            if (i7 != 4) {
                return false;
            }
            this.f111248a.dismiss();
            return true;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/CinemaSettingsDialog$b.class */
    public static final class b implements TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CinemaSettingsDialog f111249a;

        public b(CinemaSettingsDialog cinemaSettingsDialog) {
            this.f111249a = cinemaSettingsDialog;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            if (editable == null || editable.length() == 0) {
                ObservableField<Drawable> observableField = this.f111249a.f111245n.f8160d;
                GradientDrawable gradientDrawable = new GradientDrawable();
                CinemaSettingsDialog cinemaSettingsDialog = this.f111249a;
                gradientDrawable.setCornerRadius(Uj0.c.a(22.0f, cinemaSettingsDialog.getContext()));
                gradientDrawable.setColor(ContextCompat.getColor(cinemaSettingsDialog.getContext(), R$color.Pi3));
                observableField.set(gradientDrawable);
                this.f111249a.f111245n.f8161e.set("0/100");
                return;
            }
            ObservableField<Drawable> observableField2 = this.f111249a.f111245n.f8160d;
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            CinemaSettingsDialog cinemaSettingsDialog2 = this.f111249a;
            gradientDrawable2.setCornerRadius(Uj0.c.a(22.0f, cinemaSettingsDialog2.getContext()));
            gradientDrawable2.setColor(ContextCompat.getColor(cinemaSettingsDialog2.getContext(), R$color.Pi5));
            observableField2.set(gradientDrawable2);
            CinemaSettingsDialog cinemaSettingsDialog3 = this.f111249a;
            String string = editable.toString();
            cinemaSettingsDialog3.getClass();
            int i7 = 0;
            for (int i8 = 0; i8 < string.length(); i8++) {
                char cCharAt = string.charAt(i8);
                i7 = (Intrinsics.compare(cCharAt, 32) <= 0 || Intrinsics.compare(cCharAt, SearchBangumiItem.TYPE_FULLNET_BANGUMI) >= 0) ? i7 + 2 : i7 + 1;
            }
            int i9 = (i7 % 2) + (i7 / 2);
            if (i9 <= 100) {
                this.f111249a.f111245n.f8161e.set(i9 + "/100");
            } else {
                this.f111249a.f111245n.f8161e.set("100/100");
            }
            this.f111249a.f111243l.f2566w.setFilters(new InputFilter[]{new Object()});
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        }
    }

    /* JADX INFO: renamed from: com.bilibili.tgwt.im.ui.CinemaSettingsDialog$onContentChanged$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/CinemaSettingsDialog$onContentChanged$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CinemaSettingsDialog this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CinemaSettingsDialog cinemaSettingsDialog, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = cinemaSettingsDialog;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r0v10, types: [android.app.Dialog, com.bilibili.tgwt.im.ui.CinemaSettingsDialog] */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (DelayKt.delay(100L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ?? r02 = this.this$0;
            r02.f111245n.f8158b.set(RangesKt.coerceAtMost(Nl0.f.j(r02.getContext()), this.this$0.getContext().getResources().getDisplayMetrics().heightPixels));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.tgwt.im.ui.CinemaSettingsDialog$setUiBeforeShow$7, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/CinemaSettingsDialog$setUiBeforeShow$7.class */
    public static final class AnonymousClass7 extends SuspendLambda implements Function2<com.bilibili.tgwt.chatroom.c, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final CinemaSettingsDialog this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(CinemaSettingsDialog cinemaSettingsDialog, Continuation<? super AnonymousClass7> continuation) {
            super(2, continuation);
            this.this$0 = cinemaSettingsDialog;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass7 anonymousClass7 = new AnonymousClass7(this.this$0, continuation);
            anonymousClass7.L$0 = obj;
            return anonymousClass7;
        }

        public final Object invoke(com.bilibili.tgwt.chatroom.c cVar, Continuation<? super Unit> continuation) {
            return create(cVar, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            com.bilibili.tgwt.chatroom.c cVar = (com.bilibili.tgwt.chatroom.c) this.L$0;
            ObservableBoolean observableBoolean = this.this$0.f111245n.f8163g;
            boolean z6 = true;
            if (cVar.f110973b != 1) {
                z6 = false;
            }
            observableBoolean.set(z6);
            return Unit.INSTANCE;
        }
    }

    public CinemaSettingsDialog(@NotNull Context context) {
        super(context);
        this.f111242k = (ChatRoomOperationService) ServiceGenerator.createService(ChatRoomOperationService.class);
        this.f111243l = AbstractC1540m.inflate(LayoutInflater.from(context), null, false);
        this.f111245n = new A();
        this.f111246o = K.a((Job) null, 1, (Object) null, Dispatchers.getMain().getImmediate());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onContentChanged() {
        super/*android.app.Dialog*/.onContentChanged();
        BuildersKt.launch$default(this.f111246o, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final View onCreateView() {
        this.f111244m = (TogetherWatchDetailPageViewModel) new ViewModelProvider(ContextUtilKt.requireFragmentActivity(getContext())).get(TogetherWatchDetailPageViewModel.class);
        setOnKeyListener(new a(this));
        setOnDismissListener(new DialogInterface.OnDismissListener(this) { // from class: com.bilibili.tgwt.im.ui.o

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CinemaSettingsDialog f111310a;

            {
                this.f111310a = this;
            }

            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                CinemaSettingsDialog cinemaSettingsDialog = this.f111310a;
                TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = null;
                CoroutineScopeKt.cancel$default(cinemaSettingsDialog.f111246o, (CancellationException) null, 1, (Object) null);
                TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = cinemaSettingsDialog.f111244m;
                if (togetherWatchDetailPageViewModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                } else {
                    togetherWatchDetailPageViewModel = togetherWatchDetailPageViewModel2;
                }
                togetherWatchDetailPageViewModel.getChatRoomManagerService().l(ChatRoomManagerService.HalfScreenChatPopLayerType.CINEMA_SETTING_POP_LAYER, false);
            }
        });
        return this.f111243l.getRoot();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v31, types: [com.bilibili.tgwt.im.ui.m] */
    /* JADX WARN: Type inference failed for: r1v32, types: [com.bilibili.tgwt.im.ui.n] */
    public final void setUiBeforeShow() {
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = this.f111244m;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
        if (togetherWatchDetailPageViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            togetherWatchDetailPageViewModel2 = null;
        }
        togetherWatchDetailPageViewModel2.getChatRoomManagerService().l(ChatRoomManagerService.HalfScreenChatPopLayerType.CINEMA_SETTING_POP_LAYER, true);
        this.f111243l.q(this.f111245n);
        ObservableField<Drawable> observableField = this.f111245n.f8157a;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadii(new float[]{Uj0.c.a(10.0f, getContext()), Uj0.c.a(10.0f, getContext()), Uj0.c.a(10.0f, getContext()), Uj0.c.a(10.0f, getContext()), 0.0f, 0.0f, 0.0f, 0.0f});
        gradientDrawable.setColor(ContextCompat.getColor(getContext(), R$color.f64616Wh0));
        observableField.set(gradientDrawable);
        ObservableField<Drawable> observableField2 = this.f111245n.f8159c;
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(Uj0.c.a(10.0f, getContext()));
        gradientDrawable2.setColor(ContextCompat.getColor(getContext(), R$color.Ga0_s));
        observableField2.set(gradientDrawable2);
        ObservableField<String> observableField3 = this.f111245n.f8162f;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel3 = this.f111244m;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel4 = togetherWatchDetailPageViewModel3;
        if (togetherWatchDetailPageViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            togetherWatchDetailPageViewModel4 = null;
        }
        observableField3.set((String) ((Pair) togetherWatchDetailPageViewModel4.getChatRoomManagerService().f110891E.getValue()).getFirst());
        this.f111243l.f2566w.addTextChangedListener(new b(this));
        ObservableField<Drawable> observableField4 = this.f111245n.f8160d;
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setCornerRadius(Uj0.c.a(22.0f, getContext()));
        gradientDrawable3.setColor(ContextCompat.getColor(getContext(), R$color.Pi3));
        observableField4.set(gradientDrawable3);
        A a7 = this.f111245n;
        a7.f8164i = new View.OnClickListener(this) { // from class: com.bilibili.tgwt.im.ui.m

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CinemaSettingsDialog f111308a;

            {
                this.f111308a = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [Wj0.a, android.app.Dialog, com.bilibili.tgwt.im.ui.CinemaSettingsDialog] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ?? r02 = this.f111308a;
                int i7 = CinemaSettingsDialog.f111241q;
                Neurons.reportClick$default(false, "pgc.watch-together-cinema.room-settings.notice-publish.click", (Map) null, 4, (Object) null);
                if (String.valueOf(r02.f111243l.f2566w.getText()).length() <= 0) {
                    ToastHelper.showToastShort(r02.getContext(), 2131836326);
                } else {
                    BuildersKt.launch$default(GlobalScope.INSTANCE, (CoroutineContext) null, (CoroutineStart) null, new CinemaSettingsDialog$setUiBeforeShow$5$1(r02, null), 3, (Object) null);
                    r02.dismiss();
                }
            }
        };
        a7.h = new View.OnClickListener(this) { // from class: com.bilibili.tgwt.im.ui.n

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CinemaSettingsDialog f111309a;

            {
                this.f111309a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CinemaSettingsDialog cinemaSettingsDialog = this.f111309a;
                int i7 = CinemaSettingsDialog.f111241q;
                Map mapCreateMapBuilder = MapsKt.createMapBuilder();
                mapCreateMapBuilder.put("room_state", !cinemaSettingsDialog.f111243l.f2568y.isChecked() ? "0" : "1");
                Unit unit = Unit.INSTANCE;
                Neurons.reportClick(false, "pgc.watch-together-cinema.room-settings.public-room.click", MapsKt.build(mapCreateMapBuilder));
                cinemaSettingsDialog.f111245n.f8163g.set(cinemaSettingsDialog.f111243l.f2568y.isChecked());
                boolean zIsChecked = cinemaSettingsDialog.f111243l.f2568y.isChecked();
                Job job = cinemaSettingsDialog.f111247p;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                cinemaSettingsDialog.f111247p = BuildersKt.launch$default(cinemaSettingsDialog.f111246o, (CoroutineContext) null, (CoroutineStart) null, new CinemaSettingsDialog$requestChatSettingPublicChange$1(cinemaSettingsDialog, zIsChecked, null), 3, (Object) null);
            }
        };
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel5 = this.f111244m;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel6 = togetherWatchDetailPageViewModel5;
        if (togetherWatchDetailPageViewModel5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            togetherWatchDetailPageViewModel6 = null;
        }
        FlowKt.launchIn(FlowKt.onEach(FlowKt.filterNotNull(togetherWatchDetailPageViewModel6.getChatRoomManagerService().f110924q), new AnonymousClass7(this, null)), this.f111246o);
    }
}
