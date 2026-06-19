package com.bilibili.tgwt.im.ui;

import DD0.AbstractC1544q;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.ViewModelProvider;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.theme.R$color;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.tgwt.chatroom.ChatRoomManagerService;
import com.bilibili.tgwt.ui.TogetherWatchDetailPageViewModel;
import j5.C7642d;
import java.util.List;
import java.util.Map;
import kntr.base.android.legacy.context.ContextUtilKt;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/l.class */
@StabilityInferred(parameters = 0)
public final class l extends Dialog {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f111306b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final AbstractC1544q f111307a;

    public l(@NotNull Context context) {
        super(context);
        WindowManager.LayoutParams attributes = null;
        AbstractC1544q abstractC1544qInflate = AbstractC1544q.inflate(LayoutInflater.from(context), null, false);
        this.f111307a = abstractC1544qInflate;
        Window window = getWindow();
        if (window != null) {
            C7642d.a(window, 0);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.requestFeature(1);
        }
        setContentView(abstractC1544qInflate.getRoot());
        Window window3 = getWindow();
        attributes = window3 != null ? window3.getAttributes() : attributes;
        if (attributes != null) {
            attributes.width = Uj0.c.b(280, context);
        }
        if (attributes != null) {
            attributes.height = Math.min(Nl0.f.j(context), context.getResources().getDisplayMetrics().heightPixels) - Uj0.c.b(60, context);
        }
        Window window4 = getWindow();
        if (window4 != null) {
            window4.setAttributes(attributes);
        }
        Window window5 = getWindow();
        if (window5 != null) {
            window5.setGravity(17);
        }
        setCancelable(false);
        setCanceledOnTouchOutside(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v31, types: [android.view.View$OnTouchListener, java.lang.Object] */
    @Override // android.app.Dialog
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        final ChatRoomManagerService chatRoomManagerService = ((TogetherWatchDetailPageViewModel) new ViewModelProvider(ContextUtilKt.requireFragmentActivity(getContext())).get(TogetherWatchDetailPageViewModel.class)).getChatRoomManagerService();
        AbstractC1544q abstractC1544q = this.f111307a;
        Context context = getContext();
        HD0.z zVar = new HD0.z();
        String str = (String) ((Pair) chatRoomManagerService.f110891E.getValue()).getFirst();
        if (!Intrinsics.areEqual(str, zVar.f8344a)) {
            zVar.f8344a = str;
            zVar.notifyPropertyChanged(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_FACE_OCCLUSION_SEGMENT_RESULT_ROTATE);
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(ContextCompat.getColor(context, R$color.Ga11));
        float f7 = 8;
        gradientDrawable.setCornerRadius(Uj0.c.a(f7, context));
        if (!Intrinsics.areEqual(gradientDrawable, zVar.f8345b)) {
            zVar.f8345b = gradientDrawable;
            zVar.notifyPropertyChanged(161);
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(Uj0.c.a(17, context));
        gradientDrawable2.setColor(ContextCompat.getColor(context, R$color.Pi5));
        if (!Intrinsics.areEqual(gradientDrawable2, zVar.f8347d)) {
            zVar.f8347d = gradientDrawable2;
            zVar.notifyPropertyChanged(8);
        }
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setCornerRadius(Uj0.c.a(f7, context));
        gradientDrawable3.setColor(ContextCompat.getColor(context, R$color.Ga0_s));
        if (!Intrinsics.areEqual(gradientDrawable3, zVar.f8346c)) {
            zVar.f8346c = gradientDrawable3;
            zVar.notifyPropertyChanged(115);
        }
        abstractC1544q.q(zVar);
        this.f111307a.f2601w.setOnClickListener(new View.OnClickListener(chatRoomManagerService, this) { // from class: com.bilibili.tgwt.im.ui.j

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ChatRoomManagerService f111304a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final l f111305b;

            {
                this.f111304a = chatRoomManagerService;
                this.f111305b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChatRoomManagerService chatRoomManagerService2 = this.f111304a;
                l lVar = this.f111305b;
                int i7 = l.f111306b;
                MutableStateFlow<Pair<String, Boolean>> mutableStateFlow = chatRoomManagerService2.f110891E;
                mutableStateFlow.setValue(new Pair(((Pair) mutableStateFlow.getValue()).getFirst(), Boolean.FALSE));
                lVar.dismiss();
            }
        });
        this.f111307a.f2602x.setMovementMethod(ScrollingMovementMethod.getInstance());
        this.f111307a.f2602x.setOnTouchListener(new Object());
        Neurons.reportExposure$default(false, getContext().getResources().getConfiguration().orientation == 2 ? "pgc.watch-together-fullscreen-cinema.chat-zone.notice.show" : "pgc.watch-together-cinema.cinema-im.notice.show", (Map) null, (List) null, 12, (Object) null);
    }
}
