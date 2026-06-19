package com.bilibili.tgwt.match.ui;

import DD0.AbstractC1545s;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CompoundButton;
import androidx.activity.ComponentDialog;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bilibili.bangumi.module.chatroom.TogetherWatchAuthorizeInfo;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.theme.R$color;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.tgwt.api.ChatRoomOperationService;
import j5.C7642d;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/match/ui/TogetherWatchAuthorizeDialog.class */
@StabilityInferred(parameters = 0)
public final class TogetherWatchAuthorizeDialog extends ComponentDialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ChatRoomOperationService f111476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final AbstractC1545s f111477b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v55, types: [android.view.View$OnTouchListener, java.lang.Object] */
    public TogetherWatchAuthorizeDialog(@NotNull Context context, @NotNull TogetherWatchAuthorizeInfo togetherWatchAuthorizeInfo) {
        super(context, 0, 2, null);
        WindowManager.LayoutParams attributes = null;
        this.f111476a = (ChatRoomOperationService) ServiceGenerator.createService(ChatRoomOperationService.class);
        AbstractC1545s abstractC1545sInflate = AbstractC1545s.inflate(LayoutInflater.from(context), null, false);
        this.f111477b = abstractC1545sInflate;
        Neurons.reportExposure$default(false, "pgc.watch-together-cinema.agreement.authorize.show", (Map) null, (List) null, 12, (Object) null);
        setContentView(abstractC1545sInflate.getRoot());
        Window window = getWindow();
        attributes = window != null ? window.getAttributes() : attributes;
        if (attributes != null) {
            attributes.width = Uj0.c.b(280, context);
        }
        if (attributes != null) {
            attributes.height = -2;
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setGravity(1);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setAttributes(attributes);
        }
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        Window window4 = getWindow();
        if (window4 != null) {
            C7642d.a(window4, 0);
        }
        JD0.c cVar = new JD0.c();
        String strD = togetherWatchAuthorizeInfo.d();
        if (!Intrinsics.areEqual(strD, cVar.f11237a)) {
            cVar.f11237a = strD;
            cVar.notifyPropertyChanged(640);
        }
        String strC = togetherWatchAuthorizeInfo.c();
        if (!Intrinsics.areEqual(strC, cVar.f11238b)) {
            cVar.f11238b = strC;
            cVar.notifyPropertyChanged(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_FACE_OCCLUSION_SEGMENT_RESULT_ROTATE);
        }
        String str = togetherWatchAuthorizeInfo.e.size() > 0 ? (String) togetherWatchAuthorizeInfo.e.get(0) : "";
        if (!Intrinsics.areEqual(str, cVar.f11239c)) {
            cVar.f11239c = str;
            cVar.notifyPropertyChanged(9);
        }
        String str2 = togetherWatchAuthorizeInfo.e.size() > 1 ? (String) togetherWatchAuthorizeInfo.e.get(1) : "";
        if (!Intrinsics.areEqual(str2, cVar.f11240d)) {
            cVar.f11240d = str2;
            cVar.notifyPropertyChanged(167);
        }
        String strB = togetherWatchAuthorizeInfo.b();
        if (!Intrinsics.areEqual(strB, cVar.f11244i)) {
            cVar.f11244i = strB;
            cVar.notifyPropertyChanged(99);
        }
        boolean zG = togetherWatchAuthorizeInfo.g();
        if (zG != cVar.f11246k) {
            cVar.f11246k = zG;
            cVar.notifyPropertyChanged(631);
        }
        boolean zE = togetherWatchAuthorizeInfo.e();
        if (zE != cVar.h) {
            cVar.h = zE;
            cVar.notifyPropertyChanged(98);
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(ContextCompat.getColor(context, R$color.Ga11));
        gradientDrawable.setCornerRadius(Uj0.c.a(8, context));
        if (!Intrinsics.areEqual(gradientDrawable, cVar.f11241e)) {
            cVar.f11241e = gradientDrawable;
            cVar.notifyPropertyChanged(161);
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        float f7 = 4;
        gradientDrawable2.setCornerRadius(Uj0.c.a(f7, context));
        gradientDrawable2.setStroke(Uj0.c.b(0.5f, context), ContextCompat.getColor(context, R$color.Line_bold));
        if (!Intrinsics.areEqual(gradientDrawable2, cVar.f11242f)) {
            cVar.f11242f = gradientDrawable2;
            cVar.notifyPropertyChanged(166);
        }
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setColor(ContextCompat.getColor(context, 2131103902));
        gradientDrawable3.setCornerRadius(Uj0.c.a(f7, context));
        if (!Intrinsics.areEqual(gradientDrawable3, cVar.f11243g)) {
            cVar.f11243g = gradientDrawable3;
            cVar.notifyPropertyChanged(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_FACE_OCCLUSION_SEGMENT_MAX_SIZE);
        }
        cVar.addOnPropertyChangedCallback(new JD0.b(cVar));
        abstractC1545sInflate.q(cVar);
        abstractC1545sInflate.f2622w.setOnClickListener(new View.OnClickListener(this) { // from class: com.bilibili.tgwt.match.ui.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TogetherWatchAuthorizeDialog f111500a;

            {
                this.f111500a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TogetherWatchAuthorizeDialog togetherWatchAuthorizeDialog = this.f111500a;
                JD0.c cVar2 = togetherWatchAuthorizeDialog.f111477b.f2621E;
                if ((cVar2 == null || !cVar2.h) && (cVar2 == null || !cVar2.f11246k)) {
                    if (cVar2 != null && true != cVar2.f11245j) {
                        cVar2.f11245j = true;
                        cVar2.notifyPropertyChanged(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_FACE_OCCLUSION_SEGMENT_RESULT_BLUR);
                    }
                    BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(togetherWatchAuthorizeDialog), (CoroutineContext) null, (CoroutineStart) null, new TogetherWatchAuthorizeDialog$1$2(togetherWatchAuthorizeDialog, null), 3, (Object) null);
                } else {
                    BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(togetherWatchAuthorizeDialog), (CoroutineContext) null, (CoroutineStart) null, new TogetherWatchAuthorizeDialog$1$1(togetherWatchAuthorizeDialog, null), 3, (Object) null);
                }
                Neurons.reportClick$default(false, "pgc.watch-together-cinema.agreement.authorize-button.click", (Map) null, 4, (Object) null);
            }
        });
        abstractC1545sInflate.f2618B.setOnClickListener(new View.OnClickListener(this) { // from class: com.bilibili.tgwt.match.ui.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TogetherWatchAuthorizeDialog f111501a;

            {
                this.f111501a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TogetherWatchAuthorizeDialog togetherWatchAuthorizeDialog = this.f111501a;
                BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(togetherWatchAuthorizeDialog), (CoroutineContext) null, (CoroutineStart) null, new TogetherWatchAuthorizeDialog$2$1(togetherWatchAuthorizeDialog, null), 3, (Object) null);
                Neurons.reportClick$default(false, "pgc.watch-together-cinema.agreement.unauthorized-button.click", (Map) null, 4, (Object) null);
            }
        });
        abstractC1545sInflate.f2625z.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: com.bilibili.tgwt.match.ui.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TogetherWatchAuthorizeDialog f111502a;

            {
                this.f111502a = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z6) {
                JD0.c cVar2 = this.f111502a.f111477b.f2621E;
                if (cVar2 == null || z6 == cVar2.h) {
                    return;
                }
                cVar2.h = z6;
                cVar2.notifyPropertyChanged(98);
            }
        });
        abstractC1545sInflate.f2619C.setMovementMethod(ScrollingMovementMethod.getInstance());
        abstractC1545sInflate.f2619C.setOnTouchListener(new Object());
    }
}
