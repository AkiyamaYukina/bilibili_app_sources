package com.bilibili.ship.theseus.united.page.interactvideo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import com.bilibili.ship.theseus.united.page.interactvideo.TheseusInteractVideoService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.ControlContainerType;
import tv.danmaku.biliplayerv2.ScreenModeType;
import tv.danmaku.biliplayerv2.injection.InjectPlayerService;
import tv.danmaku.biliplayerv2.service.ControlContainerObserver;
import tv.danmaku.biliplayerv2.service.FunctionWidgetConfig;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.widget.AbsFunctionWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/o.class */
@StabilityInferred(parameters = 0)
public final class o extends AbsFunctionWidget implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final TheseusInteractVideoService f99993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final BackActionRepository f99994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public View f99995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public View f99996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @InjectPlayerService
    private IControlContainerService f99997e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final a f99998f;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/o$a.class */
    public static final class a implements ControlContainerObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o f99999a;

        public a(o oVar) {
            this.f99999a = oVar;
        }

        public final void onControlContainerChanged(ControlContainerType controlContainerType, ScreenModeType screenModeType) {
            ScreenModeType screenModeType2 = ScreenModeType.THUMB;
            o oVar = this.f99999a;
            if (screenModeType == screenModeType2) {
                View view = oVar.f99996d;
                if (view != null) {
                    view.setVisibility(8);
                    return;
                }
                return;
            }
            View view2 = oVar.f99996d;
            if (view2 != null) {
                view2.setVisibility(0);
            }
        }
    }

    public o(@NotNull Context context, @NotNull TheseusInteractVideoService theseusInteractVideoService, @NotNull BackActionRepository backActionRepository) {
        super(context);
        this.f99993a = theseusInteractVideoService;
        this.f99994b = backActionRepository;
        this.f99998f = new a(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [android.view.View$OnTouchListener, java.lang.Object] */
    @NotNull
    public final View createContentView(@NotNull Context context) {
        if (this.f99995c == null) {
            View viewInflate = LayoutInflater.from(context).inflate(2131495152, (ViewGroup) null, false);
            this.f99995c = viewInflate;
            ((TextView) viewInflate.findViewById(2131301181)).setText(context.getString(2131851615));
            View viewFindViewById = this.f99995c.findViewById(2131296853);
            this.f99996d = viewFindViewById;
            viewFindViewById.setOnClickListener(this);
            this.f99995c.setOnTouchListener(new Object());
            this.f99995c.findViewById(2131301147).setOnClickListener(this);
        }
        return this.f99995c;
    }

    @NotNull
    public final FunctionWidgetConfig getFunctionWidgetConfig() {
        return new FunctionWidgetConfig.Builder().persistent(true).build();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@NotNull View view) {
        if (view.getId() == 2131301147) {
            TheseusInteractVideoService theseusInteractVideoService = this.f99993a;
            if (theseusInteractVideoService.f99869F == 99003) {
                theseusInteractVideoService.f99900q.c();
            } else {
                theseusInteractVideoService.h(TheseusInteractVideoService.a.d.f99915a);
            }
        }
        if (Intrinsics.areEqual(view, this.f99996d)) {
            this.f99994b.c(true);
        }
    }

    public final void onRelease() {
    }

    public final void onWidgetDismiss() {
        super.onWidgetDismiss();
        IControlContainerService iControlContainerService = this.f99997e;
        IControlContainerService iControlContainerService2 = iControlContainerService;
        if (iControlContainerService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("controlContainerService");
            iControlContainerService2 = null;
        }
        iControlContainerService2.unregisterState(this.f99998f);
    }

    public final void onWidgetShow() {
        super.onWidgetShow();
        IControlContainerService iControlContainerService = this.f99997e;
        IControlContainerService iControlContainerService2 = iControlContainerService;
        if (iControlContainerService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("controlContainerService");
            iControlContainerService2 = null;
        }
        iControlContainerService2.registerState(this.f99998f);
    }
}
