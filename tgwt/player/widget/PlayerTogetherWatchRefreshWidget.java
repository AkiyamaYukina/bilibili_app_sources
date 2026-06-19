package com.bilibili.tgwt.player.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.playerbizcommon.features.delegate.DelegateStoreService;
import com.bilibili.tgwt.service.ChatService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.injection.InjectPlayerService;
import tv.danmaku.biliplayerv2.widget.IControlWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/widget/PlayerTogetherWatchRefreshWidget.class */
@StabilityInferred(parameters = 0)
public final class PlayerTogetherWatchRefreshWidget extends AppCompatTextView implements IControlWidget, View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @InjectPlayerService
    private DelegateStoreService f111754a;

    @JvmOverloads
    public PlayerTogetherWatchRefreshWidget(@NotNull Context context) {
        this(context, null);
    }

    @JvmOverloads
    public PlayerTogetherWatchRefreshWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Nullable
    public final Object bindToView(@NotNull Continuation<? super Unit> continuation) {
        setOnClickListener(this);
        return Unit.INSTANCE;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        DelegateStoreService delegateStoreService = this.f111754a;
        DelegateStoreService delegateStoreService2 = delegateStoreService;
        if (delegateStoreService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegateStoreService");
            delegateStoreService2 = null;
        }
        ((ChatService) dm.d.b(delegateStoreService2, ChatService.class)).w();
    }
}
