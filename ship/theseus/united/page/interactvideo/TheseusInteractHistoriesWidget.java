package com.bilibili.ship.theseus.united.page.interactvideo;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import javax.inject.Inject;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.service.IPlayDirector;
import tv.danmaku.biliplayerv2.service.Video;
import tv.danmaku.biliplayerv2.service.VideoDirectorObserver;
import tv.danmaku.biliplayerv2.widget.IControlWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/TheseusInteractHistoriesWidget.class */
@StabilityInferred(parameters = 0)
public final class TheseusInteractHistoriesWidget extends AppCompatTextView implements IControlWidget {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final e f99860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final IPlayDirector f99861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final a f99862c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/TheseusInteractHistoriesWidget$a.class */
    public static final class a implements VideoDirectorObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TheseusInteractHistoriesWidget f99863a;

        public a(TheseusInteractHistoriesWidget theseusInteractHistoriesWidget) {
            this.f99863a = theseusInteractHistoriesWidget;
        }

        public final void onItemStart(Video.PlayableParams playableParams) {
            this.f99863a.J();
        }

        public final void onPlayableParamsChanged(Video.PlayableParams playableParams) {
            this.f99863a.J();
        }
    }

    @Inject
    public TheseusInteractHistoriesWidget(@NotNull Context context, @NotNull e eVar, @NotNull IPlayDirector iPlayDirector) {
        super(context);
        this.f99860a = eVar;
        this.f99861b = iPlayDirector;
        setText(context.getString(2131845407));
        this.f99862c = new a(this);
    }

    public final void J() {
        Video.PlayableParams currentPlayableParams = this.f99861b.getCurrentPlayableParams();
        setVisibility((currentPlayableParams != null ? currentPlayableParams.getInteractParams() : null) != null ? 0 : 8);
    }

    public final void onWidgetActive() {
        J();
        this.f99861b.addVideoDirectorObserver(this.f99862c);
        setOnClickListener(new View.OnClickListener(this) { // from class: com.bilibili.ship.theseus.united.page.interactvideo.n

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TheseusInteractHistoriesWidget f99992a;

            {
                this.f99992a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LifecycleCoroutineScope lifecycleScope;
                TheseusInteractHistoriesWidget theseusInteractHistoriesWidget = this.f99992a;
                LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(view);
                if (lifecycleOwner == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) == null) {
                    return;
                }
                BuildersKt.launch$default(lifecycleScope, (CoroutineContext) null, (CoroutineStart) null, new TheseusInteractHistoriesWidget$onWidgetActive$1$1(theseusInteractHistoriesWidget, null), 3, (Object) null);
            }
        });
    }

    public final void onWidgetInactive() {
        this.f99861b.removeVideoDirectorObserver(this.f99862c);
        setOnClickListener(null);
    }
}
